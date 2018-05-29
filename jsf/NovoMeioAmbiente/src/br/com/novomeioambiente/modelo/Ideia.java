package br.com.novomeioambiente.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ideia database table.
 * 
 */
@Entity
@NamedQuery(name="Ideia.findAll", query="SELECT i FROM Ideia i")
public class Ideia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idideia;

	private String autor;

	private String descri;

	private String titulo;

	public Ideia() {
	}

	public Integer getIdideia() {
		return this.idideia;
	}

	public void setIdideia(Integer idideia) {
		this.idideia = idideia;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescri() {
		return this.descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descri == null) ? 0 : descri.hashCode());
		result = prime * result + ((idideia == null) ? 0 : idideia.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Ideia other = (Ideia) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (descri == null) {
			if (other.descri != null)
				return false;
		} else if (!descri.equals(other.descri))
			return false;
		if (idideia == null) {
			if (other.idideia != null)
				return false;
		} else if (!idideia.equals(other.idideia))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}