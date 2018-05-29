package br.com.novomeioambiente.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.novomeioambiente.dao.DaoIdeia;
import br.com.novomeioambiente.modelo.Ideia;


@ManagedBean
@ViewScoped
public class IdeiaBean {
	
	private Ideia ideia;
	private List<Ideia> listaIdeias;
	
	public IdeiaBean() {
		ideia = new Ideia();
	}
	
	public void salvar() throws Exception{
		DaoIdeia dao = new DaoIdeia();
		dao.salvar(ideia);
		FacesMessage fm = new FacesMessage("Salvo com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		ideia = new Ideia();
	}
	
	public void excluir() throws Exception{
		DaoIdeia dao = new DaoIdeia();
		dao.excluir(ideia);
		FacesMessage fm = new FacesMessage("Excluido com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		ideia = new Ideia();
	}
	
	public void editar() throws Exception{
		DaoIdeia dao = new DaoIdeia();
		dao.editar(ideia);
		FacesMessage fm = new FacesMessage("Alterado com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		ideia = new Ideia();
	}

	public Ideia getIdeia() {
		return ideia;
	}

	public void setIdeia(Ideia Ideia) {
		this.ideia = Ideia;
	}

	public List<Ideia> getListaIdeias() {
		DaoIdeia dao = new DaoIdeia();
		this.listaIdeias = dao.listAll(Ideia.class);
		return listaIdeias;
	}

	public void setListaIdeias(List<Ideia> listaIdeias) {
		this.listaIdeias = listaIdeias;
	}
	
}
