package br.com.novomeioambiente.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stakeholder database table.
 * 
 */
@Entity
@NamedQuery(name="Stakeholder.findAll", query="SELECT s FROM Stakeholder s")
public class Stakeholder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idstakeholder;

	private String cpfcnpj;

	private String email;

	private String nome;

	public Stakeholder() {
	}

	public Integer getIdstakeholder() {
		return this.idstakeholder;
	}

	public void setIdstakeholder(Integer idstakeholder) {
		this.idstakeholder = idstakeholder;
	}

	public String getCpfcnpj() {
		return this.cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfcnpj == null) ? 0 : cpfcnpj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idstakeholder == null) ? 0 : idstakeholder.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Stakeholder other = (Stakeholder) obj;
		if (cpfcnpj == null) {
			if (other.cpfcnpj != null)
				return false;
		} else if (!cpfcnpj.equals(other.cpfcnpj))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idstakeholder == null) {
			if (other.idstakeholder != null)
				return false;
		} else if (!idstakeholder.equals(other.idstakeholder))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}