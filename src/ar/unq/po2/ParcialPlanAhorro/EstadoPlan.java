package ar.unq.po2.ParcialPlanAhorro;

public abstract class EstadoPlan {

	public abstract void pagarCuota(PlanAhorro p);
	public abstract void setearRetribucion(PlanAhorro planAhorro, Retribucion r);
	public abstract void ejecutarRetribucion(PlanAhorro planAhorro);
	public abstract int getCuotas(PlanAhorro p);
}
