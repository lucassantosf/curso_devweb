package br.com.AulaAcesso.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_usuario database table.
 * 
 */
@Entity
@Table(name="tb_usuario")
@NamedQuery(name="TbUsuario.findAll", query="SELECT t FROM TbUsuario t")
public class TbUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario")
	private Integer idUsuario;

	private String login;

	@Column(name="senha_usuario")
	private String senhaUsuario;

	@Column(name="tipo_perfil")
	private int tipoPerfil;

	public TbUsuario() {
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenhaUsuario() {
		return this.senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public int getTipoPerfil() {
		return this.tipoPerfil;
	}

	public void setTipoPerfil(int tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

}