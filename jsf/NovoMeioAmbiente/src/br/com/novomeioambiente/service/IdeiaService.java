package br.com.novomeioambiente.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.novomeioambiente.dao.DaoIdeia;
import br.com.novomeioambiente.modelo.Ideia;


@Path("/ideia")
public class IdeiaService {
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ideia> getListaIdeia(){
		DaoIdeia dao = new DaoIdeia();
		return dao.listAll(Ideia.class);
	}
	
	@GET
	@Path("/buscar/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON })		
	public Ideia getIdeia(@PathParam("empNo") String empNo){
		DaoIdeia dao = new DaoIdeia();
		Integer id = Integer.parseInt(empNo);
		return dao.consultarPorIdInt(Ideia.class, id);
	}
	
	@POST
	@Path("/novo")
	@Consumes({ MediaType.APPLICATION_JSON})
	public void addIdeia(Ideia cli) throws Throwable{
		DaoIdeia dao = new DaoIdeia();
		dao.salvar(cli);
	}
	
	@POST
	@Path("/editar")
	@Consumes({MediaType.APPLICATION_JSON})
	public void editarIdeia(Ideia cli) throws Throwable{
		DaoIdeia dao = new DaoIdeia();
		dao.editar(cli);
	}
	
	@DELETE
	@Path("/apagar/{empNo}")
	@Produces({MediaType.APPLICATION_JSON})
	public void excluirCliente(@PathParam("empNo") String empNo){
		DaoIdeia dao = new DaoIdeia();
		Integer id = Integer.parseInt(empNo);
		dao.removerInt(Ideia.class, id);		
	}
}
