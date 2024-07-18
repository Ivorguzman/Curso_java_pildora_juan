package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

import java.util.Date;
import java.util.GregorianCalendar;


// ********* CLASE PRINCIPAL (main) ****************

public class HerenciaGenericos_Main {

	public static void main(String[] args) {
		
		// ****************** POLIMORFISMO CON CLASES ORDINARIAS) *********************

		Empleado desarrolladorJr = new Empleado("Alexander Zambrano");
		Jefatura jefeSistemas = new Jefatura("Ívor Guzmán", 88000, 2028, 04, 01);

		// System.out.println("****************** POLIMORFISMO ( Jefatura extends Empleado) *********************");

		// PRINCIPIO DE SUSTITUCIÓN (ES UN) ==> jefeSistemas ES UN Empleado
		Empleado desarrolladorSr = jefeSistemas;
		/*
		 * System.out.println(desarrolladorSr.getNombre());
		 * System.out.println("****************** FIN POLIMORFISMO ( < ES UN > Jefatura extends Empleado) *********************");
		 * 
		 * System.out.println();
		 * System.out.println();
		 */


		// Creando clase con tipo generico ; soporta diversos tipos de datos (Pareja<Empleado> - Pareja<Jefatura>)
		Pareja<Empleado> desarrollador = new Pareja<>();
		Pareja<Jefatura> sistemas = new Pareja<>();



		/*
		 * System.out.println("******* Empleado *********");
		 * System.out.println(desarrolladorJr.getNombre());
		 * System.out.println(desarrolladorJr.getCargo());
		 */



		desarrollador.setPrimeroEmpleado(desarrolladorSr);
		;
		/*
		 * System.out.println(desarrollador.getPrimeroEmpleado());
		 * 
		 * System.out.println();
		 * System.out.println();
		 */





		// System.out.println("******* Jefatura *********");

		jefeSistemas.setNombre("Alexander Zambrano");
		// System.out.println(jefeSistemas.getNombre());

		jefeSistemas.setCargo("Jefe de desarrollo de APIs");
		// System.out.println(jefeSistemas.getCargo());

		jefeSistemas.setNombre("Ívor  Guzmán");
		// System.out.println(jefeSistemas);

		/*
		 * System.out.println();
		 * System.out.println();
		 */






		// ****************** POLIMORFISMO CON CLASES GENERICO con tipos comodin (? extends XXXX ) *********************

		System.out.println("******************  POLIMORFISMO CON CLASES GENERICO con tipos comodin (? extends XXXX ) *********************");
		System.out.println();

		// Clase Tipo Empleado
		Pareja<Empleado> AdmSistemas = new Pareja<>();// Constructor sin argumento

		// Clase tipo jefatura
		Pareja<Jefatura> DirectoSistemas = new Pareja<>();// Constructor sin argumento


		AdmSistemas.setPrimeroEmpleado(desarrolladorJr);
		DirectoSistemas.setPrimeroJefatura(jefeSistemas);

		System.out.println(desarrolladorJr);
		System.out.println(jefeSistemas);
		System.out.println(AdmSistemas.toString1());
		System.out.println(DirectoSistemas.toString2());

		System.out.println("****************** POLIMORFISMO GENERICO ( < ES UN > Jefatura extends Empleado) *********************");

		// Sin parametro comodin (? extends XXXX ) en el metodo static
		// Pareja.imprimirTrabajador(AdmSistemas.setPrimeroEmpleado(desarrolladorSr), DirectoSistemas.setPrimeroJefatura(jefeSistemas));


		// Con parametro comodin (? extends XXXX ) en el metodo static
		// Pareja.imprimirTrabajadorComodin(AdmSistemas);
		Pareja.imprimirTrabajadorComodin(DirectoSistemas);

		System.out.println("****************** FIN POLIMORFISMO GENERICO ( < ES UN > Jefatura extends Empleado) *********************");




	}



}































