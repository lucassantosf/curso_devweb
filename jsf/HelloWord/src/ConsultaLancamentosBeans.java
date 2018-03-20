import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ConsultaLancamentosBeans {
	
	private List<Pessoa> pessoas;
	
	public void consultar(){
		EntityManager manager = JpaUtil.getEntityManager();
		TypedQuery<Pessoa> query = manager.createQuery("from Pessoa", Pessoa.class);
		this.pessoas = query.getResultList();
		manager.close();
	}
	
	public List<Pessoa> getPessoas(){
		return pessoas;
	}
}
