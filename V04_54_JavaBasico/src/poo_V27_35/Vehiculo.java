package poo_V27_35;

public class Vehiculo {
	// Variables de clase
	private int pesoChasis;
	private int pesoTotaCoche;
	private int largo;
	private int ruedas;
	private int motor;
	private String color;
	private boolean asientos_cuero;
	private boolean climatizador;
	private float precio_coche;
	private int ancho;

	// CONSTRUCTOR
	public Vehiculo() {
		// System.out.println("15__ this(Vehiculo.java) ==> " + this);
		// System.out.println("____________________________________________");
		System.out.println("");
		this.ruedas = 4;
		this.largo = 2;
		this.ancho = 300;
		this.motor = 1600;
		this.pesoChasis = 500;

	}

	public int getPesoChasis() {
		return this.pesoChasis;
	}

	public void setPesoChasis(int peso) {
		if (peso > 0) {

			this.pesoChasis = peso;
		} else {
			this.pesoChasis = 0;
			System.out.println("Verifica el parametro");
		}

	}

	public int getPesoTotaCoche() {
		return this.pesoTotaCoche;
	}


	public void setPesoTotaCoche(int peso_Carroceria) {
		if (peso_Carroceria > 0) {
			this.pesoTotaCoche = peso_Carroceria + this.pesoChasis;
			if (this.climatizador == true) {
				this.pesoTotaCoche += 20;
			}
			if (this.asientos_cuero == true) {
				this.pesoTotaCoche += 50;
			}
		}
	}

	public int getRuedas() {
		return this.ruedas;
	}

	public void setRuedas(int ruedas) {
		if (ruedas > 0) {

			this.ruedas = ruedas;
		}
	}

	public void setAsientos(String asientos_cuero) {
		
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else if (asientos_cuero.equalsIgnoreCase("no")) {
			this.asientos_cuero = false;
		}
	}
	
	public String getAsientos() {
		if (this.asientos_cuero == true) {
			return "El vehiculo tiene asientos de cuero";
		}
		return "El vehiculo tiene asientos de serie";

	}



	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else if (climatizador.equalsIgnoreCase("no")) {
			this.climatizador = false;
		}
	}

	public String getclimatizador() {
		if (this.climatizador == true) {
			return "El vehiculo tiene Climatizador";
		}
		return "El vehiculo no iene  Climatizador";
	}

	public int getLargo() {
		return this.largo;
	}

	public void setLargo(int largo) {
		if (largo > 0) {
			this.largo = largo;
		}

	}

	/**
	 * @return el ancho
	 */
	public int getAncho() {
		return this.ancho;
	}

	/**
	 * @param ancho el ancho a establecer
	 */
	public void setAncho(int ancho) {
		if (this.largo > 0) {
			this.ancho = ancho;
		}

	}

	public int getMotor() {
		return this.motor;
	}

	public void setMotor(int motor) {
		if (motor > 0) {
			this.motor = motor;
		}
	}


	public void setColor(String color) {
		if (color != null) {
			this.color = color;

		} else {
			this.color = "Color no establecido";
			System.out.println("Verifica el parametro");
		}

	}

	public String getColor() {
		return this.color;
	}



	public float getPrecio_coche() {
		return this.precio_coche;
	}

	public void setPrecio_coche(float precio_inicial) {
		if (precio_inicial > 0) {
			float precio_final = precio_inicial;
			if (this.asientos_cuero == true) {
				precio_final += 2000;
			}
			if (this.climatizador == true) {
				precio_final += 1500;
			}
			this.precio_coche = precio_final;

		}

	}

	public String datosGenerales() {

		return "El cahasis del vehiculo tiene " + this.ruedas + " ruedas. \nMide " + this.largo + " metros de largo.\n"
				+ "Tiene un ancho de " + this.ancho + " cm.\n" + "Peso de Chasis " + this.pesoChasis + " Kgs.\n";
	}

	/*
	 * @Override public String toString() { return "Soy un carro";
	 * 
	 * }
	 * 
	 */

}






