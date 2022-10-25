package es.eoi.app.Autoescuela;

import java.time.LocalDate;

public class Alumno {
	
	private String nombre;
	private double notaTeorico;
	private double notaPractico;
	
	public Alumno(String nombre, double notaTeorico, double notaPractico) {
		this.nombre = nombre;
		this.notaTeorico = notaTeorico;
		this.notaPractico = notaPractico;

	}

	public String getNombre() {
		return nombre;
	}

	public double getNotaTeorico() {
		return notaTeorico;
	}

	public double getNotaPractico() {
		return notaPractico;
	}

}
