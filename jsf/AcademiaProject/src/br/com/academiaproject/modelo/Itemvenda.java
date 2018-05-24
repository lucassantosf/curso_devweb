package br.com.academiaproject.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itemvenda database table.
 * 
 */
@Entity
@NamedQuery(name="Itemvenda.findAll", query="SELECT i FROM Itemvenda i")
public class Itemvenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iditemvenda;

	private int itemvendaqtd;

	//bi-directional many-to-one association to Plano
	@ManyToOne
	private Plano plano;

	//bi-directional many-to-one association to Venda
	@ManyToOne
	private Venda venda;

	public Itemvenda() {
	}

	public Integer getIditemvenda() {
		return this.iditemvenda;
	}

	public void setIditemvenda(Integer iditemvenda) {
		this.iditemvenda = iditemvenda;
	}

	public int getItemvendaqtd() {
		return this.itemvendaqtd;
	}

	public void setItemvendaqtd(int itemvendaqtd) {
		this.itemvendaqtd = itemvendaqtd;
	}

	public Plano getPlano() {
		return this.plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public Venda getVenda() {
		return this.venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((iditemvenda == null) ? 0 : iditemvenda.hashCode());
		result = prime * result + itemvendaqtd;
		result = prime * result + ((plano == null) ? 0 : plano.hashCode());
		result = prime * result + ((venda == null) ? 0 : venda.hashCode());
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
		Itemvenda other = (Itemvenda) obj;
		if (iditemvenda == null) {
			if (other.iditemvenda != null)
				return false;
		} else if (!iditemvenda.equals(other.iditemvenda))
			return false;
		if (itemvendaqtd != other.itemvendaqtd)
			return false;
		if (plano == null) {
			if (other.plano != null)
				return false;
		} else if (!plano.equals(other.plano))
			return false;
		if (venda == null) {
			if (other.venda != null)
				return false;
		} else if (!venda.equals(other.venda))
			return false;
		return true;
	}
}