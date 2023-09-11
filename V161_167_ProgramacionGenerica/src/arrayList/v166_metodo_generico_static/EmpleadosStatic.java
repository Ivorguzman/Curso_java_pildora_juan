package arrayList.v166_metodo_generico_static;

public class EmpleadosStatic {
	private static String nombre;
	private static int edad;
	private static double salario;

	// Constructor
	public EmpleadosStatic(String nombre, int edad, double salario) {
		EmpleadosStatic.nombre = nombre;
		EmpleadosStatic.edad = edad;
		EmpleadosStatic.salario = salario;
	}

	public static String dameDatos() {
		return "El nombre del empleado " + nombre + ". Tiene " + edad + " años." + " Y un salario de "
				+ salario;

	}

}
