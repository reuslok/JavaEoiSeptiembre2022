package es.eoi.app.Biblioteca;

public class Book extends Article implements Loanable {

	private boolean lean=false;
	int id;
	String title;
	int year;
	public Book(int id, String title, int year) {
		super(id, title, year);
		this.id=id;
		this.title=title;
		this.year=year;
		}

	

	@Override
	public void Lend() {
		lean=true;
		
	}

	@Override
	public void Return() {
		lean=false;
	}



	public boolean isLean() {
		return lean;
	}



	public void setLean(boolean lean) {
		this.lean = lean;
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

	

}
