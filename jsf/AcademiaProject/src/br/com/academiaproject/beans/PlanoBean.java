package br.com.academiaproject.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.academiaproject.dao.DaoPlano;
import br.com.academiaproject.modelo.Plano;



@ManagedBean
@ViewScoped
public class PlanoBean {
	private Plano plano;
	private List<Plano> listaPlanos;
	
	public PlanoBean() {
		plano = new Plano();
	}
	
	public void salvar() throws Exception{
		DaoPlano dao = new DaoPlano();
		dao.salvar(plano);
		FacesMessage fm = new FacesMessage("Novo modelo de plano foi salvo com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		plano = new Plano();
	}
	
	public void excluir() throws Exception{
		DaoPlano dao = new DaoPlano();
		dao.excluir(plano);
		FacesMessage fm = new FacesMessage("Modelo de plano foi excluido com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		plano = new Plano();
	}
	
	public void editar() throws Exception{
		DaoPlano dao = new DaoPlano();
		dao.editar(plano);
		FacesMessage fm = new FacesMessage("Modelo de plano alterado com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		plano = new Plano();
	}

	public Plano getPlano() {
		return plano;
	}


	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public List<Plano> getListaPlanos() {
		DaoPlano dao = new DaoPlano();
		this.listaPlanos = dao.listAll(Plano.class);
		return listaPlanos;
	}

	public void setListaClientes(List<Plano> listaPlanos) {
		this.listaPlanos = listaPlanos;
	}
}
