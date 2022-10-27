package es.eoi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import es.eoi.entity.Cliente;
public class ClienteDaoJPAImpl {
	
private EntityManager manager = Persistence.createEntityManagerFactory("clientes-sucursalesPU").createEntityManager();

	private void create(Cliente cliente) {
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
	}
	
	public Cliente read(String dni) {
		return manager.find(Cliente.class, dni);
	}
	
	public void update(Cliente cliente) {
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();
	}
	
	public void delete(String dni) {
		manager.getTransaction().begin();
		manager.remove(read(dni));
		manager.getTransaction().commit();
	}
}
