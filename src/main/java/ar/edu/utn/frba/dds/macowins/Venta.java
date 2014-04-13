package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;

public class Venta {
	
	LocalDate fecha;
	Prenda prenda;
	int cantidad;
	
	public Venta(LocalDate fecha, Prenda prenda, int cantidad){
		this.fecha = fecha;
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	public double dameImporteVenta(){
		return prenda.precioFinal() * this.cantidad;
	}
	
}
