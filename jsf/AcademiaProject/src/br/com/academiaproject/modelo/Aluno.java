package br.com.academiaproject.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the aluno database table.
 * 
 */
@Entity
@NamedQuery(name="Aluno.findAll", query="SELECT a FROM Aluno a")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idaluno;

	private String cpfaluno;

	private String emailaluno;

	private String nomealuno;

	//bi-directional many-to-one association to Venda
	@OneToMany(mappedBy="aluno")
	private List<Venda> vendas;

	public Aluno() {
	}

	public Integer getIdaluno() {
		return this.idaluno;
	}

	public void setIdaluno(Integer idaluno) {
		this.idaluno = idaluno;
	}

	public String getCpfaluno() {
		return this.cpfaluno;
	}

	public void setCpfaluno(String cpfaluno) {
		this.cpfaluno = cpfaluno;
	}

	public String getEmailaluno() {
		return this.emailaluno;
	}

	public void setEmailaluno(String emailaluno) {
		this.emailaluno = emailaluno;
	}

	public String getNomealuno() {
		return this.nomealuno;
	}

	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}

	public List<Venda> getVendas() {
		return this.vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Venda addVenda(Venda venda) {
		getVendas().add(venda);
		venda.setAluno(this);

		return venda;
	}

	public Venda removeVenda(Venda venda) {
		getVendas().remove(venda);
		venda.setAluno(null);

		return venda;
	}

}