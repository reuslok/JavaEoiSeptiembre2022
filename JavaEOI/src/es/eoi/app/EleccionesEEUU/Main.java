package es.eoi.app.EleccionesEEUU;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Candidato[] candidatos=new Candidato[2];
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el primer candidato");
		 candidatos[0]=new Candidato(sc.nextLine());
		System.out.println("Introduce el segundo candidato");
		 candidatos[1]=new Candidato(sc.nextLine());
		 Eleccion elecciones= new Eleccion(538,candidatos);
		elecciones.Recuento();
	}

}
