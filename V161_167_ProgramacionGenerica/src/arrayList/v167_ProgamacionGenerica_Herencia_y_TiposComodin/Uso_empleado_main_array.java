package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

import java.util.Date;
import java.util.GregorianCalendar;

/* Se esta relizando todo el ejercicio en un solo archivo en otras palabras se cola colaron todos
 * los metdo clase en un solo fichero (Todas la clases main y demas) */

// Clase Empleado
class EmpleadoArry {


	// Varaibles de Instancia
	private String nombre;// primitivo
	private Double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)
	private int id;

	// Varaibles de Clase (static)
	private static int contador = 0;// por ... se inicia en cero

	/*
	 * ** CONSTRUCTOR firma -_Numero ,tipo, y orden de parametro_- (String nombre,
	 * double sueldo, int ahno,int mes, int,dia) **
	 */
	public EmpleadoArry(String nombre, double sueldo, int ahno, int mes, int dia) {
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


	// ** SOBRE CARGA DEL CONSTRUCTOR firma -Numero ,tipo, y  orden  de  parametro- Empleado(String nombre) ***
	public EmpleadoArry(String nombre) {

		this(nombre, 30000, 2000, 01, 01); // Invocando constructor de la misma (clase tercer uso del this).
		
	}

	// ** SOBRE CARGA DEL CONSTRUCTOR firma -_Numero ,tipo, y orden de parametro_-
	public EmpleadoArry() { // Constructor por defecto << Sin Parametros >>


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

	public void setSueldo(Double sueldo) {
		if (sueldo != null && sueldo > 0) {
			this.sueldo = sueldo;
		}
	}

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		if (altaContrato != null) {
			this.altaContrato = altaContrato;
		}
	}

	public void setSubeSueldo(double porcentaje) {

		if (porcentaje < 0) {
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}
	// Fin de GETTERS Y SETTERS


}
// Fin Clase Empleado


// Clase Jefatura
class Jefatura extends EmpleadoArry {

	// CONSTRUCTOR DE LA CLASE
	public Jefatura(String nombre, double sueldo, int ahno, int mes, int dia) {

		super(nombre, sueldo, ahno, mes, dia);

	};

	private double incentivo;
	
	// GETTERS Y SETTERS
@Override
public double getSueldo() { // Sobre escribe el metodo el metodo getSueldo() de EmpleadoArray()
	
	double sueldoJefe = super.getSueldo(); // Invocando el metodo getSueldo de la clase Padre
	return sueldoJefe + this.incentivo;
}

	public void setIncentivo(double incentivo) {
		if (incentivo < 0) {
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

	public static void main(String[] args) {

		EmpleadoArry[] misEmpleados = new EmpleadoArry[7];
		Jefatura[] misJefes = new Jefatura[2];

		


		misEmpleados[0] = new EmpleadoArry("Ivor Guzmán", 85000, 1990, 12, 17); // almasenado objetos de super-clase <
		misEmpleados[1] = new EmpleadoArry("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new EmpleadoArry("Maria Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new EmpleadoArry("Alexande Guzmán"); // Constructoe sobrecargado

		misEmpleados[4] = new EmpleadoArry(); // Constructor sobre cargado.
		misEmpleados[5] = new EmpleadoArry(); //
		misEmpleados[6] = new EmpleadoArry(); //


		System.out.println("******************************************************");
		System.out.println("");



		// *********** POLIMORFISMO ( Principio de sustitucion Metodo1) **************
		Jefatura jefe_RRHH = new Jefatura("Alex Zambrano", 55000, 2006, 9, 25);
		misEmpleados[4] = jefe_RRHH;// almasenado objetos de sub-clase < HIJA >(Jefatura)
		jefe_RRHH.setIncentivo(1000000);
		System.out.printf("      Insetivo para  jefe_RRHH ==>  %.2f%n%n ", jefe_RRHH.getIncentivo());




		// *********** POLIMORFISMO ( Principio de Casting Metodo2) **************
		misEmpleados[5] = new Jefatura("6_Maria", 95000, 1999, 5, 26);// almasenado objetos de sub clase HI (Jefatura)
		// Casting de Objeto(convertir objeto de un tipo en otro): Jefatura jefaFinanzas
		// = (Jefatura) misEmpleados[5]
		Jefatura jefaCompras =  (Jefatura) misEmpleados[5];
		jefaCompras.setIncentivo(3000000);
		System.out.printf("      Insetivo para  jefaCompras ==>  %.2f%n%n ", jefaCompras.getIncentivo());




		// *********** POLIMORFISMO ( Principio de sustitucion repitiendo Metodo1)
		// **************
		Jefatura jefaCompras2 = new Jefatura("Pepe Perez", 35000, 2006, 9, 25);
		misEmpleados[6] = jefaCompras2;// almasenado objetos de sub-clase < hija > tipo(Jefatura) en la clase < PADRE >
										// tipo(Empleado)
		jefaCompras2.setIncentivo(9000000);
		System.out.printf("      Insetivo para  jefaCompras2 ==>  %.2f%n%n ", jefaCompras2.getIncentivo());


		/*
		 * // **** BUCLE FOR TRADICIONAL ***** for (int i = 0; i < misEmpleado.length;
		 * i++) {
		 * 
		 * misEmpleado[i].setSubeSueldo(5);
		 * 
		 * System.out.println("misEmpleado:" + misEmpleado[i].getId());
		 * System.out.println("Id :" + misEmpleado[i].getId());
		 * System.out.println("Nombre :" + misEmpleado[i].getNombre());
		 * System.out.println("Sueldo :" + misEmpleado[i].getSueldo());
		 * System.out.println("Fecha de alta :" + misEmpleado[i].getAltaContrato());
		 * System.out.println("************************************************");
		 * System.out.println(""); }
		 * 
		 */

		// System.out.printf(" Insetivo para los Jefes_V50 ==> %.2f%n%n ",
		// jefe_RRHH.getIncentivo());
		
		





		
		for (EmpleadoArry e : misEmpleados) {


			e.setSubeSueldo(5);// Metodo para aumentar el sueldo 5%

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































