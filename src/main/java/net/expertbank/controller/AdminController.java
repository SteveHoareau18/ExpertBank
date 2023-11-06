package net.expertbank.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.model.Administrator;
import net.expertbank.model.Client;
import net.expertbank.model.Operator;

@Path("/admin")
@RequestScoped
@Transactional
public class AdminController {
	
	@PersistenceContext
	private EntityManager em;
	
	@POST
	@Path("/generate/default")
	@Produces("application/json")
	public Response generateDefault() {	
		Administrator administrator = new Administrator();
		administrator.setActive(true).setEmail("steve.hoareau1@gmail.com").setFirstName("Steve").setName("Hoareau").setPhoneNumber("0692010203").setPassword("steve1234").setSalt("");
		em.persist(administrator);
		return Response.ok(administrator).build();
	}
	
	@POST
	@Path("/operator/create")
	@Produces("application/json")
	public Response operatorCreate(Operator operator) {
		em.persist(operator);
		
		return Response.ok(operator).build();
	}
	
	@PUT
	@Path("/operator/update")
	@Produces("application/json")
	public Response operatorUpdate(Operator operator) {
		
		em.merge(operator);
		
		return Response.ok(operator).status(202).build();
	}
}
