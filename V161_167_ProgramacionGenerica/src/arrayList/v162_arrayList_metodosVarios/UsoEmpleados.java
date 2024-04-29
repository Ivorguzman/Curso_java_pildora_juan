package arrayList.v162_arrayList_metodosVarios;

import java.util.ArrayList;

public class UsoEmpleados {

	public static void main(String[] args) {

		// ** Los .ArrayList<o> Permiten almacenar objetos pero no datos primitivos
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();


		// ***************** inicio METODOS PARA OPTOIMIZAR MEMORIA **4*************************
		// ** Metodo esnsureCapacity(x) define un ArrayList de x elementos
		// Crea un ArrayList de 4 elementos
		listaEmpleados.ensureCapacity(14);


		// Metodo .add() para agregar elementos al FINAL del arryList<...> en el mismo orden que se que se crea
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




		// * El Metodo trimToSize() libera el espacio en memerio reservado de los cerrando el ArrayList<T> (Obtimización de recursos)
		listaEmpleados.trimToSize();
		// ***************** fin METODOS PARA OPTOIMIZAR MEMORIA **4*************************



		// ** Metodo .size() Indica cuantos elemento tiene un a ArrayList<>

		System.out.println("El ArrayList tiene " + listaEmpleados.size() + " elementos");
		System.out.println(" ");


		// * Metod set y get de los ArrayList<o>

		// * Metodo set(posicion,elemento),inserte o remplazar un elemento en una posicion en
		// concreto, (sustituye al elemento si existe que este el la posicion indicada
		// en la inserción)
		/*
		 * listaEmpleados.set(3, new Empleado("**?**", 57, 3000));// set(Posicion del elemento, Elemento a incluir)
		 */

		// * Metodo get(argumento de tipo int)) accediendo a un elemento en concreto del ArrayList<..>
		/*
		 * System.out.println("** Impresion con  Metodo get(int)) accediendo a un elemento en concreto del ArrayList<..> ** ");
		 * System.out.println("********************************************************************** ");
		 * System.out.println("Metodo get(0) -> " + listaEmpleados.get(0).dameDatos());
		 * System.out.println(" ");
		 * System.out.println("Metodo get(13) -> " + listaEmpleados.get(13).dameDatos());
		 * System.out.println("********************************************************************** ");
		 * System.out.println(" ");
		 * System.out.println(" ");
		 */
		// *****************************************************




		// Utilizando Bucle for Mejorado ( foreach())
		/*
		 * System.out.println("** Impresion con el bucle for MEJORADO  (foreach(){..}) ** ");
		 * System.out.println("********************************************************************** ");
		 * 
		 * for (Empleado empleado : listaEmpleados){
		 * // System.out.println(listaEmpleados);
		 * System.out.println(empleado.dameDatos());
		 * 
		 * }
		 */


		// Utilizando Bucle empleado for clasico(for(...){..} )

		/*
		 * System.out.println("********************************************************************** ");
		 * System.out.println(" ");
		 * System.out.println(" ");
		 * System.out.println("** Impresion con el bucle for CLASICO (for(...){..} ) ** ");
		 * System.out.println("********************************************************************** ");
		 * 
		 * for (int i = 0; i < listaEmpleados.size(); i++){
		 * Empleado empl = listaEmpleados.get(i);
		 * System.out.println(empl.dameDatos());
		 * }
		 */

		/*
		 * System.out.println("********************************************************************** ");
		 * System.out.println(" ");
		 * System.out.println(" ");
		 * System.out.println("** Impresion  Array convencional con el bucle for clasico(for(...){..} ) ** ");
		 */
		// Creación de array convencional de typo clase empleado
		// Indicando numero de elemntos del array en corma dinamica -Empleado[listaEmpleados.size()]-
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];

		for (int i = 0; i < arrayEmpleados.length; i++){

			arrayEmpleados[i] = listaEmpleados.get(i);

			/*
			 * System.out.println(arrayEmpleados[i].dameDatos());
			 */
		}



		System.out.println("********************************************************************** ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("** Copiando ArrayList a Array convencional con el metodo toArray() ** ");
		System.out.println("** Impresion  Array convencional con el bucle for clasico(for(...){..} ) ** ");
		System.out.println("********************************************************************** ");


		Empleado arrayEmpleados2[] = new Empleado[listaEmpleados.size()];
		// * Metodo .toArray() copia todo lo que este en arrayEmpleados2 a listaEmpleados
		listaEmpleados.toArray(arrayEmpleados2);

		// Recoriendo los elementos copiados a listaEmpleados
		for (int i = 0; i < arrayEmpleados.length; i++){

			System.out.println(arrayEmpleados2[i].dameDatos());

		}
		System.out.println("********************************************************************** ");





	}




}



















