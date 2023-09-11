package arrayList.v166_metodo_generico_static;

public class MetodosGenericosStatic {

	public static void main(String[] args) {
		
		// *******************************************************************
		String nombres[] = { "Jose","Ana","Pepe" };
		String personas = MisMatricesStatic.<String>getElementos(nombres);

		System.out.println(personas + " Objeto tipo String");

		// *******************************************************************
		
		
		// *******************************************************************
		Double numeros[] = { 1.2,2.3,3.4,4.5 };
		String conteo = MisMatricesStatic.<Double>getElementos(numeros);

		System.out.println(conteo.toString() + " Objeto tipo Double");
		// *******************************************************************


		// *******************************************************************
		Integer numeros2[] = { 1,2,3,4 };
		String conteo2 = MisMatricesStatic.<Integer>getElementos(numeros2);

		System.out.println(conteo2.toString() + " Objeto tipo Integer");
		// *******************************************************************


		// *******************************************************************
		EmpleadosStatic listaEmpleados[] = { new EmpleadosStatic("A", 27, 2000),new EmpleadosStatic("B", 47,
				4000),new EmpleadosStatic("C", 57,
						6000),new EmpleadosStatic("D", 37, 3000),new EmpleadosStatic("E", 47, 3000) };

		System.out.println(MisMatricesStatic.<EmpleadosStatic>getElementos(listaEmpleados) + " Objeto tipo Empleado");
		System.out.println(EmpleadosStatic.dameDatos()); // Clase mas metodo()
		// *******************************************************************


	}

}
