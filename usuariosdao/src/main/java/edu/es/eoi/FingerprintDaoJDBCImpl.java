package edu.es.eoi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FingerprintDaoJDBCImpl implements FingerprintDao {

	@Override
	public void create(Fingerprint fingerprint) throws Exception {
		// TODO Auto-generated method stub

		Connection con = null;
		try {
			con = Utils.getConnection();

			String query = "INSERT INTO fingerprint (scandate,finger,image,iduser) " + "VALUES (?,?,?,?)";

			PreparedStatement st = con.prepareStatement(query);
			
			st.setDate(1, new Date(fingerprint.getScandate().getTime()));
			st.setString(2, fingerprint.getFinger());
			st.setString(3, fingerprint.getImage());
			st.setInt(4, fingerprint.getIduser());
			
			st.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

	}
	

	@Override
	public Fingerprint read(int id) throws Exception {
		Connection con = null;
		Fingerprint fingerprint = null;

		try {
			con = Utils.getConnection();

			String query = "SELECT * FROM fingerprint where ID=?";

			PreparedStatement st = con.prepareStatement(query);

			st.setInt(1, id);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				fingerprint = new Fingerprint();
				fingerprint.setId(rs.getInt("id"));
				fingerprint.setFinger(rs.getString("finger"));
				fingerprint.setImage(rs.getString("image"));
				fingerprint.setIduser(rs.getInt("iduser"));
				fingerprint.setScandate(rs.getDate("scandate"));
			}

		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}

		return fingerprint;

	}


	@Override
	public void update(Fingerprint fingerprint) throws Exception {

		Connection con = null;
		try {
			con = Utils.getConnection();
			
			String query = "UPDATE fingerprint SET scandate = ?, finger = ?, image = ?, iduser = ? WHERE ID = ? ;";

			PreparedStatement st = con.prepareStatement(query);

			st.setDate(1, fingerprint.getScandate());
			st.setString(2, fingerprint.getFinger());
			st.setString(3, fingerprint.getImage());
			st.setInt(4, fingerprint.getIduser());
			st.setInt(5, fingerprint.getId());
			
			st.executeUpdate();

		} catch (SQLException e) {
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
			
			String query = "DELETE fingerprint WHERE ID = ? ;";

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
