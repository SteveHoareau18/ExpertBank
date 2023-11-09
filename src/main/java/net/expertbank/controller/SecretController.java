package net.expertbank.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.expertbank.services.JwtService;

@Path("/secret")
@Transactional
@RequestScoped
public class SecretController {
	
	@GET
	@Produces("application/json")
	public Response getToken() {
		return Response.ok(JwtService.getPrivateKey()).build();
	}
}
