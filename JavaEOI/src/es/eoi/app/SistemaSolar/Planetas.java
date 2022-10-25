package es.eoi.app.SistemaSolar;

public class Planetas {
	private String nombrePlaneta;
	private double distanciaEstrella;

	private int satelites;
	private double diametro;
	public Planetas(String nombrePlaneta, double distanciaEstrella, int satelites, double diametro) {
		this.nombrePlaneta = nombrePlaneta;
		this.distanciaEstrella = distanciaEstrella;
		this.satelites = satelites;
		this.diametro = diametro;
	}
	public String getNombrePlaneta() {
		return nombrePlaneta;
	}
	public double getDistanciaEstrella() {
		return distanciaEstrella;
	}
	public int getSatelites() {
		return satelites;
	}
	public double getDiametro() {
		return diametro;
	}
}
