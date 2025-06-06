package ar.unq.po2.ParcialPlanAhorro;

import java.util.List;

public class Concesionaria {
	private List<Cliente> clientes;
	
	public int getTotalPendientes() {
		return	clientes.stream()
		.mapToInt(c->c.getCuotas())
		.sum();
	}
	
}
