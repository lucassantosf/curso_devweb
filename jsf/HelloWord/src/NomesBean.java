import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
@ViewScoped
public class NomesBean {
	private String nome;
	private List<String> nomes = new ArrayList<>();
	
	private HtmlInputText inputNome;
	private HtmlCommandButton botaoAdicionar;
	
	public void adicionar(){
		this.nomes.add(nome);
		
		//desativar campo e bot�o ao ter mais de 3 nomes
		if(this.nomes.size() >3){
			this.inputNome.setDisabled(true);
			this.botaoAdicionar.setDisabled(true);
			this.botaoAdicionar.setValue("Muitos Nomes Adicionados");
		}
	}

	public String getNome() {
		return nome;
	}

	public HtmlInputText getInputNome() {
		return inputNome;
	}

	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public HtmlCommandButton getBotaoAdicionar() {
		return botaoAdicionar;
	}

	public void setBotaoAdicionar(HtmlCommandButton botaoAdicionar) {
		this.botaoAdicionar = botaoAdicionar;
	}

	
	
	
	
	
}
