package br.com.AulaAcesso.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.AulaAcesso.dao.ContatoDao;
import br.com.AulaAcesso.modelo.TbContato;
@ManagedBean
@ViewScoped
public class ContatosBean {
	private TbContato contato;
	private List<TbContato> listaContatos;
	
	public ContatosBean() {
		contato = new TbContato();
	}
	
	public void salvar() throws Exception{
		ContatoDao dao = new ContatoDao();
		dao.salvar(contato);
		FacesMessage fm = new FacesMessage("Salvo com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		contato = new TbContato();
	}
	
	public void excluir() throws Exception{
		ContatoDao dao = new ContatoDao();
		dao.excluir(contato);
		FacesMessage fm = new FacesMessage("Excluido com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		contato = new TbContato();
	}
	
	public void editar() throws Exception{
		ContatoDao dao = new ContatoDao();
		dao.editar(contato);
		FacesMessage fm = new FacesMessage("Alterado com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		contato = new TbContato();
	}

	public TbContato getContato() {
		return contato;
	}

	public void setContato(TbContato contato) {
		this.contato = contato;
	}

	public List<TbContato> getListaContatos() {
		ContatoDao dao = new ContatoDao();
		this.listaContatos = dao.listAll(TbContato.class);
		return listaContatos;
	}

	public void setListaClientes(List<TbContato> listaContatos) {
		this.listaContatos = listaContatos;
	}
}
