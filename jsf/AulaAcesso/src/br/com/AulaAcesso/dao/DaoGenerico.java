package br.com.AulaAcesso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DaoGenerico<T> {
	public static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("AulaAcesso");
	
	public static EntityManager getEntityManager()  {
		return factory.createEntityManager();
	}
	
	public T salvar (T t) throws Exception  {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(t);			
			em.getTransaction().commit();
		}finally {
			em.close();
		}
		return t;
	}
	
	public void excluir (T t) throws Exception  {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			T t2 = em.merge(t);
			em.remove(t2);
			em.getTransaction().commit();
		}finally {
			em.close();
		}		
	}
	
	public void editar (T t) throws Exception  {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			T t2 = em.merge(t);
			em.merge(t2);
			em.getTransaction().commit();
		}finally {
			em.close();
		}		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listAll(Class<T> classToCast){
		EntityManager em = getEntityManager();
		Query query = em.createQuery("SELECT  obj FROM " + classToCast.getSimpleName() + " obj");
		List<T> list = query.getResultList();
		return list;
	}
	
}