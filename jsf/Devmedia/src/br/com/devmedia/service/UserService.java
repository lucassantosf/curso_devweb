package br.com.devmedia.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.devmedia.dao.DaoUser;
import br.com.devmedia.modelo.User;

@Path("/cliente")
public class UserService {

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getListaCliente(){
		DaoUser dao = new DaoUser();
		return dao.listAll(User.class);
	}
	
}