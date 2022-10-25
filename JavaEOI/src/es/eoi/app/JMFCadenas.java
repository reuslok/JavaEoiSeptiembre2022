package es.eoi.app;

import java.util.Scanner;

public class JMFCadenas {

	public static void main(String[] args) {
		boolean ejecucion = true;
		String Texto="";
		do {
			System.out.println("CADENAS\r\n"
					+ "1 – Convertir en Mayúsuculas\r\n"
					+ "2 – Contar Vocales (Cómo en el ejercicio anterior)\r\n"
					+ "3 – Mostrar subcadena (Pediremos índiceDesde e índiceHasta)\r\n"
					+ "4 – Cambiar palabra (Pediremos la palabra a reemplazar y la nueva palabra)\r\n"
					+ "5 – Visualizar texto.\r\n"
					+ "6 - SALIR");
			Scanner scEleccion = new Scanner(System.in);
			String Eleccion = scEleccion.nextLine();
			Scanner scTexto = new Scanner(System.in);
			switch(Eleccion){
			case "1":
				Texto = scTexto.nextLine();
				if(30 > Texto.length()){
					System.out.println("El texto es menor a 30 caracteres, por favor vuelva a intentarlo.");
					Eleccion = "return";
					break;
				}
				System.out.println(Texto.toUpperCase());
				break;
				
			case "2":
				
				Texto = scTexto.nextLine();
				if(30 > Texto.length()){
					System.out.println("El texto es menor a 30 caracteres, por favor vuelva a intentarlo.");
					Eleccion = "return";
					break;
				}
				char[] letras= {'a','A','e','E','i','I','o','O','u','U'};
				int PunteroLetras=0;
				int contadorletras = 0;
				for(int i=0; i<Texto.length(); i++) {
					if(Texto.charAt(i) == letras[PunteroLetras] || Texto.charAt(i) == letras[PunteroLetras+1]
					|| Texto.charAt(i) == letras[PunteroLetras+2] || Texto.charAt(i) == letras[PunteroLetras+3]
					|| Texto.charAt(i) == letras[PunteroLetras+4]) contadorletras++;
					
					}
				System.out.println(Texto);
				System.out.println("numero de vocales: " + contadorletras);
				break;
				
			case "3":
				Texto = scTexto.nextLine();
				if(30 > Texto.length()){
					System.out.println("El texto es menor a 30 caracteres, por favor vuelva a intentarlo.");
					Eleccion = "return";
					break;
				}
				Scanner scIndiceDesde = new Scanner(System.in);
				int IndiceDesde = scIndiceDesde.nextInt();
				Scanner scIndiceHasta = new Scanner(System.in);
				int IndiceHasta = scIndiceHasta.nextInt();
				boolean continua=false;
				 if(IndiceDesde < Texto.length() && IndiceHasta < Texto.length()){
					 continua = true;
					 if(IndiceDesde>=IndiceHasta) {
						 
						 System.out.println("el primer índice no puede ser mayor o igual al segundo");
						 
						 break;}
					}
				 else if(continua == false) {
					 System.out.println("el primer o segundo índice es superior al numero de caracteres introducido");
				 }
				System.out.println(Texto.substring(IndiceDesde, IndiceHasta));
				break;
				
			case "4":
				Texto = scTexto.nextLine();
				if(30 > Texto.length()){
					System.out.println("El texto es menor a 30 caracteres, por favor vuelva a intentarlo.");
					Eleccion = "return";
					break;
				}
				System.out.println("introduzca palabra a reemplazar.");
				Scanner ScPalabraAReemplazar = new Scanner(System.in);
				String PalabraAReemplazar = ScPalabraAReemplazar.nextLine();
				System.out.println("introduzca la nueva palabra.");
				Scanner ScNuevaPalabra = new Scanner(System.in);
				String NuevaPalabra = ScNuevaPalabra.nextLine();
				Texto = Texto.replaceAll(PalabraAReemplazar, NuevaPalabra);
				break;
				
			case "5":
			
				System.out.println(Texto);
				break;
				
			case "6":
				ejecucion = false;
				break;
			case "return":
				break;
				
			}
			scEleccion.close();
			scTexto.close();
		}
		while(ejecucion);
		
	}

}
