package br.com.academiaproject.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.academiaproject.dao.DaoAluno;
import br.com.academiaproject.modelo.Aluno;


@FacesConverter(forClass = Aluno.class)
public class AlunoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String codStr) {
		if(codStr != null && codStr.trim().length() > 0){
			Integer cod = Integer.valueOf(codStr);
			DaoAluno dao = new DaoAluno();
			return dao.consultarPorIdInt(Aluno.class, cod);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		if(obj!= null){
			Aluno alu = (Aluno) obj;
			return alu.getIdaluno().toString();
		}
		return null;
	}	
	
}
