package poo;

public class Uso_Vehiculo_main {

	public static void main(String[] args) {
		
		
		Coche fiat_1600 = new Coche(4, 300);
		Coche fiat_2000 = new Coche(5, 400);

		fiat_1600.setColor("Gris");
		fiat_1600.datosGenerales();
		


		fiat_2000.setColor("Rojo");
		fiat_2000.datosGenerales();
		

		System.out.println("fiat_1600 color = " + fiat_1600.getColor());
		System.out.println(fiat_1600.datosGenerales() + fiat_1600.datosGeneralesCoche());
		
		System.out.println("________________________________");
		System.out.println("");

		System.out.println("fiat_2000 color = " + fiat_2000.getColor());
		System.out.println(fiat_2000.datosGenerales() + fiat_2000.datosGeneralesCoche());
		
		
		Furgoneta furgonetaMiriafiori_1600 = new Furgoneta(7, 880);

		furgonetaMiriafiori_1600.setColor("Azul");
		furgonetaMiriafiori_1600.setAsientos("si");
		furgonetaMiriafiori_1600.setClimatizador("si");

		System.out.println("________________________________");
		System.out.println("");

		System.out.println("furgonetaMiriafiori_1600 color: " + furgonetaMiriafiori_1600.getColor());
		System.out.println("furgonetaMiriafiori_1600: " + furgonetaMiriafiori_1600.getAsientos());
		System.out.println("furgonetaMiriafiori_1600: " + furgonetaMiriafiori_1600.getclimatizador());
		System.out.println("furgonetaMiriafiori_1600: " + furgonetaMiriafiori_1600.datosGenerales()
				+ furgonetaMiriafiori_1600.datosGeneralesFurgoneta());
		
	}

}



