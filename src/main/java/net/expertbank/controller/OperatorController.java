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
import net.expertbank.model.AccountBank;
import net.expertbank.model.Client;
import net.expertbank.services.IbanService;

@Path("/operator")
@RequestScoped
@Transactional
public class OperatorController {
	
	@PersistenceContext
	private EntityManager em;
	
	@POST
	@Path("/client/create")
	@Produces("application/json")
	public Response clientCreate(Client client) {
		em.persist(client);
		AccountBank accountBank = new AccountBank();
		accountBank.setIBAN(IbanService.generateIBAN()).setUserAccount(client);
        em.persist(accountBank);
        return Response.ok(accountBank).build();
    }
	
	@PUT
	@Path("/client/update")
	@Produces("application/json")
	public Response clientUpdate(Client client) {
		
		em.merge(client);
		
		return Response.ok(client).status(202).build();
	}
}
