package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Se esta relizando todo el ejercicio en un solo archivo en otras palabras se cola colaron todos
 * los metdo clase en un solo fichero (Todas la clases main y demas)
 *
 * */

class EmpleadoArry {

	// Varaibles de Instancia
	private String nombre;// primitivo
	private Double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)


	// ***************** CONSTRUCTOR **************************
	public EmpleadoArry(String nombre, double sueldo, int ahno, int mes, int dia) {

		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia);// sobre carga del constructor
		this.altaContrato = calendario.getTime();
	}
	// ***************** FIN DEL CONSTRUCTOR **************************

	// GETTER Y SETTERS
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		}
	}

	public Double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(Double sueldo) {
		if (sueldo != null && sueldo > 0) {
			this.sueldo = sueldo;
		}
	}

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		if (altaContrato != null) {
			this.altaContrato = altaContrato;
		}
	}

	public void setSubeSueldo(double porcentaje) {

		if (porcentaje > 0) {
			double aumento = this.sueldo * porcentaje / 100;
			this.sueldo += aumento;
		}
	}
	// Fin de GETTERS Y SETTERS

}

// ********* CLASE PRINCIPAL (main) ****************

public class Uso_empleado_main_array {

	public static void main(String[] args) {

		EmpleadoArry[] misEmpleado = new EmpleadoArry[3];

		misEmpleado[0] = new EmpleadoArry("Ivor Guzmán", 85000, 1990, 12, 17);
		misEmpleado[1] = new EmpleadoArry("Ana López", 95000, 1995, 06, 02);
		misEmpleado[2] = new EmpleadoArry("Maria Martín", 105000, 2002, 03, 15);

		/*
		 * System.out.println(misEmpleado[0].nombre);
		 * System.out.println(misEmpleado[0].altaContrato);
		 * System.out.println(misEmpleado[0].sueldo);
		 * System.out.println(misEmpleado[1].nombre);
		 * System.out.println(misEmpleado[1].altaContrato);
		 * System.out.println(misEmpleado[1].sueldo);
		 * System.out.println(misEmpleado[2].nombre);
		 * System.out.println(misEmpleado[2].altaContrato);
		 * System.out.println(misEmpleado[02].sueldo);
		 */

		/*
		 * System.out.println(misEmpleado[0].getSueldo());
		 * System.out.println(misEmpleado[1].getSueldo());
		 * System.out.println(misEmpleado[2].getSueldo());
		 */

		/*
		 * System.out.println(misEmpleado[0].getAltaContrato());
		 * System.out.println(misEmpleado[1].getAltaContrato());
		 * System.out.println(misEmpleado[2].getAltaContrato());
		 */

		/*
		 * misEmpleado[0].setNombre("pedro"); System.out.println(misEmpleado[0].nombre);
		 * System.out.println(misEmpleado[0].getNombre());
		 * System.out.println(misEmpleado[0].nombre = "Juan");
		 * System.out.println(misEmpleado[0].nombre);
		 */

		/*
		 * // **** BUCLE FOR TRADICIONAL *****
		 * 
		 * for (int i = 0; i < misEmpleado.length; i++) {
		 * 
		 * misEmpleado[i].setSubeSueldo(5);
		 * 
		 * System.out.println("Nombre :" + misEmpleado[i].getNombre());
		 * System.out.println("Sueldo :" + misEmpleado[i].getSueldo());
		 * System.out.println("Fecha de alta :" + misEmpleado[i].getAltaContrato());
		 * System.out.println("************************************************");
		 * System.out.println("");
		 * 
		 * }
		 */

		for (EmpleadoArry e : misEmpleado) {

			e.setSubeSueldo(5);
			System.out.println(e);

			System.out.println("Nombre :" + e.getNombre());
			System.out.println("Sueldo :" + e.getSueldo());
			System.out.println("Fecha de alta :" + e.getAltaContrato());
			System.out.println("************************************************");
			System.out.println("");

		}

	}

}
