package ar.edu.utn.frba.dds.macowins;

public abstract class Prenda {
	
	static int valorFijoDelNegocio;
	static double tasaDeImportacion;
	boolean importada;
	Marca marca;
	
	public static void inicializarTasaDeImportacionEnPorcentaje(double tasa){
		Prenda.tasaDeImportacion = tasa;
	}
	
	public static void inicializarValorFijoNegocio(int valorFijo){
		Prenda.valorFijoDelNegocio = valorFijo;
	}
	
	protected Prenda(Marca marca, boolean importada){
		this.marca = marca;
		this.importada = importada;
	}
	
	private double dameTasaDeImportacion(){
		double tasaDeImp;
		
		if(importada)
			tasaDeImp = (100 + Prenda.tasaDeImportacion) / 100;
		else
			tasaDeImp = 1;
		
		return tasaDeImp;
	}
	
	public double precioFinal(){
		double precioAux; 
		precioAux = ( Prenda.valorFijoDelNegocio + this.precioBaseDeLaPrenda() ) 
								* this.dameTasaDeImportacion() 
								+ this.marca.dameCoeficiente(this.precioBaseDeLaPrenda());
		return precioAux;
	}
	
	protected abstract int precioBaseDeLaPrenda();
}
