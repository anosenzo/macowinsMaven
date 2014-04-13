package ar.edu.utn.frba.dds.macowins;

public class Camisa extends Prenda {

	protected Camisa(Marca marca, boolean importada) {
		super(marca, importada);
	}

	@Override
	protected int precioBaseDeLaPrenda() {
		return 200;
	}

}
