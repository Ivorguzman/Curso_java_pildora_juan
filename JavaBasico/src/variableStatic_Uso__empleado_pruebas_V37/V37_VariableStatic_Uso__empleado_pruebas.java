package variableStatic_Uso__empleado_pruebas_V37;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Se esta relizando todo el ejercicio en un solo archivo en otras palabras se cola colaron todos
 * los metdo clase en un solo fichero (Todas la clases main y demas)
 *
 * */

class EmpleadoPruebas_37 {

	// Varaibles de Instancia
	private String nombre;// primitivo
	private double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)
	private int id;
	private static int idSiguiente = 1; // Variable de Clase

	// CONSTRUCTOR
	public EmpleadoPruebas_37(String nombre, double sueldo, int ahno, int mes, int dia) {

		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia);// sobre carga del constructor
		this.altaContrato = calendario.getTime();
		this.id = idSiguiente;
		idSiguiente++;
	}


	// GETTER Y SETTERS


	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}


	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		}
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		if (sueldo > 0){
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

public class V37_VariableStatic_Uso__empleado_pruebas {

	public static void main(String[] args) {

		EmpleadoPruebas_37 empleado_1 = new EmpleadoPruebas_37("Paco Gómez", 85000, 1990, 12, 17);
		EmpleadoPruebas_37 empleado_2 = new EmpleadoPruebas_37("Ana López", 95000, 1995, 06, 02);
		EmpleadoPruebas_37 empleado_3 = new EmpleadoPruebas_37("Maria Martín", 105000, 2002, 03, 15);
		EmpleadoPruebas_37 empleado_4 = new EmpleadoPruebas_37("Maria Martín", 105000, 2002, 03, 15);

		empleado_1.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%
		empleado_2.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%
		empleado_3.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%
		empleado_4.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%

		/* // * * NOTA CON LA CLASE PRINCIPAL ESTA EN EL MISMO ARCHIVO SE PIERDE EL */

		System.out.println("ID : " + empleado_1.getId());
		System.out.println("Nombre :" + empleado_1.getNombre());
		System.out.println("Sueldo :" + empleado_1.getSueldo());
		System.out.println("Fecha de alta :" + empleado_1.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println("ID : " + empleado_2.getId());
		System.out.println("Nombre :" + empleado_2.getNombre());
		System.out.println("Sueldo :" + empleado_2.getSueldo());
		System.out.println("Fecha de alta :" + empleado_2.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println("ID : " + empleado_3.getId());
		System.out.println("Nombre :" + empleado_3.getNombre());
		System.out.println("Sueldo :" + empleado_3.getSueldo());
		System.out.println("Fecha de alta :" + empleado_3.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println("ID : " + empleado_4.getId());
		System.out.println("Nombre :" + empleado_4.getNombre());
		System.out.println("Sueldo :" + empleado_4.getSueldo());
		System.out.println("Fecha de alta :" + empleado_4.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

	}

}

