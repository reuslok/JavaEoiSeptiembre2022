package Enums;

public class AlumnosEnums implements Comparable <AlumnosEnums> {
private String nombre;
private CalificacionesEnums calificaciones;
private Double nota;
public AlumnosEnums(String nombre, CalificacionesEnums calificaciones,Double nota) {
	super();
	this.nombre = nombre;
	this.calificaciones = calificaciones;
	this.nota= nota;
}


public CalificacionesEnums getCalificaciones() {
	return calificaciones;
}


@Override
public String toString() {
	return calificaciones + "("+nota.intValue()+")-"+ nombre;
}




@Override
public int compareTo(AlumnosEnums otroAlumno) {
		
	return otroAlumno.getNota().compareTo(this.getNota());
}


public Double getNota() {
	return nota;
}



	
}
