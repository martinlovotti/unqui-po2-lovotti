package ar.unq.po2.StreamEnums2;

import java.time.LocalTime;
//Prueba
public class ActividadSemanal{
	private DiaDeLaSemana dia;
    private LocalTime horaInicio;
    private int duracion; // en horas
    private Deporte deporte;

	public ActividadSemanal(DiaDeLaSemana dia, LocalTime horaInicio, int duracion, Deporte deporte) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }

    public int costo() {
        int costoHoraBase = esDiaCaro() ? 1000 : 500;
        int costoPorHoras = costoHoraBase * duracion;
        int extraPorComplejidad = deporte.getComplejidad() * 200;

        return costoPorHoras + extraPorComplejidad;
    }

    private boolean esDiaCaro() {
        return dia == DiaDeLaSemana.JUEVES || dia == DiaDeLaSemana.VIERNES
                || dia == DiaDeLaSemana.SABADO || dia == DiaDeLaSemana.DOMINGO;
    }
    
    public Deporte getDeporte() {
        return this.deporte;
    }
    
    public int duracion() {
        return this.duracion;
    }
}
	
