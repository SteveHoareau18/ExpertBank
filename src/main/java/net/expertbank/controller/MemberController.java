package net.expertbank.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.model.AccountBank;
import net.expertbank.model.Member;
import net.expertbank.services.IbanService;

@Path("/members")
@RequestScoped
@Transactional
public class MemberController {
	
	@PersistenceContext
	private EntityManager em;
	
	@POST
	@Path("/create")
	@Produces("application/json")
	public Response generateDefault(Member member) {
		em.persist(member);
		
		AccountBank accountBank = new AccountBank();

		accountBank.setIBAN(IbanService.generateIBAN()).setUserAccount(member);
		
		em.persist(accountBank);
		
		return Response.ok(accountBank).build();
	}
}
