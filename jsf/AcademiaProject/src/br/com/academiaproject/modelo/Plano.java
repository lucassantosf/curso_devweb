package br.com.academiaproject.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedQuery(name="Plano.findAll", query="SELECT p FROM Plano p")
public class Plano implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idplano;

	private String descplano;

	private double valorplano;
	
	/*//bi-directional many-to-one association to Itemvenda
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

}