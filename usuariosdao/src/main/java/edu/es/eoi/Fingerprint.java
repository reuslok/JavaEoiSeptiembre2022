package edu.es.eoi;

import java.sql.Date;

public class Fingerprint {
private int id;
private Date scandate;
private String finger;
private String image;
private int iduser;


public Fingerprint() {
	
};
public Fingerprint(int id, Date scandate, String finger, String image, int iduser) {
	this.id = id;
	this.scandate = scandate;
	this.finger = finger;
	this.image = image;
	this.iduser = iduser;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getScandate() {
	return scandate;
}
public void setScandate(Date scandate) {
	this.scandate = scandate;
}
public String getFinger() {
	return finger;
}
public void setFinger(String finger) {
	this.finger = finger;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public int getIduser() {
	return iduser;
}
public void setIduser(int iduser) {
	this.iduser = iduser;
}
}
