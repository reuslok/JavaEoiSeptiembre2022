package es.eoi.app.Biblioteca;

public class Magazine extends Article{
	
	int number=0;
	public int getNumber() {
		return number;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	int id;
	String title;
	int year;
	public Magazine(int id, String title, int year,int number) {
		super(id, title, year);
		this.id=id;
		this.title=title;
		this.year=year;
		this.number=number;
	}

	
}
