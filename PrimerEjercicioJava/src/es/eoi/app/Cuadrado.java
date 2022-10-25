package es.eoi.app;

public class Cuadrado {

	public static void main(String[] args) {
		char hashtag='#';
		char at='@';
		int alto=3;
		int ancho=3;
		for(int i=0;i<alto;i++) {
			for(int e=0;e<ancho;e++) {
				System.out.print(hashtag);
			}
			System.out.println();
		}
		alto=4;
		ancho=4;
		for(int i=0;i<alto;i++) {
			
			for(int e=0;e<ancho;e++) {
			System.out.print(hashtag);
		
			}
			System.out.println();
			
		}
		alto=10;
		ancho=10;
		for(int i=0;i<alto;i++) {
			
			for(int e=0;e<ancho;e++) {
			System.out.print(at);
		
			}
			System.out.println();
		}
	}

}
