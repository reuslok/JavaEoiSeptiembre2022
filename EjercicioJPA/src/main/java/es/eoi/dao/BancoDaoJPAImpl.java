package es.eoi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import es.eoi.entity.Banco;

public class BancoDaoJPAImpl {
	
	private EntityManager manager = Persistence.createEntityManagerFactory("clientes-sucursalesPU").createEntityManager();
	
	private void create(Banco banco) {
		manager.getTransaction().begin();
		manager.persist(banco);
		manager.getTransaction().commit();
	}
	
	public Banco read(int i) {
		return manager.find(Banco.class, i);
	}
	
	public void update(Banco banco) {
		manager.getTransaction().begin();
		manager.merge(banco);
		manager.getTransaction().commit();
	}
	
	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(read(id));
		manager.getTransaction().commit();
	}
}
