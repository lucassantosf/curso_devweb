package br.com.devmedia.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import org.jboss.weld.util.LazyValueHolder.Serializable;

import br.com.devmedia.dao.DaoUser;
import br.com.devmedia.modelo.User;

@ManagedBean
@ViewScoped
public class UserBean extends Serializable{

	private User usuario;
	private List<User> listaUsuarios;

	public UserBean() {
		usuario = new User();
	}

	public void salvar() throws Exception {
		DaoUser dao = new DaoUser();
		dao.salvar(usuario);
		FacesMessage fm = new FacesMessage("Salvo com Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		usuario = new User();
	}

	public List<User> getListaClientes() {
		DaoUser dao = new DaoUser();
		this.listaUsuarios = dao.listAll(User.class);
		return listaUsuarios;
	}

	public void setListaClientes(List<User> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public void editar() throws Exception {
		DaoUser dao = new DaoUser();
		dao.editar(usuario);
		FacesMessage fm = new FacesMessage("Alterado com Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		usuario = new User();
	}

	public void excluir() throws Exception {
		DaoUser dao = new DaoUser();
		dao.excluir(usuario);
		FacesMessage fm = new FacesMessage("Excluído com Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		usuario = new User();
	}

	public User getUsuario() {
		return usuario;
	}

	public void setCliente(User usuario) {
		this.usuario = usuario;
	}

	@Override
	protected Object computeValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
