package es.eoi.app;

public class JMFPoema {

	public static void main(String[] args) {
		String Poema="No entres dócilmente en esa buena noche.\r\n"
				+ "La vejez debería delirar y arder cuando se acaba el día.\r\n"
				+ "Rabia, rabia, contra la luz que se esconde.\r\n"
				+ "Aunque el sabio cerca del fin a la tiniebla no haga reproche,\r\n"
				+ "dado que a su verbo ningún rayo ha confiado vigor,\r\n"
				+ "no entra dócilmente en esa buena noche.\r\n"
				+ "Rabia, rabia, contra la luz que se esconde";
		System.out.println(Poema);
		char[] letras= {'a','A','e','E','i','I','o','O','u','U'};
		int PunteroLetras=0;
		int contadorAa=0;
		int contadorEe=0;
		int contadorIi=0;
		int contadorOo=0;
		int contadorUu=0;
		
		for(int i=0; i<Poema.length(); i++) {
			if(Poema.charAt(i) == letras[PunteroLetras] || Poema.charAt(i) == letras[PunteroLetras+1]) {
				contadorAa++;
				}
			
			}
			
		PunteroLetras += 2;
		System.out.println("- Nº Vocales – A/a: "+ contadorAa );
		
		
		
		
		for(int i=0; i<Poema.length(); i++) {
			if(Poema.charAt(i) == letras[PunteroLetras] || Poema.charAt(i) == letras[PunteroLetras]+1) contadorEe++;
			}
		PunteroLetras += 2;
		System.out.println("- Nº Vocales – E/e: "+ contadorEe );

		
		
		for(int i=0; i<Poema.length(); i++) {
			if(Poema.charAt(i) == letras[PunteroLetras] || Poema.charAt(i) == letras[PunteroLetras+1]) contadorIi++;
			}
		PunteroLetras += 2;
		System.out.println("- Nº Vocales – I/i: "+ contadorIi );
		
		

		
		for(int i=0; i<Poema.length(); i++) {
			if(Poema.charAt(i) == letras[PunteroLetras] || Poema.charAt(i) == letras[PunteroLetras]+1) contadorOo++;
			}
		PunteroLetras += 2;
		System.out.println("- Nº Vocales – O/o: "+ contadorOo );

		

		
		for(int i=0; i<Poema.length(); i++) {
			if(Poema.charAt(i) == letras[PunteroLetras] || Poema.charAt(i) == letras[PunteroLetras+1]) contadorUu++;
			}
		PunteroLetras += 2;
		System.out.println("- Nº Vocales – U/u: "+ contadorAa );
		System.out.println("- Nº Vocales Totales "+ (contadorAa + contadorEe+ contadorIi+ contadorOo + contadorUu) );
		
		

		
	}

}
