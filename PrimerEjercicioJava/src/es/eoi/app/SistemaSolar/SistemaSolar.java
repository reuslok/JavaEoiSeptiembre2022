package es.eoi.app.SistemaSolar;

public class SistemaSolar {
	private String nombreEstrella;
	private double distanciaSiguienteEstrella;
	private int planetas;
	private double diametro;
	private Planetas planeta[];
	
	public SistemaSolar(String nombreEstrella, double distanciaSiguienteEstrella, double diametro,Planetas planeta[]) {
		this.nombreEstrella = nombreEstrella;
		this.distanciaSiguienteEstrella = distanciaSiguienteEstrella;
		this.planetas = planeta.length;
		this.diametro = diametro;
		this.planeta = planeta;
	}

	public String getNombreEstrella() {
		return nombreEstrella;
	}

	public double getDistanciaSiguienteEstrella() {
		return distanciaSiguienteEstrella;
	}

	public int getPlanetas() {
		return planetas;
	}

	public double getDiametro() {
		return diametro;
	}

	public Planetas[] getPlaneta() {
		return planeta;
	}
	
	
}
