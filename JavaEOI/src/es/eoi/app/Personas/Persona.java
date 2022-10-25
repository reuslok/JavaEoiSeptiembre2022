package es.eoi.app.Personas;

import java.time.LocalDate;

public class Persona implements Comparable<Persona> {
	private String nombre;

	private LocalDate fechaNacimiento;

	private Integer edad;
	
	private String DNI;

	public Persona(String nombre, LocalDate fechaNacimiento, Integer edad, String DNI) {
		this.nombre = nombre;

		this.fechaNacimiento = fechaNacimiento;

		this.edad = edad;
		this.DNI = DNI;
	}
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", DNI=" + DNI
				+ "]\n";
	}



	@Override
	public int compareTo(Persona otraPersona) {
		int resultado = this.nombre.compareTo(otraPersona.getNombre()); 
		if (resultado==0) {
			resultado = otraPersona.getEdad().compareTo(this.edad); 
		}
		if (resultado==0) {
			resultado = otraPersona.getFechaNacimiento().compareTo(this.fechaNacimiento); 
		}
		return resultado;
	}
}