package arrayList.v161_arrayList;

import java.util.ArrayList;

public class UsoEmpleados {

	public static void main(String[] args) {


		// ************************** USO DEL Array clasico [] ***************************************

		Empleado listaEmpleados[] = new Empleado[4];
		listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
		listaEmpleados[2] = new Empleado("Maria", 25, 2600);
		listaEmpleados[3] = new Empleado("Juan", 45, 3500);

		System.out.println("************************** USO DEL Array clasico [] ***************************************");
		System.out.println();

		for (Empleado empleado : listaEmpleados){
			// System.out.println(listaEmpleados);
			System.out.println(empleado.dameDatos());
			System.out.println(" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();





		// ************************** USO DEL ArrayList<> ***************************************
		System.out.println("************************** USO DEL ArrayList<> ***************************************");
		System.out.println();

		// ** Los ArrayList Permiten almacenar objetos pero no datos primitivos
		// ArrayList<E> Permite crear Listas dinamicas
		ArrayList<Empleado> listaEmpleados2 = new ArrayList<Empleado>();


		// ** Metodo esnsureCapacity(x) define un ArrayList de x elementos
		listaEmpleados2.ensureCapacity(15);

		listaEmpleados2.add(new Empleado("A", 45, 2500));
		listaEmpleados2.add(new Empleado("B", 55, 2000));
		listaEmpleados2.add(new Empleado("C", 25, 2600));
		listaEmpleados2.add(new Empleado("D", 45, 3500));
		listaEmpleados2.add(new Empleado("E", 45, 2500));
		listaEmpleados2.add(new Empleado("F", 55, 3000));
		listaEmpleados2.add(new Empleado("G", 25, 2000));
		listaEmpleados2.add(new Empleado("H", 45, 3000));
		listaEmpleados2.add(new Empleado("I", 55, 3000));
		listaEmpleados2.add(new Empleado("G", 25, 2000));
		listaEmpleados2.add(new Empleado("K", 45, 3000));
		listaEmpleados2.add(new Empleado("L", 55, 3000));
		listaEmpleados2.add(new Empleado("M", 25, 2000));
		listaEmpleados2.add(new Empleado("N", 45, 3000));



		// * El Metodo trimToSize() libera el espacio en memerio reservado de los cerrando el ArrayList<T> (Obtimización de recursos)
		listaEmpleados2.trimToSize();



		// ** Metodo size() Indica cuantos elemento tiene un a ArrayList<>
		System.out.println("El ArrayList tiene " + listaEmpleados2.size() + " elementos");
		System.out.println(" ");

		for (Empleado empleado : listaEmpleados2){
			// System.out.println(listaEmpleados);
			System.out.println(empleado.dameDatos());
			System.out.println(" ");
		}



	}

}
