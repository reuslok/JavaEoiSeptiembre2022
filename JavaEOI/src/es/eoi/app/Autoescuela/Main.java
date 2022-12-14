package es.eoi.app.Autoescuela;

public class Main {
	
	public static void main(String[] args) {
		
		Alumno[] alumnos= new Alumno[10];
		
		for(int i =0;i<alumnos.length;i++) {
			alumnos[i]= new Alumno("alumno"+(i+1), Math.random()*10, Math.random()*10);
			System.out.println(alumnos[i].getNombre()+" "+alumnos[i].getNotaTeorico()+" "+alumnos[i].getNotaPractico());
		}
		
		Listado[] lista= new Listado[10];
		for(int i =0;i<lista.length;i++) {
			lista[i] = new Listado(alumnos[i]);
		}
		Resumen resumen=new Resumen(lista);
		resumen.ImprimeResumen();
	/*	APTOS:
			- Enrique (Nota: 6.5) T:6.0 / P:7.0
			- Paula (Nota: 5.0) T:5.0 / P:5.0
			- Roberto (Nota: 7.0) T:7.5 / P:6.5
			NO APTOS:
			- Sandra (Nota: 4.5) T:4.0 / P:5.0 > PC: 17/11/2020
			- Antonio (Nota: 4.5) T:4.5 / P:4.5 > PC: 25/11/2020
			T: Teórico, P: Práctico, PC: Próxima Convocatoria*/
	}
}
