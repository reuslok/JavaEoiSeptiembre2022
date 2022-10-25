package es.eoi.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import es.eoi.config.BBDDUtils;

public class Main {
	public static Statement st ;
	public static ResultSet rs ;
	public static Connection conexion;

	public static void main(String[] args) {

		try {

			String dniAlumno = null;

			conexion = BBDDUtils.openConnection();

			System.out.println("Conectado:"+BBDDUtils.BBDD_URL);
			try {
				st = Main.conexion.createStatement();
				rs = st.executeQuery("SELECT * FROM alumno");
			} catch (SQLException e) {
				System.out.println("Error al ejecutar la consulta a BBDD.");
				e.printStackTrace();
			}
			

			GestionInstituto.GestionInstituto();
			conexion.close();
			
		}
		
		catch (SQLException e)
		{

			System.out.println("Error al abrir conexión a BBDD.");

			e.printStackTrace();

		}
	}
}

