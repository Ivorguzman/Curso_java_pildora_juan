package arrayList.v163_arrayList_Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

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


		// Metodo .itarator() es una interfas Debuelve un objeto de tipo iterator
		Iterator<Empleado> miIterador = listaEmpleados.iterator();

		// Metodo .hasnext() nos dice si tenemos mas objetos dentro de la coleccion
		while (miIterador.hasNext()){
			Empleado empleado = miIterador.next();

			System.out.println(empleado.dameDatos());
		}




	}




}



















