package Enums;

public enum CalificacionesEnums {
	
	INSUFICIENTE(0.0),
	SUFICIENTE(5.0),
	BIEN(6.0),
	NOTABLE(7.0),
	SOBRESALIENTE(10.0);
	
	

	private final Double notaMinima;


	public Double getNotaMinima() {
		return notaMinima;
	}

	private CalificacionesEnums(Double notaMinima) {
		this.notaMinima = notaMinima;
	}

	public static CalificacionesEnums getCalificacionesEnums(Double nota) {
		CalificacionesEnums Calificacion= INSUFICIENTE;
		for(CalificacionesEnums estaCalificacion:values()) {
			if(estaCalificacion.notaMinima<=nota)
				Calificacion=estaCalificacion;
		}
		return Calificacion;
		
	}
	
	
	
}
