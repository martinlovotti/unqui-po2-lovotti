package ar.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRecaudadora implements Agencia {
	private List<Cobrable> cobrados = new ArrayList<>();
	
	@Override
	public void registrarPago(Cobrable c) {
		System.out.println("Registrando pago: $" + c.calcularMonto());
		cobrados.add(c);
	}
	
	public void mostrarRecaudado() {
		double total = 0;
		for (Cobrable i : cobrados) {
			 total += i.calcularMonto();		
		}
		System.out.println("Total recaudado: $" + total);

	}

}
