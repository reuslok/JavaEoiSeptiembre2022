package es.eoi.app.Autoescuela;

import java.time.LocalDate;

public class Resumen {
	private Listado[] lista;
	private LocalDate fecha;
	
	public Resumen(Listado[] lista) {
		this.lista=lista;
	}

	public void ImprimeResumen() {
		System.out.println("APTOS:");
		for(Listado listaAptos:this.lista) {
			Alumno alumno=listaAptos.getLista();
			if (listaAptos.isApto()) {
				System.out.println("- "+alumno.getNombre()+"(Nota: "
						+((alumno.getNotaTeorico()+alumno.getNotaPractico())/2)+
						" T:"+alumno.getNotaTeorico()+" / P:"+alumno.getNotaPractico());
			
			}
		}
		System.out.println("NO APTOS:");
		for(Listado listaNoaptos:this.lista) {
			Alumno alumnoSuspendido=listaNoaptos.getLista();
			if (!listaNoaptos.isApto()) {
				if(alumnoSuspendido.getNotaPractico()<5&&alumnoSuspendido.getNotaTeorico()<5) {
					System.out.println("- "+alumnoSuspendido.getNombre()+"(Nota: "
							+((alumnoSuspendido.getNotaTeorico()+alumnoSuspendido.getNotaPractico())/2)+
							" T:"+alumnoSuspendido.getNotaTeorico()+" / P:"+alumnoSuspendido.getNotaPractico()
							+"PC: "+ LocalDate.now().plusWeeks(2));
					}
				else {
					System.out.println("- "+alumnoSuspendido.getNombre()+"(Nota: "
							+((alumnoSuspendido.getNotaTeorico()+alumnoSuspendido.getNotaPractico())/2)+
							" T:"+alumnoSuspendido.getNotaTeorico()+" / P:"+alumnoSuspendido.getNotaPractico()
							+"PC: "+ LocalDate.now().plusWeeks(1));
				}
			}
			
			
			}
		}
	}

