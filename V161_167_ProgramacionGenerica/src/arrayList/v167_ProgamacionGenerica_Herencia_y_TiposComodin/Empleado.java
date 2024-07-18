package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

import java.util.Date;
import java.util.GregorianCalendar;

// Clase Empleado
class Empleado {


	// Varaibles de Instancia
	private int id;// primitivo
	private int edad;// primitivo
	private String nombre;// referenciado (Tipo Objeto)
	private String cargo;// referenciado (Tipo Objeto)
	private double sueldo;// referenciado (Tipo Objeto)
	private Date altaContrato;// referenciado (Tipo Objeto)

	// Varaibles de Clase (static)
	private static int contador = 0;// por ... se inicia en cero


	// ** CONSTRUCTOR ***
	public Empleado(String nombre, String cargo, double sueldo, int ahno, int mes, int dia) {
		++contador;

		// System.out.println("Volores por defecto del this ==>" + this);
		// System.out.println("------------------------------------------------------");


		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia); // sobre carga del constructor
		this.id = contador;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.cargo=cargo;
		this.altaContrato = calendario.getTime();

		// System.out.println("Volores instanciados del this ==>" + this);
		System.out.println("");
	}



	// ** SOBRE CARGA 1 DEL CONSTRUCTOR ***
	public Empleado(String nombre, double sueldo, int ahno, int mes, int dia) {
		++contador;

		// System.out.println("Volores por defecto del this ==>" + this);
		// System.out.println("------------------------------------------------------");


		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia); // sobre carga del constructor
		this.id = contador;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.altaContrato = calendario.getTime();

		// System.out.println("Volores instanciados del this ==>" + this);
		System.out.println("");
	}



	// ** SOBRE CARGA 2 DEL CONSTRUCTOR ***
	public Empleado( ) { // Constructor por defecto << Sin Parametros >>


	}




	// ** SOBRE CARGA 3 DEL CONSTRUCTOR ***
	public Empleado(String nombre) {


		// Invocando constructor de la misma clase (tercer uso del this).
		this(nombre, "Desarrollador  Semi-Senior", 360000, 2025, 01, 01);

	}



	// ** SOBRE CARGA 4 DEL CONSTRUCTOR ***
	public Empleado( String nombre, String cargo) {
		System.out.println("Volores por defecto del this ==>" + this);
		this.nombre = nombre;
		this.cargo = cargo;
		System.out.println("Volores instanciados del this ==>" + this);
		
	}


	// ** SOBRE CARGA 5 DEL CONSTRUCTOR ***
	public Empleado(String nombre, int edad, double sueldo) {
		// System.out.println("Volores por defecto del this ==>" + this);
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		// System.out.println("Volores instanciados del this ==>" + this);

	}

	// ************************** GETTER Y SETTERS ***************************************


	public int getId() {
		return this.id;
	};


	public String getCargo() {
		return this.cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null){
			this.nombre = nombre;
		}
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(Double sueldo) {
		if (sueldo != null && sueldo > 0){
			this.sueldo = sueldo;
		}
	}

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		if (altaContrato != null){
			this.altaContrato = altaContrato;
		}
	}

	public void setSubeSueldo(double porcentaje) {

		if (porcentaje < 0){
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}
	// Fin de GETTERS Y SETTERS




	/*
	 * , la implementación predeterminada del método toString()
	 * en la clase base Object no incluye detalles específicos
	 * de los atributos de clases personalizada.
	 */


	// Metodos toString() Intrinsico por eclipse
	@Override
	public String toString() {
		return "Empleado [nombre=" + this.nombre + ", cargo=" + this.cargo + ", sueldo=" + this.sueldo + ", altaContrato=" + this.altaContrato + "]";
	}

}
// Fin Clase Empleado
