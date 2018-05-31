package br.com.academiaproject.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.academiaproject.dao.DaoAluno;
import br.com.academiaproject.modelo.Aluno;

@ManagedBean
@ViewScoped
public class AlunoBean {
	private Aluno aluno;
	private List<Aluno> listaAlunos;
	
	public AlunoBean() {
		aluno = new Aluno();
	}
	
	public void salvar() throws Exception{
		DaoAluno dao = new DaoAluno();
		dao.salvar(aluno);
		FacesMessage fm = new FacesMessage("Salvo com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		aluno = new Aluno();
	}
	
	public void excluir() throws Exception{
		DaoAluno dao = new DaoAluno();
		dao.excluir(aluno);
		FacesMessage fm = new FacesMessage("Excluido com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		aluno = new Aluno();
	}
	
	public void editar() throws Exception{
		DaoAluno dao = new DaoAluno();
		dao.editar(aluno);
		FacesMessage fm = new FacesMessage("Alterado com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		aluno = new Aluno();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getListaClientes() {
		DaoAluno dao = new DaoAluno();
		this.listaAlunos = dao.listAll(Aluno.class);
		return listaAlunos;
	}

	public void setListaClientes(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
}
