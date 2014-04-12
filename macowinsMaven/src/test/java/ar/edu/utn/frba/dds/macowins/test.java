package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.time.Month;

public class test {
	public static void main(String[] args){
		
		// Creo el negocio: macowins
		Negocio macowins = new Negocio();
		
		// Inicializo las variables estaticas de las Prendas
		Prenda.inicializarTasaDeImportacionEnPorcentaje(30);
		Prenda.inicializarValorFijoNegocio(50);
		
		// Creo las Marcas
		Armani marcaArmani = new Armani();
		Sarkany marcaZarcany = new Sarkany();
		
		// Creo las prendas
		Saco sacoArmani = new Saco(marcaArmani, true, 4);
		Camisa camisaArmani = new Camisa(marcaArmani, true);
		Pantalon pantalonArmani = new Pantalon(marcaArmani, true, 40);
		Sombrero sombreroSarkany = new Sombrero(marcaZarcany, false, 80);
		Zapatos zapatosSarkany = new Zapatos(marcaZarcany, false, 43);
		
		// Creo las fechas de venta
		LocalDate fechaVenta1 = LocalDate.of(2014, Month.APRIL, 9);
		LocalDate fechaVenta2 = LocalDate.of(2014, Month.APRIL, 20);
		LocalDate fechaVenta3 = LocalDate.of(2014, Month.MAY, 2);
		
		// Agrego las ventas
		macowins.vender(fechaVenta1, sacoArmani, 1);
		macowins.vender(fechaVenta1, camisaArmani, 3);
		macowins.vender(fechaVenta2, pantalonArmani, 2);
		macowins.vender(fechaVenta2, sombreroSarkany, 1);
		macowins.vender(fechaVenta3, zapatosSarkany, 2);
	
		// Obtengo ganancias
		macowins.gananciasDelDia(fechaVenta1);
		macowins.gananciasDelDia(fechaVenta2);
		macowins.gananciasDelDia(fechaVenta2);
		
		// llala
	
	}
}
