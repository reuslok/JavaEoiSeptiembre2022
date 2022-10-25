package es.eoi.app.Empleos;

public abstract class Empleo {
	
	protected double sueldo;

	public abstract void Cobrar();
	
	public abstract void Fichar();

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
