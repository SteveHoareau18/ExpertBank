package net.expertbank.controller;

import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.model.AccountBank;
import net.expertbank.model.Client;

@Path("/bank")
@RequestScoped
@Transactional
public class DefaultController {
	
	@PersistenceContext(unitName = "expertbank-persistence-unit")
	private EntityManager em;
	
	@GET
	@Produces("application/json")
	public Response myMoney(Client client) {
		if(client == null) return Response.status(404).entity("Client n'a pas été trouvé").build();
		List<AccountBank> results = em.createQuery("Select ab from AccountBank as ab", AccountBank.class).getResultList();
		if(results.stream().noneMatch(x->x.getUserAccount().getId()==client.getId())) return Response.status(404).entity("Compte bancaire n'a pas été trouvé").build();
		AccountBank accountBank = results.stream().filter(x->x.getUserAccount().getId()==client.getId()).findFirst().get();
		if(client.getSaltedPassword()==null) return Response.status(403).entity("Mot de passe invalide").build();
		//VALID
		if(accountBank.getUserAccount().getSaltedPassword().getPassword().equals(client.getSaltedPassword().getPassword()) &&
				accountBank.getUserAccount().getSaltedPassword().getSalt().equals(client.getSaltedPassword().getSalt()))
		return Response.ok().entity(accountBank).build();
		//
		return Response.status(403).entity("Mot de passe invalide").build();
	}
	
<<<<<<< HEAD
	@POST
	@Produces("application/json")
	@Path("/give/{receveur}/{montant}")
	public Response montantEnvoie (AccountBank accountBank, @PathParam("receveur") long client_id, @PathParam("montant") long montant) {
		
		accountBank.setMoney(accountBank.getMoney()-montant);
		AccountBank accountBankReceveur = em.createQuery("select ab from AccountBank as ab where member_id = ?",AccountBank.class).setParameter(1,client_id).getSingleResult();
		accountBankReceveur.setMoney(accountBankReceveur.getMoney()+montant);
		return Response.ok().entity(accountBank).build();
		}
=======
	@GET
	@Path("/test")
	public Response myMoney() {
		return Response.ok().entity("Hello world").build();
	}
>>>>>>> 9a77abbf38be87465ae83193fb20856940c16b6d
}
