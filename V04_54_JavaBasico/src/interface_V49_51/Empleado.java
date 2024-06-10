package interface_V49_51;

import java.util.Date;
import java.util.GregorianCalendar;

import interface_V49_51.interfaces.Itf_Trabajadores_V51;




@SuppressWarnings("rawtypes")
/*
 * Se esta relizando todo el ejercicio en un solo archivo en otras palabras se cola colaron todos
 * los metdo clase en un solo fichero (Todas la clases main y demas)
 *
 */

class Empleado implements Comparable, Itf_Trabajadores_V51 {


	// Varaibles de Instancia
	private String nombre;// Objeto se usa como primitivo
	private double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)
	private int id;

	// Varaibles de Clase o campo (static)
	private static int contador = 0;// por ser una variable de control se inicia en cero


	// CONSTRUCTOR firma :_Numero ,tipo, y orden de parametro (String nombre,
	// double sueldo, int ahno,int mes, int,dia)
	public Empleado(String nombre, double sueldo, int ahno, int mes, int dia) {
		// System.out.println("29 this ==>" + this);
		// System.out.println("------------------------------------------------------");

		++contador;

		this.id = contador;
		this.nombre = nombre;
		this.sueldo = sueldo;

		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia); // sobre carga del constructor
		this.altaContrato = calendario.getTime();
		System.out.println("");
	}



	// Metodo de interfaz V51
	@Override
	public double estableceBonus(double gratificacion) {

		return Itf_Trabajadores_V51.bonus_base + gratificacion;
	}

	// ** SOBRE CARGA DEL CONSTRUCTOR ***
	public Empleado(String nombre) {

		this(nombre, 30, 2000, 01, 01); // Invocando constructor de la misma clase (tercer uso del this() con[parentesis] ).

	}

	// ** SOBRE CARGA DEL CONSTRUCTOR **
	public Empleado( ) { // Constructor << Sin Parametros >>


	}

	// GETTER Y SETTERS
	public int getId() {
		return this.id;
	};

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

	public void setSueldo(double sueldo) {

		if (sueldo <= 0){
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		this.sueldo = sueldo;
	}

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {


		if (altaContrato != null){
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		this.altaContrato = altaContrato;
	}

	public void setSubeSueldo(double porcentaje) {

		if (porcentaje <= 0){
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}
	// Fin de GETTERS Y SETTERS


	// Implementando metodo de la Interfas Comparable: compareTo(Object miObjeto)
	@Override
	public int compareTo(Object miObjeto) {
		// Casting de Objeto(convertir objeto de un tipo en otro): de Object a (Empleado)
		// compare to retorna dato de tipo entero
		// y se hace un casting de entero a Empleado
		Empleado otroEmpleado = (Empleado) miObjeto;


		/*
		 * if (this.id < otroEmpleado.id){
		 * System.out.println();
		 * System.out.println("++++++ INICIO Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		 * System.out.println("this.sueldo ==>" + this.sueldo);
		 * System.out.println("otroEmpleado.sueldo ==>" + otroEmpleado.sueldo);
		 * System.out.println("VALOR = -1");
		 * System.out.println("++++++ FIN Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		 * System.out.println();
		 * return -1;
		 * }
		 * if (this.id > otroEmpleado.id){
		 * System.out.println();
		 * System.out.println("++++++ INICIO Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		 * System.out.println("this.sueldo ==>" + this.sueldo);
		 * System.out.println("otroEmpleado.sueldo ==>" + otroEmpleado.sueldo);
		 * System.out.println("VALOR = 1");
		 * System.out.println("++++++ FIN Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		 * System.out.println();
		 * return 1;
		 * }
		 * System.out.println();
		 * System.out.println("++++++ INICIO Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		 * System.out.println("this.sueldo ==>" + this.sueldo);
		 * System.out.println("otroEmpleado.sueldo ==>" + otroEmpleado.sueldo);
		 * System.out.println("VALOR = 0");
		 * System.out.println("++++++ FIN Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		 * System.out.println();
		 * return 0;
		 */



		if (this.sueldo < otroEmpleado.sueldo){
			System.out.println();
			System.out.println("++++++ INICIO Analisis como compara compareTo(Object miObjeto) +++++++++ ");
			System.out.println("this.sueldo ==>" + this.sueldo);
			System.out.println("otroEmpleado.sueldo ==>" + otroEmpleado.sueldo);
			System.out.println("VALOR = -1");
			System.out.println("++++++ FIN Analisis como compara compareTo(Object miObjeto) +++++++++ ");
			System.out.println();
			return -1;
		}

		if (this.sueldo > otroEmpleado.sueldo){
			System.out.println();
			System.out.println("++++++ INICIO Analisis como compara compareTo(Object miObjeto) +++++++++ ");
			System.out.println("this.sueldo ==>" + this.sueldo);
			System.out.println("otroEmpleado.sueldo ==>" + otroEmpleado.sueldo);
			System.out.println("VALOR = 1");
			System.out.println("++++++ FIN Analisis como compara compareTo(Object miObjeto) +++++++++ ");
			System.out.println();
			return 1;
		}
		System.out.println();
		System.out.println("++++++ INICIO Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		System.out.println("this.sueldo ==>" + this.sueldo);
		System.out.println("otroEmpleado.sueldo ==>" + otroEmpleado.sueldo);
		System.out.println("VALOR = 0");
		System.out.println("++++++ FIN Analisis como compara compareTo(Object miObjeto) +++++++++ ");
		System.out.println();
		return 0;

	}












}







































