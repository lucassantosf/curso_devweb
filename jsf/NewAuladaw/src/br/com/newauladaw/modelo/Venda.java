package br.com.newauladaw.modelo;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idvenda;

	@Temporal(TemporalType.DATE)
	private Date datavenda;

	//bi-directional many-to-one association to Itemvenda
	@OneToMany(mappedBy="venda")
	private List<Itemvenda> itemvendas;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	private Cliente cliente;

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

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}