package br.com.novomeioambiente.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.novomeioambiente.dao.DaoUsuario;
import br.com.novomeioambiente.modelo.Usuario;

@Path("/usuario")
public class UsuarioService {
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> getListaUsuario(){
		DaoUsuario dao = new DaoUsuario();
		return dao.listAll(Usuario.class);
	}
	
	@POST
	@Path("/novo")
	@Consumes({ MediaType.APPLICATION_JSON})
	public void addUsuario(Usuario cli) throws Throwable{
		DaoUsuario dao = new DaoUsuario();
		dao.salvar(cli);
	}
}
