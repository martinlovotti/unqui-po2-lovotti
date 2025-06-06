package ar.unq.po2.ParcialPlanAhorro;

import java.util.List;

public class PlanAhorro {
	private Cliente titular;
	private Retribucion retribucion;
	int cantidadCuotas;
	EstadoPlan estadoActual;
	List<String> pagos;
	private String marca;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	protected void aniadirPago(String p) {
		pagos.add(p);
	}
	
	protected void ejecutar() {
		retribucion.ejecutar(this);
	}
	
	protected void setRetribucion(Retribucion r) {
		this.retribucion =r;
	}
	
	public void setearRetribucion(Retribucion r) {
		this.estadoActual.setearRetribucion(this, r);
	}
	
	public void ejecutarRetribucion() {
		this.estadoActual.ejecutarRetribucion(this);
	}
	
	public int getCuotas() {
		return this.estadoActual.getCuotas(this);
	}

	public void pagarCuota() {
		this.estadoActual.pagarCuota(this);
	}

}
