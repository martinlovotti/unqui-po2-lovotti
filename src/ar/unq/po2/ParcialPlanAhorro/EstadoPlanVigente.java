package ar.unq.po2.ParcialPlanAhorro;

public class EstadoPlanVigente extends EstadoPlan {

	@Override
	public void pagarCuota(PlanAhorro p) {
		p.aniadirPago("nuevoPago");
	}

	@Override
	public void setearRetribucion(PlanAhorro planAhorro, Retribucion r) {
		//NADA
	}

	@Override
	public void ejecutarRetribucion(PlanAhorro planAhorro) {
		//nada}
	}

	@Override
	public int getCuotas(PlanAhorro p) {
		if(p.cantidadCuotas - p.pagos.size() == 0) {
			p.estadoActual = new EstadoPlanFinalizado();
			return p.cantidadCuotas - p.pagos.size();
		}else { return p.cantidadCuotas - p.pagos.size();}
	}

}
