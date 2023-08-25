package v161_arrayList;

import java.util.ArrayList;

public class UsoEmpleados {

	public static void main(String[] args) {

		/*
		 * Empleado listaEmpleados[] = new Empleado[4];
		 * listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		 * listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
		 * listaEmpleados[2] = new Empleado("Maria", 25, 2600);
		 * listaEmpleados[3] = new Empleado("Juan", 45, 3500);
		 */


		// ** Los ArrayList Permiten almacenar objetos pero no datos primitivos
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();


		// ** Metodo esnsureCapacity(x) define un ArrayList de x elementos
		listaEmpleados.ensureCapacity(100);

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

		// * El Metodo trimToSize() libera el espacio en memerio reservado de los
		// elemento no del AraayList no creadoss (Obtimización de recursos)
		listaEmpleados.trimToSize();


		// ** Metodo size() Indica cuantos elemento tiene un a ArrayList<>
		System.out.println("El ArrayList tiene " + listaEmpleados.size() + " elementos");
		System.out.println(" ");

		for (Empleado e : listaEmpleados){
			// System.out.println(listaEmpleados);
			System.out.println(e.dameDatos());
			System.out.println(" ");
		}



	}

}
