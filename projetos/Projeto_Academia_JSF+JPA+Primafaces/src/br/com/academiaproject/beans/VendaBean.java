package br.com.academiaproject.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import br.com.academiaproject.dao.DaoAluno;
import br.com.academiaproject.dao.DaoItemVenda;
import br.com.academiaproject.dao.DaoPlano;
import br.com.academiaproject.dao.DaoVendas;
import br.com.academiaproject.modelo.Aluno;
import br.com.academiaproject.modelo.Itemvenda;
import br.com.academiaproject.modelo.Plano;
import br.com.academiaproject.modelo.Venda;



@ManagedBean
@ViewScoped
public class VendaBean {
	
	private Aluno alunoSelecionado;
	private Plano planoSelecionado;
	private List<Itemvenda> carrinhoCompras = new ArrayList<Itemvenda>();
	private double valorTotal;
	private List<SelectItem> alunoselect;
	private List<SelectItem> planoselect;
	private List<Venda> listaVendas;
	private Venda venda;
	private Itemvenda itemselecionado;
	private Integer qtde;
	
	public VendaBean(){
		this.venda = new Venda();
	}
	
	public String excluirProdCarrinho(){
		if(this.carrinhoCompras != null && !this.carrinhoCompras.isEmpty()){
			this.carrinhoCompras.remove(this.itemselecionado);
			calcularTotal();
			FacesMessage fm = new FacesMessage("Excluido com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, fm);
		}
		return null;
	}
	
	public String adicionarPlano(){
		itemselecionado = new Itemvenda();
		DaoPlano dao = new DaoPlano();
		Plano planopesquisado = new Plano();
		if(this.planoSelecionado.getIdplano() != null){
			planopesquisado = dao.consultarPorIdInt(Plano.class, this.planoSelecionado.getIdplano());
		}
		if(planopesquisado != null && qtde != null){
			itemselecionado.setItemvendaqtd(qtde);
			itemselecionado.setPlano(planopesquisado);
			this.carrinhoCompras.add(itemselecionado);
			calcularTotal();
			FacesMessage fm = new FacesMessage("Item adicionado com Sucesso!");
			FacesContext.getCurrentInstance().addMessage(null, fm);
		}
		return null;
	}
	
	public void limparTudo(){
		alunoSelecionado = null;
		planoSelecionado = null;
		valorTotal = 0;
		qtde = 0;
		carrinhoCompras = new ArrayList<Itemvenda>();
		venda = new Venda();
	}
	
	public void finalizarVenda() throws Exception{
		DaoVendas dao = new DaoVendas();
		this.venda.setAluno(this.alunoSelecionado);
		this.venda.setDatavenda(new Date());
		this.venda = dao.salvar(venda);
		
		if(!this.carrinhoCompras.isEmpty()){
			ArrayList<Itemvenda> itens = new ArrayList<Itemvenda>();
			for (Itemvenda i : this.carrinhoCompras) {
				i.setVenda(this.venda);
				itens.add(i);
			}			
			this.venda.setItemvendas(itens);
			dao.editar(venda);
			FacesMessage fm = new FacesMessage("Salvo com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, fm);			
			limparTudo();
		
		}else{
			FacesMessage fm = new FacesMessage("Venda sem itens, adicione ao menus 1 item");
			FacesContext.getCurrentInstance().addMessage(null, fm);
		}
	}
	
	public void excluirVenda() throws Exception{
		DaoVendas daov = new DaoVendas();
		DaoItemVenda dao1 = new DaoItemVenda();
		
		if(!venda.getItemvendas().isEmpty()){
			for(Itemvenda itemVenda : venda.getItemvendas()){
				dao1.excluir(itemVenda);
			}
		}
		venda.setItemvendas(null);
		daov.editar(venda);
		
		daov.excluir(venda);
		FacesMessage fm = new FacesMessage("Excluido com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, fm);
		venda = new Venda();
	}
	
	public void calcularTotal(){
		this.valorTotal = 0.00;
		if(!this.carrinhoCompras.isEmpty()){
			for(Itemvenda i : this.carrinhoCompras){
				valorTotal = (double) (valorTotal + (i.getPlano().getValorplano() * i.getItemvendaqtd()));				
			}
		}
	}

	public List<SelectItem> getPlanoselect() {
		if(planoselect == null){
			planoselect = new ArrayList<>();
			DaoPlano dao = new DaoPlano();
			
			List<Plano> listaPlanos = dao.listAll(Plano.class);
			
			if(listaPlanos != null && !listaPlanos.isEmpty()){
				SelectItem item;
				for(Plano p : listaPlanos){
					item = new SelectItem(p, p.getDescplano());
					planoselect.add(item);
				}
			}			
		}		
		return planoselect;
	}
	
	public List<SelectItem> getAlunoselect() {
		if(alunoselect == null){
			alunoselect = new ArrayList<>();
			DaoAluno dao = new DaoAluno();
			
			List<Aluno> listaAlunos = dao.listAll(Aluno.class);
			
			if(listaAlunos != null && !listaAlunos.isEmpty()){
				SelectItem item;
				for(Aluno p : listaAlunos){
					item = new SelectItem(p, p.getNomealuno());
					alunoselect.add(item);
				}
			}			
		}		
		return alunoselect;
	}

	public Aluno getAlunoSelecionado() {
		return alunoSelecionado;
	}

	public void setAlunoSelecionado(Aluno alunoSelecionado) {
		this.alunoSelecionado = alunoSelecionado;
	}

	public Plano getPlanoSelecionado() {
		return planoSelecionado;
	}

	public void setPlanoSelecionado(Plano planoSelecionado) {
		this.planoSelecionado = planoSelecionado;
	}

	public List<Itemvenda> getCarrinhoCompras() {
		return carrinhoCompras;
	}

	public void setCarrinhoCompras(List<Itemvenda> carrinhoCompras) {
		this.carrinhoCompras = carrinhoCompras;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Itemvenda getItemselecionado() {
		return itemselecionado;
	}

	public void setItemselecionado(Itemvenda itemselecionado) {
		this.itemselecionado = itemselecionado;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public List<Venda> getListaVendas() {
		DaoVendas dao = new DaoVendas();
		this.listaVendas = dao.listAll(Venda.class);
		return listaVendas;
	}
	
	
	
	
	
}
