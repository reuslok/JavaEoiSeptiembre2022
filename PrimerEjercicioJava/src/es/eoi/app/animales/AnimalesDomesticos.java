package es.eoi.app.animales;

public class AnimalesDomesticos {

	public static void main(String[] args) {

		Perro[] perros= new Perro[5];
		
		Gato[] gatos = new Gato[5];
		
		Raton[] ratones =new Raton[5];
		for(int i=0; i < perros.length;i++) {
			Perro perro= new Perro("Perro", 10+i, 100+3*i);
			perros[i]=perro;
			Gato gato= new Gato("Gato", 10+i, 100+3*i);
			gatos[i]=gato;
			Raton raton= new Raton("Raton", 10+i, 100+3*i);
			ratones[i]=raton;
		}
	for(Perro perro:perros) {
		System.out.println(perro.nombre+" es un perro pesa "+perro.getPeso()+" y mide "+ perro.getPeso());
		}
	for(Gato gato:gatos) {
		System.out.println(gato.getNombre()+" es un gato pesa "+gato.getPeso()+" y mide "+ gato.getPeso());
		}
	for(Raton raton:ratones) {
		System.out.println(raton.getNombre()+" es un raton pesa "+raton.getPeso()+" y mide "+ raton.getPeso());
		}
	}
}

