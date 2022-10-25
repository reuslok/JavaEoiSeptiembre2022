package es.eoi.app.DiagramaDeClases;

public class Estudiante extends Persona {

	private int numeroEstudiante;

	private double[] notas;

	public double calcularMedia() {

		// TODO averiguar como calcular la media de las notas

		return 0.0;
	}

	public double calcularMatricula() {

		// TODO averiguar como calcular el coste de la matricula

		return 0.0;
	}

	public int getNumeroEstudiante() {
		return numeroEstudiante;
	}

	public void setNumeroEstudiante(int numeroEstudiante) {
		this.numeroEstudiante = numeroEstudiante;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
}
