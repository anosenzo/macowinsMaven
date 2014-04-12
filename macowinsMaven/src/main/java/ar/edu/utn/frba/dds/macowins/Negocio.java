package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.HashSet;

public class Negocio {
	HashSet<Venta> ventas = new HashSet<Venta>();
	
	public void vender(LocalDate fechaVenta, Prenda prenda, int cantidad){
		this.ventas.add(new Venta(fechaVenta, prenda, cantidad));
	}
	
	public double gananciasDelDia(LocalDate unaFecha){
		return ventas.stream().filter( venta -> venta.fecha == unaFecha )
							  .mapToDouble( venta -> venta.dameImporteVenta() )
							  .sum();
		
//		return ventas.stream().filter( venta -> venta.fecha == unaFecha )
//				  .map( venta -> venta.dameImporteVenta() )
//				  .reduce( 0.0, (Double total, Double importeVenta) -> total + importeVenta );
	}
	
	public double precioPrenda(Prenda unaPrenda){
		
		return unaPrenda.precioFinal();
		
	}
}
