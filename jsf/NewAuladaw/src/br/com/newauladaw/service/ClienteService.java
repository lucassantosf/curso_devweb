package br.com.newauladaw.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.newauladaw.dao.DaoCliente;
import br.com.newauladaw.modelo.Cliente;

@Path("/cliente")
public class ClienteService {

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> getListaCliente(){
		DaoCliente dao = new DaoCliente();
		return dao.listAll(Cliente.class);
	}
	
}
