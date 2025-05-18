package ar.unq.po2.StreamEnums1;

public enum Lesion {
	ROJO("Rojo",1){
		@Override
		public void Siguiente() {
			System.out.println("Siguiente: Gris");
		}
	},
	GRIS("Gris",2){
		@Override
		public void Siguiente() {
			System.out.println("Siguiente: Amarillo");
		}
	},
	AMARILLO("Amarillo",3){
		@Override
		public void Siguiente() {
			System.out.println("Siguiente: Miel");
		}
	},
	MIEL("Miel",4){
		@Override
		public void Siguiente() {
			System.out.println("Siguiente: Rojo");
		}
	};
	
	
	String descripcion;
	int nivelRiesgo;
	
	Lesion(String descrip, int riesgo){
		this.descripcion = descrip;
		this.nivelRiesgo = riesgo;
	}
	
	public void imprimir() {
		System.out.println("Gravedad: " + descripcion + nivelRiesgo);
	}
	
	public void Siguiente() {		
		System.out.println("Gravedad: " + descripcion + nivelRiesgo) ;
	}
		
}
