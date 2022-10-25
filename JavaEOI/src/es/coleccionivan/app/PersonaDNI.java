

package es.coleccionivan.app;

import java.util.Comparator;

public class PersonaDNI implements Comparable<PersonaDNI>{

	

	private String DNI;

	

	private String Nombre;

	private String Apellidos;

	

	public PersonaDNI(String DNI,String Nombre,String Apellidos) {
		this.DNI = DNI;
		this.Nombre = Nombre;

		this.Apellidos = Apellidos;	

		

	}

	

	public String getApellidos() {

		return Apellidos;

	}

		

	

	public String getNombre() {

		return Nombre;

	}


	public String getDNI() {

		return DNI;

	}


	@Override

	public String toString() {

		return "PersonaDNI [DNI=" + DNI +", Nombre=" + Nombre + ", Apellidos=" + Apellidos + "]";

	}



	@Override
	public int compareTo(PersonaDNI o1) {
		
		return o1.getDNI().compareTo(this.getDNI());
	}

	

	

}

