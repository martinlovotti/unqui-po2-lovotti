package ar.unq.po2.ParcialPlanAhorro;

public class Cliente {
	private String nombre;
	private PlanAhorro plan;
	private int cbu;
	
	
	public void setRetribucion(Retribucion r) {
		plan.setearRetribucion(r);
	}
	
	public void ejecutarRetribucion() {
		plan.ejecutarRetribucion();
	}
	
	public void pagarCuota() {
		plan.pagarCuota();
	}
	
	public int getCuotas() {
		// TODO Auto-generated method stub
		return plan.getCuotas();
	}

}
