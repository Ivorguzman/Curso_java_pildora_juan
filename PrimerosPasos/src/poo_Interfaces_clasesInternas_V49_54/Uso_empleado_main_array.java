package poo_Interfaces_clasesInternas_V49_54;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;




@SuppressWarnings("rawtypes")
/*
 * Se esta relizando todo el ejercicio en un solo archivo en otras palabras se cola colaron todos
 * los metdo clase en un solo fichero (Todas la clases main y demas)
 *
 * */

// Clase Empleado
class Empleado implements Comparable, Trabajadores_V51 {


	// Varaibles de Instancia
	private String nombre;// Objeto se usa como primitivo
	private double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)
	private int id;





	// Varaibles de Clase (static)
	private static int contador = 0;// por ... se inicia en cero

	/*
	 * ** CONSTRUCTOR firma -_Numero ,tipo, y orden de parametro_- (String nombre,
	 * double sueldo, int ahno,int mes, int,dia) **
	 */
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
	@Override public double estableceBonus(double gratificacion) {

		return Trabajadores_V51.bonus_base + gratificacion;
	}

	// ** SOBRE CARGA DEL CONSTRUCTOR firma -Numero ,tipo, y  orden  de  parametro- Empleado(String nombre) ***
	public Empleado(String nombre) {

		this(nombre, 30000, 2000, 01, 01); // Invocando constructor de la misma (clase tercer uso del this).
		
	}

	// ** SOBRE CARGA DEL CONSTRUCTOR firma -_Numero ,tipo, y orden de parametro_-
	public Empleado() { // Constructor por defecto << Sin Parametros >>


	}

	// GETTER Y SETTERS
	public int getId() {
		return this.id;
	}
	;
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null) {
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


		if (altaContrato != null) {
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		this.altaContrato = altaContrato;
	}

	public void setSubeSueldo(double porcentaje) {

		if (porcentaje <= 0) {
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}
	// Fin de GETTERS Y SETTERS


	@Override public int compareTo(Object miObjeto) {

		Empleado otroEmpleado = (Empleado) miObjeto;

		if (this.id < otroEmpleado.id){

			return -1;
		}
		if (this.id > otroEmpleado.id){
			return 1;
		}
		return 0;



	}


	@Override public String toString() {
		return "Empleado [nombre=" + this.nombre + ", id=" + this.id + "]";
	}




}
// Fin Clase Empleado


// Clase Jefatura
class Jefatura extends Empleado implements Jefes_V50 {

	// CONSTRUCTOR DE LA CLASE
	public Jefatura(String nombre, double sueldo, int ahno, int mes, int dia) {

		super(nombre, sueldo, ahno, mes, dia);

	};

	// Metodo de interfaz V50
	@Override public String tomar_deciciones(String decision) {
		return "Decision Resolucion 1203 : " + decision;
	}

	// Metodo de interfaz V51
	@Override public double estableceBonus(double gratificacion) {
		double primaJefatura = 2000;

		return Trabajadores_V51.bonus_base + gratificacion + primaJefatura;
	}


	private double incentivo;
	
	// GETTERS Y SETTERS

@Override
public double getSueldo() { // realazandolo sobre escribiendo el metodo getSueldo()
	
	double sueldoJefe = super.getSueldo(); // Invocando el metodo getSueldo de la clase Padre
	return sueldoJefe + this.incentivo;
}


/*
 * public double SueldoJefe() {// realazandolo creando el metodo SueldoJefe()
 * double sueldoJefe = super.getSueldo(); // Invocando el metodo getSueldo de la
 * clase Padre return sueldoJefe + this.incentivo;
 * 
 * }
 */

	public void setIncentivo(double incentivo) {
		if (incentivo <= 0){
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




// ********* CLASE PRINCIPAL (main) ****************

public class Uso_empleado_main_array {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Empleado[] misEmpleados = new Empleado[7];
		Jefatura[] misJefes = new Jefatura[2];

		
		misEmpleados[0] = new Empleado("Ivor Guzmán", 85000, 1990, 12, 17); // almasenado objetos de super-clase <
		misEmpleados[1] = new Empleado("Ana López", 200000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Alexande Guzmán"); // Constructoe sobrecargado

		misEmpleados[4] = new Empleado(); // Constructor sobre cargado.
		misEmpleados[5] = new Empleado(); //
		misEmpleados[6] = new Empleado(); //


		System.out.println("******************************************************");
		System.out.println("");



		// *********** POLIMORFISMO ( Principio de sustitucion Metodo1) **************
		// V43
		Jefatura jefe_RRHH = new Jefatura("Alex Zambrano", 55000.34, 2006, 9, 25);
		misEmpleados[4] = jefe_RRHH;// almasenado objetos de sub-clase < HIJA >(jefe_RRHH) en objeto < PADRE
									// >(Empleado) ( JEFATURA EXTIENDE DE Empleado)
		jefe_RRHH.setIncentivo(1000000);
		System.out.printf("      Insetivo para  jefe_RRHH ==>  %.2f%n%n ", jefe_RRHH.getIncentivo());




		// *********** POLIMORFISMO ( Principio de Casting Metodo2) ************** V43
		misEmpleados[5] = new Jefatura("6_Maria", 95000, 1999, 5, 26);// almasenado objetos de sub clase HI (Jefatura)
		// Casting de Objeto(convertir objeto de un tipo en otro): Jefatura jefaFinanzas
		// = (Jefatura) misEmpleados[5]
		Jefatura jefaCompras =  (Jefatura) misEmpleados[5];
		jefaCompras.setIncentivo(3000000);
		System.out.printf("      Insetivo para  jefaCompras ==>  %.2f%n%n ", jefaCompras.getIncentivo());




		// *** POLIMORFISMO ( Principio de sustitucion repitiendo Metodo1) ****** V43
		Jefatura jefa_Finananzas = new Jefatura("Pepe Perez", 35000, 2006, 9, 25);
		misEmpleados[6] = jefa_Finananzas;// almasenado objetos de sub-clase < hija > tipo(Jefatura) en objetos de clase <
										// PADRE > (class Jefatura extends Empleado)

		jefa_Finananzas.setIncentivo(9000000);
		System.out.printf("      Insetivo para  jefaCompras2 ==>  %.2f%n%n ", jefa_Finananzas.getIncentivo());

		
		// Principio de sustitucion
		Empleado director_comercial = new Jefatura("Sandra", 85000,2012, 05, 05);

		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06, 07);



		// Metodo instanceof V50
		if (director_comercial instanceof Empleado){
			System.out.println("Director_comercial es de tipo Jefatura");
			System.out.println("  ");
		}
		if (ejemplo instanceof Comparable){
			System.out.println("ejemplo implementa la interfaz Comparable");
			System.out.println("  ");
		}
		if (jefa_Finananzas instanceof Jefatura){
			System.out.println("jefa_Finananzas  es de tipo Jefatura");
			System.out.println("  ");
		}
		if (misEmpleados[0] instanceof Empleado){
			System.out.println(misEmpleados[0] + " es de tipo Empleado");
			System.out.println("  ");
		}
		if (misEmpleados[5] instanceof Empleado){
			System.out.println(misEmpleados[5] + " es de tipo Empleado");
			System.out.println("  ");
		}



		// _____________ Metodo de interfaz JefesV50 _____________

		System.out.println(
				jefa_Finananzas
						.tomar_deciciones("Jefa de Finanzas 6 meses de Vacaciones  mas bono escolar de 3 meses"));


		System.out.println(
				jefaCompras.tomar_deciciones(
						"Jefa de Compras  6 meses de Vacaciones mas (10%/ventasMes) de comiciones escolares"));

		// _____________ Fin Metodo de interfaz Jefes V50 __________





		// _____________ Metodo de interfaz Trabajadores V51 ________

		System.out.println("Bonus Jefatura Finanzas  : " + "ID :" + jefa_Finananzas.getId() + "  " + "Nombre: "
				+ jefa_Finananzas.getNombre()
				+ " Bonus : " + jefa_Finananzas.estableceBonus(500));


		System.out.println("Bonus Empleado : " + "ID: " + misEmpleados[3].getId() + " " + "Nombre: "
				+ misEmpleados[3].getNombre() + " " + "Bonus: " + misEmpleados[3].estableceBonus(200));

		// _____________ Fin Metodo de interfaz Trabajadores V51 _____________


		System.out.println(" ");
		// Metodo para aumentar el sueldo 5%
		for (Empleado e : misEmpleados){

			e.setSubeSueldo(5);

		}

		Arrays.sort(misEmpleados);

		for (Empleado e : misEmpleados) {



			// System.out.println("Valor de e ==> " + e);
			// System.out.println("Valor de misEmpleado ==> " + misEmpleados);
			System.out.println("Id :" + e.getId());
			System.out.println("Nombre :" + e.getNombre());
			

			/*
			 * Llama al metodo getSueldo() de Empleado Ó Llama al metodo getSueldo() de
			 * Jefatura en: misEmpleados[5] y misEmpleados[6] segun contexto: (ENLAZADO
			 * DINAMICO DE LA MVJ)
			 */
			System.out.printf("Sueldo %.2f$%n:", e.getSueldo());


			System.out.println("Fecha de alta :" + e.getAltaContrato());
			System.out.println("************************************************");
			System.out.println("");
		}




	}



}































