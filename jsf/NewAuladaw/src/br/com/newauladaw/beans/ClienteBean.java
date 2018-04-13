package br.com.newauladaw.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import org.jboss.weld.util.LazyValueHolder.Serializable;

import br.com.newauladaw.dao.DaoCliente;
import br.com.newauladaw.modelo.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean extends Serializable{

	private Cliente cliente;
	private List<Cliente> listaClientes;

	public ClienteBean() {
		cliente = new Cliente();
	}

	public void salvar() throws Exception {
		DaoCliente dao = new DaoCliente();
		dao.salvar(cliente);
		FacesMessage fm = new FacesMessage("Salvo com Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		cliente = new Cliente();
	}

	public void excluir() throws Exception{  
		DaoCliente dao = new DaoCliente();  
		dao.excluir(cliente);  
		FacesMessage fm = new FacesMessage("Excluído com Sucesso");  
		FacesContext.getCurrentInstance().addMessage(null, fm);  
		cliente =  new Cliente();
	} 

	public void editar() throws Exception {
		DaoCliente dao = new DaoCliente();
		dao.editar(cliente);
		FacesMessage fm = new FacesMessage("Alterado com Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		DaoCliente dao = new DaoCliente();
		this.listaClientes = dao.listAll(Cliente.class);
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	protected Object computeValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
