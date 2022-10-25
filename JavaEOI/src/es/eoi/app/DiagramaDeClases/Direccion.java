package es.eoi.app.DiagramaDeClases;

public class Direccion {

	private String calle;
	
	private String ciudad;
	
	private String codigoPostal;
	
	private String pais;
	
	public void imprimirDireccion() {
		
		System.out.println(this.calle.concat(", ").concat(this.ciudad));
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
