package br.com.newauladaw.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the produto database table.
 * 
 */
@Entity
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idproduto;

	private String descproduto;

	private double valorproduto;

	//bi-directional many-to-one association to Itemvenda
	@OneToMany(mappedBy="produto")
	private List<Itemvenda> itemvendas;

	public Produto() {
	}

	public Integer getIdproduto() {
		return this.idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getDescproduto() {
		return this.descproduto;
	}

	public void setDescproduto(String descproduto) {
		this.descproduto = descproduto;
	}

	public double getValorproduto() {
		return this.valorproduto;
	}

	public void setValorproduto(double valorproduto) {
		this.valorproduto = valorproduto;
	}

	public List<Itemvenda> getItemvendas() {
		return this.itemvendas;
	}

	public void setItemvendas(List<Itemvenda> itemvendas) {
		this.itemvendas = itemvendas;
	}

	public Itemvenda addItemvenda(Itemvenda itemvenda) {
		getItemvendas().add(itemvenda);
		itemvenda.setProduto(this);

		return itemvenda;
	}

	public Itemvenda removeItemvenda(Itemvenda itemvenda) {
		getItemvendas().remove(itemvenda);
		itemvenda.setProduto(null);

		return itemvenda;
	}

}