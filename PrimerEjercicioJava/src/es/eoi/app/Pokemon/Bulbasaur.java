package es.eoi.app.Pokemon;

public class Bulbasaur extends Pokemon{

	public Bulbasaur(int code, int hp, int attack, int defense, String type) {
		super(code, hp, attack, defense, type);

	}
	public String avatar;
	@Override
	public void attack() {
		System.out.println("Soy Bulbasaur y hago"+attack*2+" puntos de daño");
	}
	
	
}
