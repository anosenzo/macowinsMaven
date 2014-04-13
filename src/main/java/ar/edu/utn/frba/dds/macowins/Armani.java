package ar.edu.utn.frba.dds.macowins;

public class Armani implements Marca {

	@Override
	public double dameCoeficiente(double precioBaseProducto) {
		return precioBaseProducto * 0.65;
	}

}
