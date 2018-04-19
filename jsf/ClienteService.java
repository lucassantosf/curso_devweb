package br.com.auladaw.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.auladaw.dao.DaoCliente;
import br.com.auladaw.modelo.Cliente;

@Path("/cliente")
public class ClienteService {

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> getListaCliente(){
		DaoCliente dao = new DaoCliente();
		return dao.listAll(Cliente.class);
	}
	
	@GET
	@Path("/buscar/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON })		
	public Cliente getCliente(@PathParam("empNo") String empNo){
		DaoCliente dao = new DaoCliente();
		Integer id = Integer.parseInt(empNo);
		return dao.consultarPorIdInt(Cliente.class, id);
	}
	
	@POST
	@Path("/novo")
	@Consumes({ MediaType.APPLICATION_JSON})
	public void addCliente(Cliente cli) throws Throwable{
		DaoCliente dao = new DaoCliente();
		dao.salvar(cli);
	}
	
	@POST
	@Path("/editar")
	@Consumes({MediaType.APPLICATION_JSON})
	public void editarCliente(Cliente cli) throws Throwable{
		DaoCliente dao = new DaoCliente();
		dao.editar(cli);
	}
	
	@DELETE
	@Path("/apagar/{empNo}")
	@Produces({MediaType.APPLICATION_JSON})
	public void excluirCliente(@PathParam("empNo") String empNo){
		DaoCliente dao = new DaoCliente();
		Integer id = Integer.parseInt(empNo);
		dao.removerInt(Cliente.class, id);		
	}
}
