package es.eoi.app;

public class MesesJMF2 {

	public static void main(String[] args) {
	//Declaracion del array y sus valores
	String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	int i = 1;
	
		
	//Sin iterador
	
	//Impresion de cada valor en una linea diferente
	System.out.println("El 1º mes del año es " + Meses[0]);
	System.out.println("El 2º mes del año es " + Meses[1]);
	System.out.println("El 3º mes del año es " + Meses[2]);
	System.out.println("El 4º mes del año es " + Meses[3]);
	System.out.println("El 5º mes del año es " + Meses[4]);
	System.out.println("El 6º mes del año es " + Meses[5]);
	System.out.println("El 7º mes del año es " + Meses[6]);
	System.out.println("El 8º mes del año es " + Meses[7]);
	System.out.println("El 9º mes del año es " + Meses[8]);
	System.out.println("El 10º mes del año es " + Meses[9]);
	System.out.println("El 11º mes del año es " + Meses[10]);
	System.out.println("El 12º mes del año es " + Meses[11]);
	for(String mes : Meses ) {
	switch (mes) {
	case "Enero":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 30 dias");
		break;
	case "Febrero":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 28 dias");
		break;
	case "Marzo":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 30 dias");
		break;
	case "Abril":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 31 dias");
		break;
	case "Junio":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 30 dias");
		break;
	case "Julio":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 31 dias");
		break;
	case "Agosto":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 30 dias");
		break;
	case "Septiembre":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 31 dias");
		break;
	case "Octubre":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 30 dias");
		break;
	case "Noviembre":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 31 dias");
		break;
	case "Diciembre":
		System.out.println(mes + " es el "+ i + "º mes del año y tiene 30 dias");
		break;
	}
	i++;
	}
	
	}

}
