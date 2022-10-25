package es.eoi.app.animales;

public abstract class Animal {
	 String nombre;
	 double peso;
	 public String getNombre() {
		return nombre;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	double altura;
	
	public Animal(String nombre, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}
	public void Olfatear() {
		
	}
}
