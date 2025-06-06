package ar.unq.po2.ParcialPlanAhorro;

public class RetribucionAuto implements Retribucion{
	
	private FabricaAutomotriz r;
	
	@Override
	public void ejecutar(PlanAhorro p) {
		String marca = p.getMarca();
		String modelo = p.getModelo();
		r.comprarAutomóvil( marca, modelo);
		r.valorAutomóvil( marca,  modelo);
	}

}
