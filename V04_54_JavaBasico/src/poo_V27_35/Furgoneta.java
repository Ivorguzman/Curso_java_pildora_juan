package poo_V27_35;


// Vehiculo()      --> Super Clase( Clase Padre)
// Furgoneta ()    --> Sub-Clase( Clase Hija/Hijo)
public class Furgoneta extends Vehiculo {

	private int capacidad_carga_F;
	private int plazas_extra;

// CONSTRUCTOR
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super(); // Llama el constructor de la clase padre
		this.capacidad_carga_F = capacidad_carga;
		this.plazas_extra = plazas_extra;

	}

	/**
	 * @return el capacidad_carga_F
	 */
	public int getCapacidad_carga_F() {
		return this.capacidad_carga_F;
	}

	/**
	 * @param capacidad_carga_F el capacidad_carga_F a establecer
	 */
	public void setCapacidad_carga_F(int capacidad_carga) {
		
		if (capacidad_carga > 0) {
			this.capacidad_carga_F = capacidad_carga;

	}
		
	}


	/**
	 * @return el plazas_extra
	 */
	public int getPlazas_extra() {
		return this.plazas_extra;
	}

	/**
	 * @param plazas_extra el plazas_extra a establecer
	 */
	public void setPlazas_extra(int plazas_extra) {
		this.plazas_extra = plazas_extra;
	}

	public String datosGeneralesFurgoneta() {

		return "Capasidad de carga:" + this.getCapacidad_carga_F() + " Kgs. \nPlazas: " + this.getPlazas_extra()
				+ " personas.";
	}

}
