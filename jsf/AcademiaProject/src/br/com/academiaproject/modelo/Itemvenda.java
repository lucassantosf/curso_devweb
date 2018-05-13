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
	private Integer iditemvenda;

	private String itemvendacol;

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

	public String getItemvendacol() {
		return this.itemvendacol;
	}

	public void setItemvendacol(String itemvendacol) {
		this.itemvendacol = itemvendacol;
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

}