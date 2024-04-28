package interface_V49_51;

import java.util.Arrays;


public class Uso_Empleado_Main {



	// ********* INICIO CLASE PRINCIPAL (main) ****************

	// @SuppressWarnings("rawtypes")
	public static void main(String[] args) {


		// Creación de los Arrays tipo empleado y jefatura
		Empleado[] misEmpleados = new Empleado[7];
		Jefatura[] misJefes = new Jefatura[2];


		misEmpleados[0] = new Empleado("Ivor Guzmán", 80, 1990, 12, 17); // almasenado objetos de super-clase <
		misEmpleados[1] = new Empleado("Ana López", 70, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martín", 60, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Alexande Guzmán"); // Constructor sobrecargado

		Jefatura jefe_RRHH = new Jefatura("Alex Zambrano", 50.34, 2006, 9, 25);

		// **** POLIMORFISMO ( Principio de sustitucion Jefatura [es un] Empleado ) *****
		misEmpleados[4] = jefe_RRHH; // Forma 1 de hacerlo

		// *** POLIMORFISMO (Principio de sustitucion Jefatura [es un] Empleado ) ****
		misEmpleados[5] = new Jefatura("Maria Angelica", 40, 1999, 5, 26); // Forma 2 de hacerlo




		jefe_RRHH.setIncentivo(2);
		// System.out.printf(" Insetivo para jefe_RRHH ==> %.2f%n%n ", jefe_RRHH.getIncentivo());


		// Casting de Objeto(convertir objeto de un tipo en otro): de Empleados a (Jefatura)
		Jefatura jefaCompras = (Jefatura) misEmpleados[5];

		// Aplicando metodo de Insentivo
		jefaCompras.setIncentivo(3);

		// System.out.printf(" Insetivo para jefaCompras ==> %.2f%n%n ", jefaCompras.getIncentivo());




		Jefatura jefa_Finananzas = new Jefatura("Pepe Perez", 30, 2006, 9, 25);

		// *** POLIMORFISMO (Principio de sustitucion Jefatura [es un] Empleados V43) ****
		misEmpleados[6] = jefa_Finananzas;




		System.out.println("******************************************************");


		// Aplicando metodo de Insentivo
		jefa_Finananzas.setIncentivo(4);

		System.out.printf(" Insetivo para jefaCompras2 ==> %.2f%n%n", jefa_Finananzas.getIncentivo());
		System.out.println("******************************************************");
		System.out.println("");
		System.out.println("");







		// *** POLIMORFISMO (Principio de sustitucion Jefatura [es un] Empleados V43) ****
		Empleado director_comercial = new Jefatura("Sandra", 30, 2012, 05, 05);
		Comparable ejemplo = new Empleado("Elisabeth", 32, 2011, 06, 07);


		System.out.println("******************************************************");

		// Metodo instanceof V50

		if (director_comercial instanceof Empleado){
			System.out.println(" SI Director_comercial ES de tipo Jefatura Y ");
			System.out.println("  ");

		}

		if (ejemplo instanceof Comparable){
			System.out.print(" SI ejemplo  ES de tipo Comparable e implenta la interfas Comparable: ");
			System.out.print(" if (ejemplo instanceof Comparable) = ");
			System.out.print(ejemplo instanceof Comparable);
			System.out.println("  ");
			System.out.println("  ");
		}




		if (jefa_Finananzas instanceof Jefatura){
			System.out.println(" SI jefa_Finananzas  ES de tipo Jefatura");
			System.out.println("  ");

		}

		if (misEmpleados[0] instanceof Empleado){
			System.out.println("-------> " + misEmpleados[0] + " ( misEmpleados[0])  ES de tipo Empleado");
			System.out.println("  ");

		}


		if (misEmpleados[5] instanceof Empleado){
			System.out.println("-------> " + misEmpleados[5] + " ( misEmpleados[5])  ES de tipo Empleado");
		}
		System.out.println("******************************************************");

		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println(" ");




		System.out.println("******************************************************");

		// _____________ Metodo de interfaz tomar_deciciones() Itf_Jefes_V50 _____________

		System.out.println(jefa_Finananzas.tomar_deciciones("Jefa de Finanzas 6 meses de Vacaciones  mas bono escolar de 3 meses"));

		System.out.println(jefaCompras.tomar_deciciones("Jefa de Compras  6 meses de Vacaciones mas (10%/ventasMes) de comiciones escolares"));

		System.out.println("******************************************************");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println(" ");



		// _____________ FIN Metodo de interfaz tomar_deciciones() Itf_Jefes_V50 _____________



		System.out.println("******************************************************");

		// _____________ Metodo de interfaz Itf_Trabajadores_V51 estableceBonus() V51 ________

		System.out.println("Bonus Jefatura Finanzas  : " + "ID :" + jefa_Finananzas.getId() + "  " + "Nombre: " + jefa_Finananzas.getNombre() + " Bonus : " + jefa_Finananzas
				.estableceBonus(5));

		System.out.println("Bonus Empleado : " + "ID: " + misEmpleados[3].getId() + " " + "Nombre: " + misEmpleados[3].getNombre() + " " + "Bonus: " + misEmpleados[3]
				.estableceBonus(2));
		System.out.println("******************************************************");
		System.out.println("  ");


		// _____________ FIN Metodo de interfaz Itf_Trabajadores_V51 estableceBonus() V51 ________










		// ********************* Aumentar sueldo Epleados *************************
		System.out.println(" ");
		// Metodo para aumentar el sueldo 5%
		for (Empleado emp : misEmpleados){

			emp.setSubeSueldo(5);

		}


		// ********************* Ordenar array Empleado metodo :sort(...)--Estatico-- , de la Clase: Arrays(...) *************************
		Arrays.sort(misEmpleados);

		// recoriendo el array:misEmpleados de Topo: Empleado

		for (Empleado emp : misEmpleados){

			System.out.println("Id :" + emp.getId());
			System.out.println("Nombre :" + emp.getNombre());
			// System.out.println("Sueldo :" + emp.getSueldo());
			System.out.printf("Sueldo %.2f$%n:", emp.getSueldo());


			System.out.println("Fecha de alta :" + emp.getAltaContrato());
			System.out.println("************************************************");
			System.out.println("");
		}




	}

	// ********* FIN CLASE PRINCIPAL (main) ****************




}
