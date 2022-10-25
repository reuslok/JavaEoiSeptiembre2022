package edu.es.eoi;

public interface AddressDao {

		void create(Address adress) throws Exception;

		Address read(int id) throws Exception;

		void update(Address adress) throws Exception;

		void delete(int id) throws Exception;

	
}
