package es.eoi.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import es.eoi.dao.BancoDaoJPAImpl;
import es.eoi.dao.ClienteDaoJPAImpl;
import es.eoi.dao.CuentaDaoJPAImpl;
import es.eoi.entity.Banco;
import es.eoi.entity.Cliente;
import es.eoi.entity.Cuenta;
public class Service {
	EntityManager manager=Persistence.createEntityManagerFactory("sucursalesPU").createEntityManager();

	ClienteDaoJPAImpl clientedao= new ClienteDaoJPAImpl();
	BancoDaoJPAImpl bancodao = new BancoDaoJPAImpl();
	CuentaDaoJPAImpl cuentadao =  new CuentaDaoJPAImpl();
	
	private int idBanco;
	Banco banco =bancodao.read(idBanco);

	private String dni;
	Cliente cliente = clientedao.read(dni);

	private int idcuenta;
	Cuenta cuenta=cuentadao.read(idcuenta);
	
}
