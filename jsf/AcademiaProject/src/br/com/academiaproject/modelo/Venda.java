package br.com.academiaproject.modelo;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the venda database table.
 * 
 */
@Entity
@NamedQuery(name="Venda.findAll", query="SELECT v FROM Venda v")
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idvenda;

	@Temporal(TemporalType.DATE)
	private Date datavenda;

	//bi-directional many-to-one association to Itemvenda
	@OneToMany(mappedBy="venda")
	private List<Itemvenda> itemvendas;

	//bi-directional many-to-one association to Aluno
	@ManyToOne
	private Aluno aluno;

	public Venda() {
	}

	public Integer getIdvenda() {
		return this.idvenda;
	}

	public void setIdvenda(Integer idvenda) {
		this.idvenda = idvenda;
	}

	public Date getDatavenda() {
		return this.datavenda;
	}

	public void setDatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}

	public List<Itemvenda> getItemvendas() {
		return this.itemvendas;
	}

	public void setItemvendas(List<Itemvenda> itemvendas) {
		this.itemvendas = itemvendas;
	}

	public Itemvenda addItemvenda(Itemvenda itemvenda) {
		getItemvendas().add(itemvenda);
		itemvenda.setVenda(this);

		return itemvenda;
	}

	public Itemvenda removeItemvenda(Itemvenda itemvenda) {
		getItemvendas().remove(itemvenda);
		itemvenda.setVenda(null);

		return itemvenda;
	}

	public Aluno getAluno() {
		return this.aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result
				+ ((datavenda == null) ? 0 : datavenda.hashCode());
		result = prime * result + ((idvenda == null) ? 0 : idvenda.hashCode());
		result = prime * result
				+ ((itemvendas == null) ? 0 : itemvendas.hashCode());
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
		Venda other = (Venda) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (datavenda == null) {
			if (other.datavenda != null)
				return false;
		} else if (!datavenda.equals(other.datavenda))
			return false;
		if (idvenda == null) {
			if (other.idvenda != null)
				return false;
		} else if (!idvenda.equals(other.idvenda))
			return false;
		if (itemvendas == null) {
			if (other.itemvendas != null)
				return false;
		} else if (!itemvendas.equals(other.itemvendas))
			return false;
		return true;
	}

}