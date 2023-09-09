package arrayList.v166_metodo_generico;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		// *******************************************************************
		String nombres[] = {
				"Jose","Ana","Pepe"
		};
		String personas = MisMatrices.<String>getElementos(nombres);

		System.out.println(personas + " Objeto tipo String");
		// *******************************************************************





		// *******************************************************************
		Empleados listaEmpleados[] = { new Empleados("A", 27, 2000),new Empleados("B", 47, 4000),
				new Empleados("C", 57, 6000),new Empleados("D", 37, 3000),new Empleados("E", 47, 3000) };

		System.out.println(MisMatrices.<Empleados>getElementos(listaEmpleados) + " Objeto tipo Empleado");
		// *******************************************************************


	}

}
