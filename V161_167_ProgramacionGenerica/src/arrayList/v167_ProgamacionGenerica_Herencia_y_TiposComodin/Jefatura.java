package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;


// Clase Jefatura
class Jefatura extends Empleado {

	private double incentivo;

	// CONSTRUCTOR DE LA CLASE
	public Jefatura(String nombre, double sueldo, int ahno, int mes, int dia) {

		// LLamada al contructor de la clase de la que hereda osea constructor de la clase padre (Empleado)
		// le pasa los argumentos (nombre, sueldo, ahno, mes, dia);
		super(nombre, sueldo, ahno, mes, dia);

	};

	// ** SOBRE CARGA 1 DEL CONSTRUCTOR ***
	public Jefatura(String nombre, int edad, double sueldo) {
		super(nombre, edad, sueldo);


	};

	// GETTERS Y SETTERS
	@Override
	public double getSueldo() { // Sobre escribe el metodo el metodo getSueldo() de EmpleadoArray()

		double sueldoJefe = super.getSueldo(); // Invocando el metodo getSueldo de la clase Padre
		return sueldoJefe + this.incentivo;
}

	public void setIncentivo(double incentivo) {
		if (incentivo < 0){
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		this.incentivo = incentivo;
	}
	// Fin de GETTERS Y SETTERS



	public double getIncentivo() {
		return this.incentivo;
	}





}
// Fin clase Jefetura
