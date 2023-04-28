package PrimerasClases;

public class ManejaPuntos {

	public static void main(String[] args) {
		// Esta clase sirve para ver si he pensado bien
		// la clase Punto
		int x=2;
		double y=3.1416;
		char l='A';
		boolean respuesta=true;
		String palabra;
		Punto miPrimerPuntito;
		miPrimerPuntito=new Punto(2,3);
		System.out.println("Este punto dista del origen: ");
		System.out.println(miPrimerPuntito.devuelveDistanciaOrigen());
		

	}

}
