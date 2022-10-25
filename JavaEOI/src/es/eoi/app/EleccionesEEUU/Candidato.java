package es.eoi.app.EleccionesEEUU;

public class Candidato {
	private String candidato;
	private int votos=0;
	public Candidato(String candidato) {
		this.candidato = candidato;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public String getCandidato() {
		return candidato;
	}
	
}
