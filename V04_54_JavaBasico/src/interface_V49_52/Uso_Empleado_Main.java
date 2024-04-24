package interface_V49_52;

import java.util.Arrays;


public class Uso_Empleado_Main {



	// ********* INICIO CLASE PRINCIPAL (main) ****************

	// @SuppressWarnings("rawtypes")
	public static void main(String[] args) {


		// Creación de los Arrays tipo empleado y jefatura
		Uso_Empleado[] misEmpleados = new Uso_Empleado[7];
		Jefatura[] misJefes = new Jefatura[2];


		misEmpleados[0] = new Uso_Empleado("Ivor Guzmán", 80, 1990, 12, 17); // almasenado objetos de super-clase <
		misEmpleados[1] = new Uso_Empleado("Ana López", 70, 1995, 06, 02);
		misEmpleados[2] = new Uso_Empleado("Maria Martín", 60, 2002, 03, 15);
		misEmpleados[3] = new Uso_Empleado("Alexande Guzmán"); // Constructor sobrecargado

		Jefatura jefe_RRHH = new Jefatura("Alex Zambrano", 50.34, 2006, 9, 25);

		// **** POLIMORFISMO ( Principio de sustitucion Jefatura [es un] Empleado ) *****
		misEmpleados[4] = jefe_RRHH; // Forma 1 de hacerlo

		// *** POLIMORFISMO (Principio de sustitucion Jefatura [es un] Empleado ) ****
		misEmpleados[5] = new Jefatura("Maria Angelica", 40, 1999, 5, 26); // Forma 2 de hacerlo





		System.out.println("******************************************************");
		System.out.println("");



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


		// Aplicando metodo de Insentivo
		jefa_Finananzas.setIncentivo(4);

		// System.out.printf(" Insetivo para jefaCompras2 ==> %.2f%n%n ", jefa_Finananzas.getIncentivo());


		// *** POLIMORFISMO (Principio de sustitucion Jefatura [es un] Empleados V43) ****
		Uso_Empleado director_comercial = new Jefatura("Sandra", 30, 2012, 05, 05);


		// Comparable ejemplo = new Uso_Empleado("Elisabeth", 30000, 2011, 06, 07);



		// Metodo instanceof V50

		if (director_comercial instanceof Uso_Empleado){
			System.out.println("Director_comercial es de tipo Jefatura");
			System.out.println("  ");

		}

		if (jefa_Finananzas instanceof Jefatura){
			System.out.println("jefa_Finananzas  es de tipo Jefatura");
			System.out.println("  ");

		}
		if (misEmpleados[0] instanceof Uso_Empleado){
			System.out.println(misEmpleados[0] + " es de tipo Uso_Empleado");
			System.out.println("  ");

		}
		if (misEmpleados[5] instanceof Uso_Empleado){
			System.out.println(misEmpleados[5] + " es de tipo Uso_Empleado");
			System.out.println("  ");
		}






		// _____________ Metodo de interfaz JefesV50 _____________

		System.out.println(jefa_Finananzas.tomar_deciciones("Jefa de Finanzas 6 meses de Vacaciones  mas bono escolar de 3 meses"));


		System.out.println(jefaCompras.tomar_deciciones("Jefa de Compras  6 meses de Vacaciones mas (10%/ventasMes) de comiciones escolares"));

		// _____________ Fin Metodo de interfaz Jefes V50 __________








		// _____________ Metodo de interfaz Trabajadores V51 ________


		System.out.println("Bonus Jefatura Finanzas  : " + "ID :" + jefa_Finananzas.getId() + "  " + "Nombre: " + jefa_Finananzas.getNombre() + " Bonus : " + jefa_Finananzas
				.estableceBonus(5));


		System.out.println("Bonus Uso_Empleado : " + "ID: " + misEmpleados[3].getId() + " " + "Nombre: " + misEmpleados[3].getNombre() + " " + "Bonus: " + misEmpleados[3]
				.estableceBonus(2));

		// _____________ Fin Metodo de interfaz Trabajadores V51 _____________





		// ********************* Aumentar sueldo Epleados *************************
		System.out.println(" ");
		// Metodo para aumentar el sueldo 5%
		for (Uso_Empleado e : misEmpleados){

			e.setSubeSueldo(5);

		}


		// ********************* Ordenar array Uso_Empleado metodo :sort(...)--Estatico-- , de la Clase: Arrays(...) *************************
		Arrays.sort(misEmpleados);

		// recoriendo el array:misEmpleados de Topo: Uso_Empleado

		for (Uso_Empleado emp : misEmpleados){

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
