package net.expertbank.controller;

import java.util.Random;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.model.AccountBank;
import net.expertbank.model.User;

@Path("/users")
@RequestScoped
@Transactional
public class UserController {
	
	@PersistenceContext
	private EntityManager em;
	
	@GET
	@Path("/generate/default")
	@Produces("application/json")
	public Response generateDefault() {
		User user = new User();
		user.setEmail("steve.hoareau1@gmail.com").setFirstName("Steve").setName("HOAREAU").setPassword("steve1234").setPhoneNumber("0692000000").setSalt("");
		em.persist(user);
		
		AccountBank accountBank = new AccountBank();
		Random random = new Random();
		String CIN = 10+random.nextInt(80)+"";
		String Abi = 12345+random.nextInt(87653)+"";
		String Guichet = 12345+random.nextInt(87653)+"";
		String numeroCompte1 = 1234567891+random.nextInt(876543210)+"";
		String NumeroCompte2 = 2+random.nextInt(5)+"";
		String CleDeControle = 9+random.nextInt(89)+"";
		accountBank.setIBAN("FR"+CIN+Abi+Guichet+numeroCompte1+NumeroCompte2+CleDeControle).setUser(user);
		
		em.persist(accountBank);
		
		return Response.ok(accountBank).build();
	}
}
