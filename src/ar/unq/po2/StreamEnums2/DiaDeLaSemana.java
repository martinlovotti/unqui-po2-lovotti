package ar.unq.po2.StreamEnums2;

public enum DiaDeLaSemana {
	LUNES("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Miercoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	String dia;
	
	DiaDeLaSemana(String dia){
		this.dia = dia;
	}
}
