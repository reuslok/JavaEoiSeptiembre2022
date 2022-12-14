package es.eoi.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import es.eoi.config.BBDDUtils;

public class Main {
	public static Statement st ;
	public static ResultSet rsComumidades ;
	public static ResultSet rsProvincias ;
	public static Connection conexion;
	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {

		try {

			conexion = BBDDUtils.openConnection();

			System.out.println("Conectado:"+BBDDUtils.BBDD_URL);
			try {
				st = Main.conexion.createStatement();
				rsComumidades = st.executeQuery("SELECT * FROM comunidades");
				rsProvincias = st.executeQuery("SELECT * FROM provincias");
				menu();
			} catch (SQLException e) {
				System.out.println("Error al ejecutar la consulta a BBDD.");
				e.printStackTrace();
			}
			

			conexion.close();
			
		}
		
		catch (SQLException e)
		{

			System.out.println("Error al abrir conexión a BBDD.");

			e.printStackTrace();

		}
	}

	private static void menu() throws SQLException {
		System.out.println("01    ANDALUCIA\r\n"
				+ "02    ARAGON\r\n"
				+ "03    ASTURIAS\r\n"
				+ "04    ISLAS BALEARES\r\n"
				+ "05    ISLAS CANARIAS\r\n"
				+ "06    CANTABRIA\r\n"
				+ "07    CASTILLA Y LEON\r\n"
				+ "08    CASTILLA-LA MANCHA\r\n"
				+ "09    CATALUNYA\r\n"
				+ "10    COMUNICAD VALENCIANA\r\n"
				+ "11    EXTREMADURA\r\n"
				+ "12    GALICIA\r\n"
				+ "13    MADRID\r\n"
				+ "14    MURCIA\r\n"
				+ "15    NAVARRA\r\n"
				+ "16    PAIS VASCO\r\n"
				+ "17    LA RIOJA\r\n"
				+ "18    CEUTA\r\n"
				+ "19    MELILLA");
		
		System.out.println("Introduce el código de la comunidad autónoma que desees:");
		BuscaComunidad();
		
	}
	static String CODIGO_COMUNIDAD="";
	static String NOMBRE_PROVICIA="";
	private static void BuscaComunidad() throws SQLException {

		do{
		System.out.println("Inserte codigo de comunidad");
		CODIGO_COMUNIDAD=sc.nextLine();
		if(CODIGO_COMUNIDAD.length()!=2) {
			System.out.println("longitud de codigo de comunidad incorrecta");
			
			}
			else {
				StringBuilder sqlComunidad = new StringBuilder();
				sqlComunidad.append("SELECT * FROM comunidades WHERE CODIGO_COMUNIDAD = ?;");
				PreparedStatement pst = Main.conexion.prepareStatement(sqlComunidad.toString());
				pst.setString(1, CODIGO_COMUNIDAD);
				rsComumidades= pst.executeQuery();
				if(!rsComumidades.next()) {
					System.out.println("comunidad no encontrada");
				}
				else
				while(rsComumidades.next()) {
				System.out.println(rsComumidades.getString("CODIGO_COMUNIDAD").concat(" - ").concat(
					rsComumidades.getString("NOMBRE")));

				}
				
				StringBuilder sqlProvincia = new StringBuilder();
				sqlProvincia.append("SELECT * FROM provincias WHERE CODIGO_COMUNIDAD = ?;");
				pst = Main.conexion.prepareStatement(sqlProvincia.toString());
				pst.setString(1, CODIGO_COMUNIDAD);
				rsProvincias= pst.executeQuery();
				
				while(rsProvincias.next()) {
					System.out.println(rsProvincias.getString("CODIGO_PROVINCIAS").concat(" - ").concat(
							rsProvincias.getString("NOMBRE")));
				
					}
	
			}
		}
		while(CODIGO_COMUNIDAD.length()!=2 || !rsComumidades.next());
	}
}
	
