package ar.edu.utn.frba.dds.macowins;

public class Sombrero extends Prenda {

	int coeficienteDeMetrosexualidad;
	
	public Sombrero(Marca marca, boolean importada,int coeficienteDeMetrosexualidad) {
		super(marca, importada);
		this.coeficienteDeMetrosexualidad = coeficienteDeMetrosexualidad;
	}
	
	@Override
	protected int precioBaseDeLaPrenda() {
		return 150 + this.coeficienteDeMetrosexualidad;
	}

}
