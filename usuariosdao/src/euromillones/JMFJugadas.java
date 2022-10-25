package euromillones;

public class JMFJugadas {
	private int[] numeros;
	private int[] estrellas;
	public JMFJugadas() {

		this.numeros = new int[JMFEuromillones.NUMEROMAXIMO];
		this.estrellas = new int[JMFEuromillones.ESTRELLASMAXIMO];
		
	}
	public int[] getNumeros() {
		return numeros;
	}
	public int[] getEstrellas() {
		return estrellas;
	}
	
	
}
