package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

import java.util.Date;
import java.util.GregorianCalendar;

// Clase Empleado
class Empleado {


	// Varaibles de Instancia
	private int id;// primitivo
	private String nombre;// referenciado (Tipo Objeto)
	private String cargo;// referenciado (Tipo Objeto)
	private Double sueldo;// referenciado (Tipo Objeto)
	private Date altaContrato;// referenciado (Tipo Objeto)

	// Varaibles de Clase (static)
	private static int contador = 0;// por ... se inicia en cero





	// ** CONSTRUCTOR ***
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



	// ** SOBRE CARGA DEL CONSTRUCTOR ***
	public Empleado( ) { // Constructor por defecto << Sin Parametros >>


	}



	// ** SOBRE CARGA DEL CONSTRUCTOR ***
	public Empleado( String nombre, String cargo) {
		System.out.println("Volores por defecto del this ==>" + this);
		this.nombre = nombre;
		this.cargo = cargo;
		System.out.println("Volores instanciados del this ==>" + this);
		
	}


	// ** SOBRE CARGA DEL CONSTRUCTOR ***
	public Empleado(String nombre) {

		this(nombre, 30000, 2000, 01, 01); // Invocando constructor de la misma (clase tercer uso del this).

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

	/* , la implementación predeterminada del método toString() en la clase base Object no incluye detalles específicos de los atributos de tu clase personalizada. */

	@Override
	public String toString() {
		return "Empleado [nombre=" + this.nombre + ", sueldo=" + this.sueldo + ", altaContrato=" + this.altaContrato + ", id=" + this.id + ", cargo=" + this.cargo + "]";
	}

}
// Fin Clase Empleado
