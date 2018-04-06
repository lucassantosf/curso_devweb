package br.com.AulaAcesso.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_contatos database table.
 * 
 */
@Entity
@Table(name="tb_contatos")
@NamedQuery(name="TbContato.findAll", query="SELECT t FROM TbContato t")
public class TbContato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_contato")
	private Integer idContato;

	private String descricao;

	private String telefone;

	public TbContato() {
	}

	public Integer getIdContato() {
		return this.idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}