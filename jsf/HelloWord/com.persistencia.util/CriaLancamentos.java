import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CriaLancamentos {
	public static void main(String[] args){
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Pessoa cliente = new Pessoa();
		cliente.setNome("Teste de Nome");
		
		manager.persist(cliente);
		
		trx.commit();
		manager.close();
	}
}
