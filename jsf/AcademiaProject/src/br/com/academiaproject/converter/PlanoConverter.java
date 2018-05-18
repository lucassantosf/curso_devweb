package br.com.academiaproject.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.academiaproject.dao.DaoPlano;
import br.com.academiaproject.modelo.Plano;

@FacesConverter(forClass = Plano.class)
public class PlanoConverter implements Converter{
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String codStr) {
		if(codStr != null && codStr.trim().length() > 0){
			Integer cod = Integer.valueOf(codStr);
			DaoPlano dao = new DaoPlano();
			return dao.consultarPorIdInt(Plano.class, cod);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		if(obj!= null){
			Plano plan = (Plano) obj;
			return plan.getIdplano().toString();
		}
		return null;
	}	
	
}
