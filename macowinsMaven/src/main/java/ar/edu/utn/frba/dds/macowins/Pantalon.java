package ar.edu.utn.frba.dds.macowins;

public class Pantalon extends Prenda {

	int cm2deTelaUsada;
	
	public Pantalon(Marca marca, boolean importada, int cm2deTelaUsada) {
		super(marca, importada);
		this.cm2deTelaUsada = cm2deTelaUsada;
	}

	@Override
	protected int precioBaseDeLaPrenda() {
		return 250 + this.cm2deTelaUsada;
	}

}
