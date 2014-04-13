package ar.edu.utn.frba.dds.macowins;

public class Saco extends Prenda {

	int cantidadDeBotones;
		
	public Saco(Marca marca, boolean importada,int cantidadDeBotones) {
		super(marca, importada);
		this.cantidadDeBotones = cantidadDeBotones;
	}
	
	@Override
	protected int precioBaseDeLaPrenda() {
		
		return 300 + this.cantidadDeBotones * 10;
	}

}
