package net.expertbank.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.model.User;

@Path("/users")
@Transactional
@RequestScoped
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
		return Response.ok(user).build();
	}
}
