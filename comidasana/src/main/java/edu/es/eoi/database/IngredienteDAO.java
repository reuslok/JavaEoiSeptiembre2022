package edu.es.eoi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.es.eoi.model.Ingrediente;


public class IngredienteDAO {

	public Ingrediente encuentraIngrediente(int id)throws SQLException  {
		System.out.println("accedo a bbdd y recupero un ingrediente");
		Ingrediente ingrediente = null;

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement("SELECT * FROM restaurante.recetas where id=?");
		st.setInt(1, id);

		ResultSet rs = st.executeQuery();

	
			ingrediente = new Ingrediente(rs.getString("nombre"), rs.getDouble("calorias"), rs.getDouble("precio"));
		
		
		con.close();

		
		return ingrediente;
	}

	private Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante?serverTimezone=UTC",
				"root", "root");
	}

}
