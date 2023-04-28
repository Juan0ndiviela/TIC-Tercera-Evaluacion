package Ejercicios_Clases;

public class BarcoVelasCuadradas extends Barco{
	private boolean tieneVelasCuadradas;
	public BarcoVelasCuadradas(String nombreBarco, int tamano, int numeroPalos, boolean tieneVelasCuadradas) {
		super(nombreBarco, tamano, numeroPalos);
		this.tieneVelasCuadradas=tieneVelasCuadradas;
		// TODO Auto-generated constructor stub
	}
	public boolean isTieneVelasCuadradas() {
		return tieneVelasCuadradas;
	}
	public void setTieneVelasCuadradas(boolean tieneVelasCuadradas) {
		this.tieneVelasCuadradas = tieneVelasCuadradas;
	}
	
	
}
