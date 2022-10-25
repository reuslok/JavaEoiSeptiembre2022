package es.eoi.app;

public class MultiplicacionesJMF {

	public static void main(String[] args) {
		for(int i=1;i < 11;i++){
			System.out.println("Tabla del "+ i);
			for (int e=1;e <11; e++) {
				System.out.println(i+" x " +e+" = "+(i*e));
			}
		}
		
	}

}
