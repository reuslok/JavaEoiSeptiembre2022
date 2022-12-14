package es.eoi.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.google.protobuf.TextFormat.ParseException;


public class GestionInstituto {
	static Scanner sc= new Scanner(System.in);

	static boolean terminarMenu=false;
	public static void GestionInstituto() throws SQLException {

		do {
		System.out.println("GESTION INSTITUTO V1\r\n"
				+ "-------------------------------\r\n"
				+ "1 – Listado Alumnos\r\n"
				+ "2 – Busca Alumno (DNI)\r\n"
				+ "3 – Crear Alumno\r\n"
				+ "4 – Modificar Alumno\r\n"
				+ "5 – Eliminar Alumno\r\n"
				+ "0 – SALIR\r\n"
				+ "-------------------------------");
		String opcion= sc.nextLine();
switch(opcion) {
		
//		Listado Alumnos.
		case"1":
			System.out.println("1 – Listado Alumnos");
			
			ListadoAlumnos();
			break;
//		Listar Calificaciones.
		case"2":
			BuscaAlumno();
			System.out.println("2 – Busca Alumno (DNI)");
			String dni= sc.nextLine();
			break;
//			Crear Alumno
		case"3":
			System.out.println("3 – Crear Alumno");
			CrearAlumno();
			break;
//			Modificar Alumno
		case"4":
			System.out.println("4 – Modificar Alumno");
			ModificarAlumno();

			break;
//			Eliminar Alumno
		case"5":
			System.out.println("5 – Eliminar Alumno");
			EliminarAlumno();

			
			break;
//			Salir
		case"0":
			System.out.println("0 – SALIR");
			terminarMenu=true;
			sc.close();
			break;
		default:
			System.out.println("opcion no reconocida");
			break;
		}
		}
		while(!(terminarMenu));
		}
	private static void EliminarAlumno() throws SQLException {
		String DNI="";
	
		while(DNI.length()!=10) {
		System.out.println("Inserte DNI");
		DNI=sc.nextLine();
		if(DNI.length()!=10) {
			System.out.println("longitud de DNI incorrecta");
		}
		else {
			
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE ALUMNO WHERE DNI = ?;");
			PreparedStatement pst = Main.conexion.prepareStatement(sql.toString());
			pst.setString(1, DNI);
			
			
			
			pst.executeUpdate();
			
			}
			
		}
		}
	
	private static void ModificarAlumno() throws SQLException {
		String DNI="";
		String nombre="";
		String apellidos="";
		String edad="";
		while(DNI.length()!=10) {
		System.out.println("Inserte DNI");
		DNI=sc.nextLine();
		if(DNI.length()!=10) {
			System.out.println("longitud de DNI incorrecta");
		}
		else {
			System.out.println("Inserte nombre");
			nombre=sc.nextLine();
			System.out.println("Inserte apellidos");
			apellidos=sc.nextLine();
			System.out.println("Inserte edad");
			edad=sc.nextLine();
			if(!(edad.isBlank())) {
			try {
			Integer.parseInt(edad);
			}
			catch (NumberFormatException e) {
				System.out.println("el valor introducido no es un numero");
				System.out.println("Inserte edad");
				edad=sc.nextLine();
			}
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE ALUMNO SET DNI = ?, NOMBRE = ?, APELLIDOS = ?, EDAD = ? WHERE DNI = ?;");
			PreparedStatement pst = Main.conexion.prepareStatement(sql.toString());
			pst.setString(1, DNI);
			pst.setString(2, nombre);
			pst.setString(3, apellidos);
			pst.setString(4, edad);
			pst.setString(5, DNI);
			
			
			pst.executeUpdate();
			
			}
			
		}
		}
	}
	private static void CrearAlumno() throws SQLException {
		String DNI="";
		String nombre="";
		String apellidos="";
		String edad="";
		while(DNI.length()!=10) {
		System.out.println("Inserte DNI");
		DNI=sc.nextLine();
		if(DNI.length()!=10) {
			System.out.println("longitud de DNI incorrecta");
		}
		else {
			System.out.println("Inserte nombre");
			nombre=sc.nextLine();
			System.out.println("Inserte apellidos");
			apellidos=sc.nextLine();
			System.out.println("Inserte edad");
			edad=sc.nextLine();
			if(!(edad.isBlank())) {
			try {
			Integer.parseInt(edad);
			}
			catch (NumberFormatException e) {
				System.out.println("el valor introducido no es un numero");
				System.out.println("Inserte edad");
				edad=sc.nextLine();
			}
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO ALUMNO (DNI, NOMBRE, APELLIDOS, EDAD) VALUES (?,?,?,?);");
			PreparedStatement pst = Main.conexion.prepareStatement(sql.toString());
			pst.setString(1, DNI);
			pst.setString(2, nombre);
			pst.setString(3, apellidos);
			pst.setString(4, edad);
			
			
			pst.executeUpdate();
			
			}
			
		}
		}
	}
	private static void BuscaAlumno() throws SQLException {
		String DNI="";
		while(DNI.length()!=10) {
		System.out.println("Inserte DNI");
		DNI=sc.nextLine();
		if(DNI.length()!=10) {
			System.out.println("longitud de DNI incorrecta");
			}
		else {
		}
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ALUMNO WHERE DNI = ?;");
		PreparedStatement pst = Main.conexion.prepareStatement(sql.toString());
		pst.setString(1, DNI);
		Main.rs= pst.executeQuery();
		while(Main.rs.next()) {
			System.out.println(Main.rs.getString("DNI").concat(" - ").concat(
					Main.rs.getString("NOMBRE")).concat(" - ").concat(
					Main.rs.getString("APELLIDOS")).concat(" - ")+
					Main.rs.getInt("EDAD"));
		}
		}
	}
	private static void ListadoAlumnos() throws SQLException {
		Main.rs = Main.st.executeQuery("SELECT * FROM alumno");
		while(Main.rs.next()){
			
			System.out.println(Main.rs.getString("DNI").concat(" - ").concat(
					Main.rs.getString("NOMBRE")).concat(" - ").concat(
					Main.rs.getString("APELLIDOS")).concat(" - ")+
					Main.rs.getInt("EDAD"));
			if(Main.rs.isLast()) {
				Main.rs = Main.st.executeQuery("SELECT * FROM alumno");
				break;
			}
			}
		
	}
	}
