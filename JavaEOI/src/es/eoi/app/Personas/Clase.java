package es.eoi.app.Personas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clase {

	public static void main(String[] args) {
		
		List<Persona> misPersonas = new ArrayList();
		misPersonas.add(new Persona("ANA", LocalDate.of(2010, 1, 1), 26, "74304112Y")); 
		misPersonas.add(new Persona("ALBA", LocalDate.of(1988, 1, 1), 21,"42344111T"));
		misPersonas.add(new Persona("ANA", LocalDate.of(2009, 1, 1),  26, "54104792B"));
		misPersonas.add(new Persona("ALBA", LocalDate.of(2007, 1, 1),  26,"54144893H"));
		
		Collections.sort(misPersonas);
		System.out.println(misPersonas.toString());
		
		
		
		
		
		
		
		
		
		
	}
}
