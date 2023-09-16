package arrayList.v166_metodo_generico;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		// *******************************************************************
		String nombres[] = { "Jose","Ana","Pepe" };
		String personas = MisMatrices.<String>getElementos(nombres);

		System.out.println(personas + " Objeto tipo String");

		// *******************************************************************
		
		
		// *******************************************************************
		Double numeros[] = { 1.2,2.3,3.4,4.5 };
		String conteo = MisMatrices.<Double>getElementos(numeros);

		System.out.println(conteo.toString() + " Objeto tipo Double");
		// *******************************************************************


		// *******************************************************************
		Integer numeros2[] = { 1,2,3,4 };
		String conteo2 = MisMatrices.<Integer>getElementos(numeros2);

		System.out.println(conteo2.toString() + " Objeto tipo Integer");
		// *******************************************************************


		// *******************************************************************
		Empleados listaEmpleados[] = { new Empleados("A", 27, 2000),new Empleados("B", 47,
				4000),
				new Empleados("C", 57, 6000),new Empleados("D", 37, 3000),new Empleados("E", 47, 3000) };

		System.out.println(MisMatrices.<Empleados>getElementos(listaEmpleados) + " Objeto tipo Empleado");
		System.out.println(listaEmpleados[0].dameDatos());
		// *******************************************************************


	}

}
