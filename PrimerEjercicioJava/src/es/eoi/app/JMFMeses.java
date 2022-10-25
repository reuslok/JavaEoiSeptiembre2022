package es.eoi.app;

import java.time.LocalDate;

public class JMFMeses {

	public static void main(String[] args) {

		LocalDate fechaInicio = LocalDate.now().withDayOfMonth(1);

		int IDia=1;

		int diaInt = fechaInicio.getDayOfWeek().getValue();


		boolean spacing=false;

		System.out.println(" " + fechaInicio.getMonth());

		System.out.println(" LU MA MI JU VI SA DO");

			for(int i=0;i <= 7;i++) {

				for(int j=0;j < 7;j++) {

					for(int k=1;k != diaInt && spacing == false;k++) {

						System.out.print("   ");
					}

					spacing = true;

					if(IDia <=fechaInicio.lengthOfMonth()) {

						if(IDia<10) {

							System.out.print(" 0"+(IDia));

						}

						else{

							System.out.print(" " +(IDia));

						}
						
						if(diaInt%7==0) {

							System.out.println();

						}
						IDia++;

						diaInt++;

						j++;

					}

				}

			}

		

	}
}


