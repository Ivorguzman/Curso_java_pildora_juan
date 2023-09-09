package poo_V27_35;

//Vehiculo()      --> Super Clase( Clase Padre)
//Coche ()        --> Sub-Clase( Clase Hija/Hijo)
public class Coche extends Vehiculo {

	private int capacidad_carga_C;
	private int plazas;
	private int numeroPuertas;

//CONSTRUCTOR
	public Coche(int plazas, int capacidad_carga) {
		super();// Llama el constructor de la clase padre
		this.capacidad_carga_C = capacidad_carga;
		this.plazas = plazas;
	}

	public int getNumeroPuertas() {
		return this.numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String datosGeneralesCoche() {

		return "Capasidad de carga:" + this.capacidad_carga_C + " Kgs. \nPlazas: " + this.plazas + " personas.";
	}

}
