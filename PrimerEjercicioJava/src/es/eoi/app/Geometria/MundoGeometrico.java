package es.eoi.app.Geometria;

public class MundoGeometrico {

	public static void main(String[] args) {
		Figura[] figuras= new Figura[10];
		
		for(int i=0;i<5;i++) {
			Cuadrado cuadrado=new Cuadrado(2+i,2+i);
			figuras[i]=cuadrado;
		}
		for(int i=5;i<10;i++) {
			Rectangulo rectangulo=new Rectangulo(2+i,3+i);
			figuras[i]=rectangulo;
		}
		
	}

}
