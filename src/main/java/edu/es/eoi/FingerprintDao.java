package edu.es.eoi;

public interface FingerprintDao {
	void create(Fingerprint fingerprint) throws Exception;

	Fingerprint read(int id) throws Exception;

	void update(Fingerprint fingerprint) throws Exception;

	void delete(int id) throws Exception;

}
