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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cpfaluno == null) ? 0 : cpfaluno.hashCode());
		result = prime * result
				+ ((emailaluno == null) ? 0 : emailaluno.hashCode());
		result = prime * result + ((idaluno == null) ? 0 : idaluno.hashCode());
		result = prime * result
				+ ((nomealuno == null) ? 0 : nomealuno.hashCode());
		result = prime * result + ((vendas == null) ? 0 : vendas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpfaluno == null) {
			if (other.cpfaluno != null)
				return false;
		} else if (!cpfaluno.equals(other.cpfaluno))
			return false;
		if (emailaluno == null) {
			if (other.emailaluno != null)
				return false;
		} else if (!emailaluno.equals(other.emailaluno))
			return false;
		if (idaluno == null) {
			if (other.idaluno != null)
				return false;
		} else if (!idaluno.equals(other.idaluno))
			return false;
		if (nomealuno == null) {
			if (other.nomealuno != null)
				return false;
		} else if (!nomealuno.equals(other.nomealuno))
			return false;
		if (vendas == null) {
			if (other.vendas != null)
				return false;
		} else if (!vendas.equals(other.vendas))
			return false;
		return true;
	}

}