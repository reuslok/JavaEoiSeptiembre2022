package es.coleccionivan.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListaDNI {
	static Map<String,PersonaDNI> personas = new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrearPersonas();
		 Menu();
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void Menu() {
		
		
		String accion;
		
		do {
			System.out.println("1 - Nueva Persona");
			System.out.println("2 - Listado Personas");
			System.out.println("3 - Buscar por NIF");
			System.out.println("4 - Salir");
			accion = sc.nextLine();
			
			switch(accion) {
			//Nueva Persona
			case "1":NewPerson(); break;
			//Listado Personas
			case "2": break;
			//Buscar por NIF
			case "3": BuscarNIF();break;
			}
			
		}while(accion!="4");
	}
	
	
	private static void NewPerson() {
		System.out.println("Nombre");
		String nombre= sc.nextLine();
		System.out.println("1 - DNI");
		String DNI= sc.nextLine();
		System.out.println("Apellidos");
		String apellidos= sc.nextLine();
		personas.put(DNI, new PersonaDNI(DNI, nombre, apellidos));
	}


	public static void CrearPersonas() {
//		DNI - Nombre - Apellido
//		personas.add(new PersonaDNI("","",""));
		personas.put("54672318K",new PersonaDNI("54672318K","Mark","Calum"));
		personas.put("12345678I",new PersonaDNI("4","Ivan","Sanchez"));
		personas.put("87654321M",new PersonaDNI("87654321M","Meki","Eromori"));
		personas.put("10256845L",new PersonaDNI("10256845L","Conor","Cordeu"));
		personas.put("16487596A",new PersonaDNI("16487596A","Mark","Paceforger"));
		personas.put("26359741F",new PersonaDNI("26359741F","Azira","Yuki"));
		personas.put("15324789S",new PersonaDNI("15324789S","Miles","Power"));

	}

	
	public static void BuscarNIF() {
		Scanner sc = new Scanner(System.in);
		String NIF;
		
		System.out.println("Escriba el NIF que deseas buscar.");
		NIF =sc.nextLine();
		
		boolean encontrar= false;
		Integer posicion=0;
		for(String personaDNI: personas.keySet()) {
			
			if(personaDNI.equals(NIF)) {
				encontrar=true;		
				System.out.println(personas.get(personaDNI).toString()); 
				//System.out.println(personaDNI+" "+personas.get(posicion).getApellidos()+" "+personas.get(posicion).getApellidos());				
			}
			
			++posicion;
		}
		
		if(!encontrar) {
			System.out.println("No hemos encontrado el NIF que buscabas");
		}
	}
}