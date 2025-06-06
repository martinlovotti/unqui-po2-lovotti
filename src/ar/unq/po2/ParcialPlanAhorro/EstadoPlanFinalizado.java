package ar.unq.po2.ParcialPlanAhorro;

public class EstadoPlanFinalizado extends EstadoPlan {

	@Override
	public void pagarCuota(PlanAhorro p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setearRetribucion(PlanAhorro planAhorro, Retribucion r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejecutarRetribucion(PlanAhorro planAhorro) {
		planAhorro.ejecutar();
		planAhorro.estadoActual = new EstadoPlanCerrado();
	}

	@Override
	public int getCuotas(PlanAhorro p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
