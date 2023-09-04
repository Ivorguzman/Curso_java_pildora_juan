package metodoStatic_Uso__empleado_pruebas_V38;

import java.util.Date;
import java.util.GregorianCalendar;

class EmpleadoPruebas_38 {

	// Varaibles de Instancia
	private String nombre;// primitivo
	private double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)
	private final int id; // primitivo
	private static int idSiguiente = 1;// Variable de clase (statisc)

	// CONSTRUCTOR
	public EmpleadoPruebas_38(String nombre, double sueldo, int ahno, int mes, int dia) {

		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia);// sobre carga del constructor
		this.altaContrato = calendario.getTime();
		this.id = idSiguiente;
		idSiguiente++;
	}


	// GETTER Y SETTERS
	
	//Metodo estatico (static) perteneca a la clase
	public static String getIdSiguiente() {
		return "ID Proximo empleado: " + idSiguiente;
	}

	public int getId() {
		return this.id;
	}

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

public class V38_MetodoStatic_Uso__empleado_pruebas {

	public static void main(String[] args) {

		EmpleadoPruebas_38 empleado_1 = new EmpleadoPruebas_38("Antonio Gómez", 85000, 1990, 12, 17);
		EmpleadoPruebas_38 empleado_2 = new EmpleadoPruebas_38("Ana López", 95000, 1995, 06, 02);
		EmpleadoPruebas_38 empleado_3 = new EmpleadoPruebas_38("Maria Martín", 105000, 2002, 03, 15);
		EmpleadoPruebas_38 empleado_4 = new EmpleadoPruebas_38("Maria Martín", 105000, 2002, 03, 15);

		empleado_1.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%
		empleado_2.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%
		empleado_3.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%
		empleado_4.setSubeSueldo(5); // AUMENTO DEL SUELD EN 5%

		/*
		 * // * * NOTA CON LA CLASE PRINSIPAL ESTA EN EL MISMO ARCHIVO SE PIERDE EL
		 */
		System.out.println("ID :" + empleado_1.getId());
		System.out.println("Nombre :" + empleado_1.getNombre());
		System.out.println("Sueldo :" + empleado_1.getSueldo());
		System.out.println("Fecha de alta :" + empleado_1.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println("ID :" + empleado_2.getId());
		System.out.println("Nombre :" + empleado_2.getNombre());
		System.out.println("Sueldo :" + empleado_2.getSueldo());
		System.out.println("Fecha de alta :" + empleado_2.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println("ID :" + empleado_3.getId());
		System.out.println("Nombre :" + empleado_3.getNombre());
		System.out.println("Sueldo :" + empleado_3.getSueldo());
		System.out.println("Fecha de alta :" + empleado_3.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println("ID :" + empleado_4.getId());
		System.out.println("Nombre :" + empleado_4.getNombre());
		System.out.println("Sueldo :" + empleado_4.getSueldo());
		System.out.println("Fecha de alta :" + empleado_4.getAltaContrato());
		System.out.println("");
		System.out.println("************************************************");

		System.out.println();
		System.out.print("==> ");
		System.out.println(EmpleadoPruebas_38.getIdSiguiente() + " <==");
		System.out.print("    ____________________  ");
	}

}

