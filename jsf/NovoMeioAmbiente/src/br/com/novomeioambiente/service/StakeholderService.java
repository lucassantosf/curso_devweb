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

import br.com.novomeioambiente.dao.DaoStakeholder;
import br.com.novomeioambiente.modelo.Stakeholder;



@Path("/stakeholder")
public class StakeholderService {
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Stakeholder> getListaStakeholder(){
		DaoStakeholder dao = new DaoStakeholder();
		return dao.listAll(Stakeholder.class);
	}
	
	@GET
	@Path("/buscar/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON })		
	public Stakeholder getStakeholder(@PathParam("empNo") String empNo){
		DaoStakeholder dao = new DaoStakeholder();
		Integer id = Integer.parseInt(empNo);
		return dao.consultarPorIdInt(Stakeholder.class, id);
	}
	
	@POST
	@Path("/novo")
	@Consumes({ MediaType.APPLICATION_JSON})
	public void addStakeholder(Stakeholder cli) throws Throwable{
		DaoStakeholder dao = new DaoStakeholder();
		dao.salvar(cli);
	}
	
	@POST
	@Path("/editar")
	@Consumes({MediaType.APPLICATION_JSON})
	public void editarStakeholder(Stakeholder cli) throws Throwable{
		DaoStakeholder dao = new DaoStakeholder();
		dao.editar(cli);
	}
	
	@DELETE
	@Path("/apagar/{empNo}")
	@Produces({MediaType.APPLICATION_JSON})
	public void excluirStakeholder(@PathParam("empNo") String empNo){
		DaoStakeholder dao = new DaoStakeholder();
		Integer id = Integer.parseInt(empNo);
		dao.removerInt(Stakeholder.class, id);		
	}
	
}
