package edu.es.eoi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import edu.es.eoi.database.RecetaDAO;
import edu.es.eoi.model.Ingrediente;
import edu.es.eoi.model.Receta;
import edu.es.eoi.model.Restaurante;

//ACCESO A MI TABLA RESTAURANTES
public class RestauranteDAO {

	public Restaurante encuentraRestaurante(int id)throws SQLException  {
		System.out.println("accedo a bbdd y recupero un restaurante");
		Restaurante restaurante= null;
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement("SELECT * FROM restaurantes where id=?");
		st.setInt(1, id);

		ResultSet rs = st.executeQuery();
		
		st = con.prepareStatement("SELECT * FROM restaurante_recetas where idrestaurante=?");
		st.setInt(1, id);

		ResultSet rsReceta = st.executeQuery();
		
		List<Receta> list= new ArrayList<>();
		while (rsReceta.next()) {
			Receta receta= new RecetaDAO().encuentraReceta(rsReceta.getInt("idreceta"));
			list.add(receta);
			
		}
		
		
		restaurante = new Restaurante(rs.getString("nombre"), rs.getString("direccion"), rs.getString("telefono"),rs.getString("codigopostal"),list);
		
		
		con.close();

		
		return restaurante;
	}

	private Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante?serverTimezone=UTC",
				"root", "root");
	}

}
