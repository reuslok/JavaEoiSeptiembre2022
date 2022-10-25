package es.eoi.app.Autoescuela;

public class Listado {
	private Alumno lista;
	private boolean apto=false;
	public Listado(Alumno lista) {

		this.lista = lista;
		if(lista.getNotaPractico()>4.9)
			if(lista.getNotaTeorico()>4.9)
				apto = true;
	}
	public Alumno getLista() {
		return lista;
	}
	public boolean isApto() {
		return apto;
	}

}
