package es.eoi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import es.eoi.entity.Cuenta;

public class CuentaDaoJPAImpl {

	private EntityManager manager = Persistence.createEntityManagerFactory("clientes-sucursalesPU").createEntityManager();

	private void create(Cuenta cuenta) {
		manager.getTransaction().begin();
		manager.persist(cuenta);
		manager.getTransaction().commit();
	}
	
	public Cuenta read(int id) {
		return manager.find(Cuenta.class, id);
	}
	
	public void update(Cuenta cuenta) {
		manager.getTransaction().begin();
		manager.merge(cuenta);
		manager.getTransaction().commit();
	}
	
	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(read(id));
		manager.getTransaction().commit();
	}
}
