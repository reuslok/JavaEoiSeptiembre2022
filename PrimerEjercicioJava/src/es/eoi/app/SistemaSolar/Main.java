package es.eoi.app.SistemaSolar;

public class Main {

	public static void main(String[] args) {
		Planetas[] grupoplanetario = {
								new Planetas("mercurio", 46001200, 0, 4879.4),
								new Planetas("tierra", 150000000, 1, 12742)	
		};
		SistemaSolar[] sistemasolar1= {
				new SistemaSolar("sol", 3.8, 1.8,grupoplanetario)
		};
			System.out.println(sistemasolar1[0].getPlaneta()[0].getNombrePlaneta());
	}

}
