package ar.edu.utn.frba.dds.macowins;

public class Zapatos extends Prenda {
	
	int talle;
	
	public Zapatos(Marca marca, boolean importada, int talle) {
		super(marca, importada);
		this.talle = talle;
	}
	
	@Override
	protected int precioBaseDeLaPrenda() {
		return 400 + 5 * this.talle;
	}

}
