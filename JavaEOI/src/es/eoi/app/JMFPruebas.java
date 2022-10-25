package es.eoi.app;

public class JMFPruebas {

	public static void main(String[] args) {
		
		
			}
	public static int puntuacionde1a5(String contrasenya) {
		
		char[] iterablePass = contrasenya.toCharArray();
		int puntuacion=0;
		boolean[] comprobado= {false,false,false,false};
		if(iterablePass.length >= 8) {
			puntuacion++;
			comprobado[3] = true;
		}
		for(int i= 0;i < iterablePass.length;i++) {
			if(Character.isUpperCase(iterablePass[i]) && !comprobado[0]) {
				puntuacion++;
				comprobado[0] = true;
			}
			if(Character.isLowerCase(iterablePass[i]) && !comprobado[1]) {
				puntuacion++;
				comprobado[1] = true;
			if(iterablePass[i] == '*'||iterablePass[i] == '?' || iterablePass[i] == '_' && !comprobado[1]) {
				puntuacion +=2;
				comprobado[2] = true;
			
			
				}
			}
		}
		
		return puntuacion;
		
	}
}
