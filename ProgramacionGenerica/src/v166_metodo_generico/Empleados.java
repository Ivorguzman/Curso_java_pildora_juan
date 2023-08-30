package v166_metodo_generico;

public class Empleados {
	private String nombre;
	private int edad;
	private double salario;

	// Constructor
	public Empleados(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String dameDatos() {
		return "El nombre del empleado " + this.nombre + ". Tiene " + this.edad + " años." + " Y un salario de "
				+ this.salario;

	}

}
