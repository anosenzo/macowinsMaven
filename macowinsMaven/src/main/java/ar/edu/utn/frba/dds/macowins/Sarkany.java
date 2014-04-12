package ar.edu.utn.frba.dds.macowins;

public class Sarkany implements Marca {

	@Override
	public double dameCoeficiente(double precioBaseProducto) {
		if(precioBaseProducto > 500)
			return precioBaseProducto * 0.35;
		else
			return precioBaseProducto * 0.10;
	}

}
