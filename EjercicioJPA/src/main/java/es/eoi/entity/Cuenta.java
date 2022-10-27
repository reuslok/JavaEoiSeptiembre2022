package es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "clientes-sucursales", name="clientes")
public class Cuenta {

	@Column
	private int saldo;
	
	@ManyToOne
	@JoinColumn(name= "dni", referencedColumnName = "dni")
	private Cliente cliente;
	@JoinColumn(name= "id", referencedColumnName = "id")
	private Banco banco;
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
}
