package edu.es.eoi.service;

import java.sql.SQLException;

import edu.es.eoi.database.RestauranteDAO;
import edu.es.eoi.model.Restaurante;

//Toda la logica de restaurantes
public class RestaurantesService {

	// si hay que acceder a bbdd que lo haga el DAO
	RestauranteDAO restauranteDAO = new RestauranteDAO();

	public Restaurante buscarRestaurante() throws SQLException {
		int id = 0;
		System.out.println("quiero recuperar un restaurante de bbdd y llamo a restauranteDAO");
		
		
		return restauranteDAO.encuentraRestaurante(id);
	}

}
