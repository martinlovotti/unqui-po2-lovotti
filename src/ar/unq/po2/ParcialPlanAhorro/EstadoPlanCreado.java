package ar.unq.po2.ParcialPlanAhorro;

public class EstadoPlanCreado extends EstadoPlan {

	@Override
	public void pagarCuota(PlanAhorro p) {
		p.aniadirPago("nuevoPago");
		p.estadoActual = new EstadoPlanVigente();
	}

	@Override
	public void setearRetribucion(PlanAhorro planAhorro, Retribucion r) {
		// TODO Auto-generated method stub
		planAhorro.setRetribucion(r);
	}

	@Override
	public void ejecutarRetribucion(PlanAhorro planAhorro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCuotas(PlanAhorro p) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
