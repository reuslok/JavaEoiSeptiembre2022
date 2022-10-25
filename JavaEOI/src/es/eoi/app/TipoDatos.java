package es.eoi.app;

public class TipoDatos {

	public static void main(String[] args) {
		
		String[] Nombre= {"juan", "pedro", "maria","ezequiel","david","cesar","maya","laura","juan","jose"};

		String[] Apellidos= {"garcia garcia","morcillo conejo","virgen santa","fernandez iglesias", "motos marin","perez lopez","ortega gracia", "martin moreno","trujillo torre","moreno torres"};
		int[] Día_de_Nacimiento= {01,20,30,15,02,05,23,25,15,12};
		int[] Mes_de_Nacimiento= {01,12,02,03,05,02,11,9,10,04};
		int[] Año_de_Nacimiento= {1980,1960,-23,1993,2000,2001,1995,1982,1974,1975};
		String[] Ciudad={"madrid","cordoba","nazaret","yecla","lepe","orito","calpe","alicante","murcia","alcantarilla"};
		boolean[] Estudiais= {true,false,false,true,false,false,false,true,false,true};
		boolean[] Trabajais= {false,true,false,true,false,false,false,true,false,true};
		char[] HM= {'H','M','M','H','H','H','M','M','H','H'};
		for(int i = 0; i < Nombre.length; i++) {
		System.out.println("Hola me llamo " + Nombre [i] +" "+ Apellidos[i]+" y tengo "+ (2022 - Año_de_Nacimiento[i])  +" años."); 
		System.out.println("Nací el " + Día_de_Nacimiento[i] +" del " + Mes_de_Nacimiento[i] +" de " + Año_de_Nacimiento[i] + " y vivo en "+ Ciudad[i]+ ".");
		
		if(Estudiais[i] && Trabajais[i]){
		System.out.println("Actualmente estudio y trabajo\n");
		}
		else if (Estudiais[i] == true) {
			System.out.println("Actualmente estudio y no trabajo\n");
		} 
		else if(Trabajais[i] == true) {
			System.out.println("Actualmente no estudio pero trabajo\n");
		} 
		else {
			System.out.println("Actualmente ni estudio ni trabajo\n");
		}
			}
		
	}

}
