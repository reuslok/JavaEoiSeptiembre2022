package es.eoi.app.Pokemon;

public class App {

	public static void main(String[] args) {
		Pokemon pokemon1 = new Bulbasaur(1, 250, 50, 40, "Leaf");
		Pokemon pokemon2 = new Pikachu(2, 220, 30, 40, "thunder");
		
		pokemon1.attack();
	}

}
