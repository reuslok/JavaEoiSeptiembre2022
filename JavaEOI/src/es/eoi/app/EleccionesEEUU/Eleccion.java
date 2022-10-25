package es.eoi.app.EleccionesEEUU;

public class Eleccion {
	private int estados;
	private Candidato[] candidatos;

	
	public Eleccion(int estados, Candidato[] candidatos) {
		this.estados = estados;
		this.candidatos = candidatos;
	}

	public int getEstados() {
		return estados;
	}

	public Candidato[] getCandidatos() {
		return candidatos;
	}
	public void Recuento() {
		int j=1;
		System.out.println("¡Las Elecciones entre "+candidatos[0].getCandidato()+" y "+candidatos[1].getCandidato()+" comienzan!");
		
		do {
			System.out.println("RESULTADO DE LAS ELECCIONES "+j);
			for(int i=0;i<estados;i++) {
				if(Math.round(Math.random())==0) {
					candidatos[0].setVotos(candidatos[0].getVotos()+1);
				}
				else
					candidatos[1].setVotos(candidatos[1].getVotos()+1);
				}
			System.out.println("El candidato "+ candidatos[0].getCandidato()+ " con: "+ candidatos[0].getVotos());
			System.out.println("El candidato "+ candidatos[1].getCandidato()+ " con: "+ candidatos[1].getVotos());
				if(candidatos[0].getVotos()>candidatos[1].getVotos())
					System.out.println("Gana "+candidatos[0].getCandidato());
				else if(candidatos[0].getVotos()<candidatos[1].getVotos())
					System.out.println("Gana "+candidatos[1].getCandidato());
				else {
					System.out.println("EMPATE");
					j+=1;
				}
			}
		while(candidatos[0].getVotos()!=candidatos[1].getVotos());
	}
}
