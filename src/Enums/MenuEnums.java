package Enums;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MenuEnums {
	

	static Scanner sc= new Scanner(System.in);
	public static void Menu() {
		System.out.println("Bienvenido");
		List<AlumnosEnums> alumnosLista=MainEnums.alumnos;
		
		List<AlumnosEnums> alumnosAscendente=alumnosLista;
		Collections.sort(alumnosAscendente);
		List<AlumnosEnums> alumnosDescendente=alumnosAscendente;
		Collections.reverse(alumnosDescendente);
		Iterator Iteradoralumnos;
		boolean terminarMenu=false;
		do {
				System.out.println(
				"1- Nueva Calificacion \r\n "
				+ "2- Listar Calificaciones\r\n"
				+ "3- Listar Calificaciones (Ordenado por calificación ascendente)\r\n"
				+ "4- Listar Calificaciones (Ordenado por calificación descendente)\r\n"
				+ "5- Listar Calificaciones SOBRESALIENTES\r\n"
				+ "6- Listar Calificaciones NOTABLES\r\n"
				+ "7- Listar Calificaciones BIEN\r\n"
				+ "8- Listar Calificaciones SUFICIENTE\r\n"
				+ "9- Listar Calificaciones INSUFICIENTE\r\n"
				+ "Elija una opcion");
		String opcion= sc.nextLine();
		
		switch(opcion) {
		
//		Nueva Calificacion.
		case"1":
			System.out.println("1- Nueva Calificacion");
			NuevaCalificacion();
			Menu();
			break;
//		Listar Calificaciones.
		case"2":

			System.out.println("2- Listar Calificaciones");
			ListarCalificaciones();
			break;
		case"3":
			System.out.println("3- Listar Calificaciones (Ordenado por calificación ascendente)");

			Iteradoralumnos= alumnosAscendente.iterator();
			while(Iteradoralumnos.hasNext()) {
				System.out.println(Iteradoralumnos.next());
			}
			Menu();
			break;
		case"4":
			System.out.println("4- Listar Calificaciones (Ordenado por calificación descendente)");
			
			Iteradoralumnos= alumnosDescendente.iterator();
			while(Iteradoralumnos.hasNext()) {
				System.out.println(Iteradoralumnos.next());
			}
			Menu();

			break;
		case"5":
			System.out.println("5- Listar Calificaciones SOBRESALIENTES");
			for(AlumnosEnums alumno: alumnosLista) {
				if (alumno.getCalificaciones()==CalificacionesEnums.SOBRESALIENTE) {
					System.out.println(alumno.toString()); 
				}
			}

			Menu();
			
			break;
		case"6":
			System.out.println("6- Listar Calificaciones NOTABLE");
			for(AlumnosEnums alumno: alumnosLista) {
				if (alumno.getCalificaciones()==CalificacionesEnums.NOTABLE) {
					System.out.println(alumno.toString()); 
				}
			}
			Menu();

			break;
		case"7":
			System.out.println("7- Listar Calificaciones BIEN");
			for(AlumnosEnums alumno: alumnosLista) {
				if (alumno.getCalificaciones()==CalificacionesEnums.BIEN) {
					System.out.println(alumno.toString()); 
				}
			}
			Menu();

			break;
		case"8":

			System.out.println("8- Listar Calificaciones SUFICIENTE");
			for(AlumnosEnums alumno: alumnosLista) {
				if (alumno.getCalificaciones()==CalificacionesEnums.SUFICIENTE) {
					System.out.println(alumno.toString()); 
				}
			}
			Menu();

			break;
		case"9":
			System.out.println("9- Listar Calificaciones INSUFICIENTE");
			for(AlumnosEnums alumno: alumnosLista) {
				if (alumno.getCalificaciones()==CalificacionesEnums.INSUFICIENTE) {
					System.out.println(alumno.toString()); 
				}
			}
			Menu();

			break;
		default:
			System.out.println("opcion no reconocida");
			terminarMenu=true;
			break;
		}
		}
		while(!terminarMenu);
	}
	
	private static void NuevaCalificacion() {
		System.out.println("introduzca el numbre del nuevo alumno: ");
		String nombre= sc.nextLine();
		Double nota;
		boolean notaValida=false;
		do {
			System.out.println("Introduzca la calificacion: ");
			nota = sc.nextDouble();

			if(nota>10.0 && nota <0.0){
				System.out.println("Calificacion incorrecta");
				System.out.println("Vuelva a intentarlo: ");
				}
			else { notaValida=true;}
			}
		while(!notaValida);
		MainEnums.alumnos.add(new AlumnosEnums(
				nombre,CalificacionesEnums.getCalificacionesEnums(nota),nota
				));
			
	}
	
	private static void ListarCalificaciones() {
		Iterator Iteradoralumnos= MainEnums.alumnos.iterator();
		while(Iteradoralumnos.hasNext()) {
			System.out.println(Iteradoralumnos.next());
		}
		
	}
}
