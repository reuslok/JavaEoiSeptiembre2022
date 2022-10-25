package es.eoi.app.Pokemon;

public class Pokemon {

	public int code;
	public int hp;
	public int attack;
	public int defense;
	public String type;
	
	public void attack() {
		System.out.println("Hago: "+attack+" puntos de daño.");
	}

	public Pokemon(int code, int hp, int attack, int defense, String type) {
		super();
		this.code = code;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.type = type;
	}
	
}
