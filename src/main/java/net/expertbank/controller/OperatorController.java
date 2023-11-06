package net.expertbank.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.model.Client;

@Path("/operator")
public class OperatorController {
	
	@PersistenceContext
	private EntityManager em;
	
	@POST
	@Path("/client/create")
	@Produces("application/json")
	public Response operatorCreate(Client client) {
		em.persist(client);
		
		return Response.ok(client).build();
	}
}
