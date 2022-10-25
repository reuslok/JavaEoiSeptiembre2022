package es.eoi.app.Geometria;

public abstract class Figura {
	protected int ancho;
	protected int alto;
	
	public Figura(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	
	public void dibujar() {
		for(int i=0; i <alto ;i++) {
			for(int j=0;j<ancho;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	
	
	
	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

	public Figura() {

	}

}
