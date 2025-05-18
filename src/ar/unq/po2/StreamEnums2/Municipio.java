package ar.unq.po2.StreamEnums2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Municipio {
	List<ActividadSemanal> actividades;
	
	public Municipio(List<ActividadSemanal> actividades){
		this.actividades = actividades;
	}
	
	public List<ActividadSemanal> SoloFutbol(){
		return actividades.stream()
		.filter(a -> a.getDeporte() == Deporte.FUTBOL)
		.toList();
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
	    return actividades.stream()
	            .filter(a -> a.getDeporte().getComplejidad() == complejidad)
	            .toList();
	}
	
	public int horasTotales() {
		return actividades.stream() 
				.mapToInt(ActividadSemanal:: duracion)
	            .sum();
	}
	
	public Optional<ActividadSemanal> menorCosto(Deporte d) {
		return actividades.stream()
				.filter(a -> a.getDeporte() == d)
				.min(Comparator.comparing(a->a.costo()));
	}
	
}
