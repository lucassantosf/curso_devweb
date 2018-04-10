package br.com.newauladaw.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcliente;

	private String cpfcnpjcliente;

	private String emailcliente;

	private String fonecliente;

	private String nomecliente;

	//bi-directional many-to-one association to Venda
	@OneToMany(mappedBy="cliente")
	private List<Venda> vendas;

	public Cliente() {
	}

	public Integer getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getCpfcnpjcliente() {
		return this.cpfcnpjcliente;
	}

	public void setCpfcnpjcliente(String cpfcnpjcliente) {
		this.cpfcnpjcliente = cpfcnpjcliente;
	}

	public String getEmailcliente() {
		return this.emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public String getFonecliente() {
		return this.fonecliente;
	}

	public void setFonecliente(String fonecliente) {
		this.fonecliente = fonecliente;
	}

	public String getNomecliente() {
		return this.nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public List<Venda> getVendas() {
		return this.vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Venda addVenda(Venda venda) {
		getVendas().add(venda);
		venda.setCliente(this);

		return venda;
	}

	public Venda removeVenda(Venda venda) {
		getVendas().remove(venda);
		venda.setCliente(null);

		return venda;
	}

}