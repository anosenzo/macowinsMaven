package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegocioTest {
	
	Negocio macowins;
	
	// Marcas
	Armani marcaArmani;
	Sarkany marcaZarcany;
    
	// Prendas
	Saco sacoArmani;
	Camisa camisaArmani;
	Pantalon pantalonArmani;
	Sombrero sombreroSarkany;
	Zapatos zapatosSarkany;
			
	// Fecha Ventas
	LocalDate fechaVenta1;
	LocalDate fechaVenta2; 
	LocalDate fechaVenta3;
	
    @Before
    public void init() {
        this.macowins = new Negocio();
        
        Prenda.inicializarTasaDeImportacionEnPorcentaje(30);
		Prenda.inicializarValorFijoNegocio(50);
		
		marcaArmani = new Armani();
		marcaZarcany = new Sarkany();
		
		// Creo las prendas
		sacoArmani = new Saco(marcaArmani, true, 4);
		camisaArmani = new Camisa(marcaArmani,false);
		pantalonArmani = new Pantalon(marcaArmani, true, 40);
		sombreroSarkany = new Sombrero(marcaZarcany, false, 80);
		zapatosSarkany = new Zapatos(marcaZarcany, false, 43);
		
		// Creo las fechas de venta
		fechaVenta1 = LocalDate.of(2014, Month.APRIL, 9);
		fechaVenta2 = LocalDate.of(2014, Month.APRIL, 20);
		fechaVenta3 = LocalDate.of(2014, Month.MAY, 2);
		
		// Agrego las ventas
		macowins.vender(fechaVenta1, sacoArmani, 1);
		macowins.vender(fechaVenta3, camisaArmani, 3);
		macowins.vender(fechaVenta2, pantalonArmani, 2);
		macowins.vender(fechaVenta2, sombreroSarkany, 1);
		macowins.vender(fechaVenta1, zapatosSarkany, 2);
    }


    @Test
    public void testMarcaDameCoeficiente(){
    	Assert.assertEquals(130, marcaArmani.dameCoeficiente(200d),0.01);
    	Assert.assertEquals(20, marcaZarcany.dameCoeficiente(200d),0.01);
    	Assert.assertEquals(210, marcaZarcany.dameCoeficiente(600d),0.01);
    }
    
    @Test
    public void testPrendaPrecioBase(){
    	Assert.assertEquals(200, camisaArmani.precioBaseDeLaPrenda());
    	Assert.assertEquals(340, sacoArmani.precioBaseDeLaPrenda());
    	Assert.assertEquals(290, pantalonArmani.precioBaseDeLaPrenda());
    	Assert.assertEquals(615, zapatosSarkany.precioBaseDeLaPrenda());
    	Assert.assertEquals(230, sombreroSarkany.precioBaseDeLaPrenda());
    }
    
    @Test
    public void testPrendaPrecioFinal(){
    	Assert.assertEquals(380, camisaArmani.precioFinal(), 0.01);
    	Assert.assertEquals(728, sacoArmani.precioFinal(), 0.01);
    	Assert.assertEquals(630.5, pantalonArmani.precioFinal(), 0.01);
    	Assert.assertEquals(880.25, zapatosSarkany.precioFinal(), 0.01);
    	Assert.assertEquals(303, sombreroSarkany.precioFinal(), 0.01);
    }
    
    @Test
    public void testNegocioGananciasDelDia(){
    	Assert.assertEquals(2488.5, macowins.gananciasDelDia(fechaVenta1), 0.01);
    	Assert.assertEquals(1564, macowins.gananciasDelDia(fechaVenta2), 0.01);
    	Assert.assertEquals(1140, macowins.gananciasDelDia(fechaVenta3), 0.01);
    }
    
    
    
    
	
}
