package es.eoi.app.objetos;

public class SeleccionFutbol {
	protected int id;
	protected int edad;
	protected String nombre;
	protected String apellidos;
	
	public void Concentrarse() {
		System.out.println("Concentrarse...");
	}
	public void Viajar() {
		System.out.println("Viajar...");
	}
	public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
}
