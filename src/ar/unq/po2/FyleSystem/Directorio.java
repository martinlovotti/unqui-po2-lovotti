package ar.unq.po2.FyleSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class Directorio implements FyleSystem {
	private String name;
	private LocalDateTime fechaCreacion;
	private LocalDateTime ultimaModificacion;
	private List<FyleSystem> carpetas;
	
	public LocalDateTime getFechaModificacion() {
	    return ultimaModificacion;
	}

	public LocalDateTime getFechaCreacion() {
	    return fechaCreacion;
	}
	@Override
	public int totalSize() {
		int total = 0;
		for(FyleSystem a : carpetas) {
			total += a.totalSize();
		}
		return total;
	}
	
	@Override
	public void printStructura() {
		printStructuraHelper(0);
	}
	private void printStructuraHelper(int nivel) {
        String indent = "  ".repeat(nivel);
        System.out.println(indent + "Directorio: " + name);
        for (FyleSystem a : carpetas) {
            if (a instanceof Directorio) {
                ((Directorio) a).printStructuraHelper(nivel + 1);
            } else {
                a.printStructura(); // los archivos no necesitan nivel
            }
        }
    }
	
	@Override
	public FyleSystem lastModified() {
		FyleSystem masReciente = this;
		for (FyleSystem elem : carpetas) {
	        FyleSystem candidato = elem.lastModified();
	        if (candidato.getFechaModificacion().isAfter(masReciente.getFechaModificacion())) {
	            masReciente = candidato;
	        }
	    }
	    return masReciente;
	}
	@Override
	public FyleSystem oldestElement() {
		FyleSystem masViejo = this;
		for (FyleSystem elem : carpetas) {
	        FyleSystem candidato = elem.lastModified();
	        if (candidato.getFechaModificacion().isBefore(masViejo.getFechaModificacion())) {
	            masViejo = candidato;
	        }
	    }
	    return masViejo;
	}
	
	public void aniadirArchivo(FyleSystem a) {
		carpetas.add(a);
	}
	
	public Directorio(String n) {
		this.name = n;
		LocalDateTime f = LocalDateTime.now();
		this.fechaCreacion = f;
		this.ultimaModificacion = f;
		this.carpetas = new ArrayList<>();
		
	}
}
