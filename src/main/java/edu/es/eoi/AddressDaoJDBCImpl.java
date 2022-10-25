package edu.es.eoi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressDaoJDBCImpl implements AddressDao {

	@Override
	public void create(Address adress) throws Exception {
		Connection con = null;
		try {
			con = Utils.getConnection();

			String query = "INSERT INTO `usuariosdao`.`address` (`id`, `name`, `address`, `number`, `apartment`, `zipcode`) VALUES ('?', '?', '?', '?', '?', '?');";

			PreparedStatement st = con.prepareStatement(query);

			st.setInt(1, adress.getId());
			st.setString(2, adress.getName());
			st.setString(3, adress.getAdress());
			st.setInt(4, adress.getNumber());
			st.setString(5, adress.getApartment());
			st.setInt(6, adress.getZipCode());
			
			st.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

		
	}

	@Override
	public Address read(int id) throws Exception {
		Connection con = null;
		Address address = null;

		try {
			con = Utils.getConnection();

			String query = "SELECT * FROM user where ID=?";

			PreparedStatement st = con.prepareStatement(query);

			st.setInt(1, id);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				address = new Address();
				address.setId(rs.getInt("id"));
				address.setName(rs.getString("name"));
				address.setAdress(rs.getString("address"));
				address.setNumber(rs.getInt("number"));
				address.setApartment(rs.getString("apartment"));
				address.setZipCode(rs.getInt("zipcode"));
			}

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

		return address;

	}

	@Override
	public void update(Address adress) throws Exception {
		Connection con = null;
		try {
			con = Utils.getConnection();
			
			String query = "UPDATE adress SET `name`=?, `address`=?, `number`=?, `apartment`=?, `zipcode`=? WHERE ID =?";

		PreparedStatement st = con.prepareStatement(query);

		
		st.setString(1, adress.getName());
		st.setString(2, adress.getAdress());
		st.setInt(3, adress.getNumber());
		st.setString(4, adress.getApartment());
		st.setInt(5, adress.getZipCode());
		st.setInt(6, adress.getId());
		st.executeUpdate();

	} catch (Exception e) {
		throw e;
	} finally {
		con.close();
	}
	}

	@Override
	public void delete(int id) throws Exception {
		Connection con = null;

		try {
			con = Utils.getConnection();

			String query = "DELETE FROM adress where ID=?";

			PreparedStatement st = con.prepareStatement(query);

			st.setInt(1, id);

			st.executeUpdate();

		} catch (SQLException e) {
			throw e;
		} finally {
			con.close();
		}
		
	}

}
