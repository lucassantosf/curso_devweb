package br.com.academiaproject.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the plano database table.
 * 
 */
@Entity
@NamedQuery(name="Plano.findAll", query="SELECT p FROM Plano p")
public class Plano implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idplano;

	private String descplano;

	private double valorplano;
	/*
	//bi-directional many-to-one association to Itemvenda
	@OneToMany(mappedBy="plano")
	private List<Itemvenda> itemvendas;
	*/
	public Plano() {
	}

	public Integer getIdplano() {
		return this.idplano;
	}

	public void setIdplano(Integer idplano) {
		this.idplano = idplano;
	}

	public String getDescplano() {
		return this.descplano;
	}

	public void setDescplano(String descplano) {
		this.descplano = descplano;
	}

	public double getValorplano() {
		return this.valorplano;
	}

	public void setValorplano(double valorplano) {
		this.valorplano = valorplano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descplano == null) ? 0 : descplano.hashCode());
		result = prime * result + ((idplano == null) ? 0 : idplano.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorplano);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Plano other = (Plano) obj;
		if (descplano == null) {
			if (other.descplano != null)
				return false;
		} else if (!descplano.equals(other.descplano))
			return false;
		if (idplano == null) {
			if (other.idplano != null)
				return false;
		} else if (!idplano.equals(other.idplano))
			return false;
		if (Double.doubleToLongBits(valorplano) != Double.doubleToLongBits(other.valorplano))
			return false;
		return true;
	}
}