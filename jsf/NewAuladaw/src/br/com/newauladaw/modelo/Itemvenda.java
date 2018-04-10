package br.com.newauladaw.modelo;

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

	private int qtdeitemvenda;

	//bi-directional many-to-one association to Produto
	@ManyToOne
	private Produto produto;

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

	public int getQtdeitemvenda() {
		return this.qtdeitemvenda;
	}

	public void setQtdeitemvenda(int qtdeitemvenda) {
		this.qtdeitemvenda = qtdeitemvenda;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return this.venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}