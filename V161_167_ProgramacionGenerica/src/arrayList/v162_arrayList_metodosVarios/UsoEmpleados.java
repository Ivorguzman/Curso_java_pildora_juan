package arrayList.v162_arrayList_metodosVarios;

import java.util.ArrayList;

public class UsoEmpleados {

	public static void main(String[] args) {

		// ** Los .ArrayList<o> Permiten almacenar objetos pero no datos primitivos
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();


		// ** Metodo esnsureCapacity(x) define un ArrayList<o> de x elementos
		listaEmpleados.ensureCapacity(100);

		// Metodo .add(...) Agrega elementoa al ArrayList<o> en el mismo orden que se
		// incluyen.
		listaEmpleados.add(new Empleado("A", 45, 2500));
		listaEmpleados.add(new Empleado("B", 55, 2000));
		listaEmpleados.add(new Empleado("C", 25, 2600));
		listaEmpleados.add(new Empleado("D", 45, 3500));
		listaEmpleados.add(new Empleado("E", 45, 2500));
		listaEmpleados.add(new Empleado("F", 55, 3000));
		listaEmpleados.add(new Empleado("G", 25, 2000));
		listaEmpleados.add(new Empleado("H", 45, 3000));
		listaEmpleados.add(new Empleado("I", 55, 3000));
		listaEmpleados.add(new Empleado("G", 25, 2000));
		listaEmpleados.add(new Empleado("K", 45, 3000));
		listaEmpleados.add(new Empleado("L", 55, 3000));
		listaEmpleados.add(new Empleado("M", 25, 2000));
		listaEmpleados.add(new Empleado("N", 45, 3000));




		// * El Metodo .trimToSize() libera el espacio en memerio reservado de los
		// elemento no del AraayList no creadoss (Obtimización de recursos)
		listaEmpleados.trimToSize();


		// ** Metodo .size() Indica cuantos elemento tiene un a ArrayList<>
		System.out.println("El ArrayList tiene " + listaEmpleados.size() + " elementos");
		System.out.println(" ");

		// * Metod set y get de los ArrayList<o>

		// * Metodo set(posicion,elemento),inserte un elemento en una posicion en
		// concreto, (sustituye al elemento si existe que este el la posicion indicada
		// en la inserción)
		listaEmpleados.set(0, new Empleado("AA", 57, 3000));


		// * Metodo get(int)
		System.out.println("** Impresion con  Metodo get(int)) ** ");
		System.out.println("********************************************************************** ");
		System.out.println("Metodo get(int) -> " + listaEmpleados.get(1).dameDatos());
		System.out.println(" ");
		System.out.println("Metodo get(int) -> " + listaEmpleados.get(13).dameDatos());
		System.out.println("********************************************************************** ");
		System.out.println(" ");
		System.out.println(" ");

		// *****************************************************

		// Utilizando Bucle for Mejorado ( foreach())
		System.out.println("** Impresion con el bucle for Mejorado (foreach(){..}) ** ");
		System.out.println("********************************************************************** ");

		for (Empleado e : listaEmpleados){
			// System.out.println(listaEmpleados);
			System.out.println(e.dameDatos());

		}


		// Utilizando Bucle e for clasico(for(...){..} )
		System.out.println("********************************************************************** ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("** Impresion con el bucle for clasico(for(...){..} ) ** ");
		System.out.println("********************************************************************** ");

		for (int i = 0; i < listaEmpleados.size(); i++){
			Empleado empleadoArray = listaEmpleados.get(i);
			System.out.println(empleadoArray.dameDatos());
		}
		System.out.println("********************************************************************** ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("** Copiando ArrayList a Array convencional con metod get de ArrayList<0> ** ");
		System.out.println("** Impresion  Array convencional con el bucle for clasico(for(...){..} ) ** ");
		System.out.println("********************************************************************** ");
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];

		for (int i = 0; i < arrayEmpleados.length; i++){

			arrayEmpleados[i] = listaEmpleados.get(i);

			System.out.println(arrayEmpleados[i].dameDatos());

		}
		System.out.println("********************************************************************** ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("** Copiando ArrayList a Array convencional con el metodo toArray() ** ");
		System.out.println("** Impresion  Array convencional con el bucle for clasico(for(...){..} ) ** ");
		System.out.println("********************************************************************** ");
		Empleado arrayEmpleados2[] = new Empleado[listaEmpleados.size()];
		
		// * Metodo .toArray()
		listaEmpleados.toArray(arrayEmpleados2);

		for (int i = 0; i < arrayEmpleados.length; i++){

			System.out.println(arrayEmpleados2[i].dameDatos());

		}
		System.out.println("********************************************************************** ");





	}




}



















