package interface_V49_52;

import java.util.Date;
import java.util.GregorianCalendar;


// ****** CLASE PERSONA ---ABSTRACTA--- ******

abstract class Persona {

	// Varaibles de Instancia
	private String nombre;


	// CONSTRUCTOR firma (String nombre)
	public Persona(String nombre) {
		if (nombre == null) {
			throw new IllegalArgumentException("ERROR: Pearmetro Tranferido erroneo ");
		}
		this.nombre = nombre;
	}


	// Getter Setters
	public String getNombre() {
		return this.nombre;
	}


	/**
	 * @author Alexander
	 * @METODOS ASTRACTO:
	 *          Metodo Astracto OJO solo se defini no se construye NO TIENEN
	 *          IMPLEMENTACION PROPIA
	 *          Las clases astractas no pueden ser instanciadas por no tener
	 *          accionar el cual se crea en la clase que herede de esta(clase)
	 *          ya que esta obligada a sobreescribier el metodo (astracto) con la
	 *          implementación que le indique.
	 */

	public abstract String descripcion();

	// ****** FIN METODOS ABSTRACTA() ****

}
// ****** FIN CLASE PERSONA ABSTRACTA(){...} ****






// ****** CLASE Empleado2 (){...} ******
class EmpleadoArry2 extends Persona {

	// Varaibles de Instancia
	private Double sueldo;// primitivo
	private Date altaContrato;// referenciado (Tipo Objeto)
	private int id;

	// Varaibles de Clase (static)
	private static int contador = 0;

	/*
	 * ** CONSTRUCTOR firma (String nombre,double sueldo, int ahno,int mes, int,dia)
	 * **
	 */
	public EmpleadoArry2(String nombre, double sueldo, int ahno, int mes, int dia) {
		super(nombre);
		if (sueldo <= 0 || ahno <= 0 || mes <= 0 || dia < 0) {
			throw new IllegalArgumentException("ERROR: Pearmetro Tranferido erroneo ");
		}
		System.out.println("29 this ==>" + this);
		System.out.println("------------------------------------------------------");
		++contador;
		this.id = contador;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(ahno, mes - 1, dia); // sobre carga del constructor
		this.altaContrato = calendario.getTime();
		System.out.println("");
	}


@Override
public String descripcion() {
	return "Id EmpleadoPruebas_38:" + this.id + "\nNombre :" + this.getNombre() + "\nSueldo EmpleadoPruebas_38 :" + this.sueldo;
	
}


	// GETTER Y SETTERS
	public int getId() {
		return this.id;
	};



	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(Double sueldo) {
		if (sueldo < 0) {
			throw new IllegalArgumentException("Monto tiene que ser  positivo y no puede estar vacio ");
		}
		this.sueldo = sueldo;
	}

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		if (altaContrato != null) {
			throw new IllegalArgumentException("ERROR: Argumneto no puede estar vacio");
		}
		this.altaContrato = altaContrato;
	}

	public void setSubeSueldo(double porcentaje) {

		if (porcentaje < 0) {
			throw new IllegalArgumentException(" RROR: Monto tiene que ser  positivo ");
		}
		double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}
	// Fin de GETTERS Y SETTERS


}
// ****** FIN CLASE Empleado2 (...){} ******






//****** CLASE ALUMNOS (){...} ******

class Alumnos extends Persona {

	private String carrea;

	public Alumnos(String nombre, String carrera) {
		super(nombre); // LLamado constructor padre
		if (nombre == null || carrera == null) {
			throw new IllegalArgumentException("ERROR: Pearmetro Tranferido erroneo ");
		}
		this.carrea = carrera;


	}

	@Override public String descripcion() {
		return "Nombre: " + this.getNombre() + "\n" + "Carrera: " + this.carrea;


	}

}
// ****** FIN CLASE ALUMNOS (){...} ******

// ********* CLASE MAIN ****************

/**
 * The Class V46_HerenciaII_Persona_ClasesAstractas.
 */
// CLASE V46_HerenciaII_Persona_ClasesAstractas(){..}
public class Uso_Persona_Con_Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		EmpleadoArry2[] misEmpleados2 = new EmpleadoArry2[3];
		misEmpleados2[0] = new EmpleadoArry2("Alexander", 2500, 2024, 05, 01);
		misEmpleados2[1] = new EmpleadoArry2("Ivor", 3500, 2024, 06, 01);
		misEmpleados2[2] = new EmpleadoArry2("Guzmán", 4000, 2024, 07, 01);
		
		
		Alumnos[] estudiante = new Alumnos[2];
		estudiante[0] = new Alumnos("Alexander", "Ing. Datos");
		estudiante[1] = new Alumnos("Ivor Guzmán", "Ing. de la Información");
		

		// Creado array de Obj. Tipo Personas con Obj. tipo Empleado2() y Obj. tipo
		// Alumnos()
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new EmpleadoArry2("Luis Conde", 5000, 2009, 02, 25);
		lasPersonas[1] = new Alumnos("Ana Lopes", "Biologia");



		

		for (EmpleadoArry2 e : misEmpleados2) {

			System.out.println("___________________________________________");
			System.out.println("Valor de e ==> " + e);
			System.out.println("Valor de Empleado2 ==> " + misEmpleados2);
			System.out.println("");
			System.out.println(e.descripcion());
			System.out.println(e.getAltaContrato());
			System.out.println("");

		}

		for (Alumnos e : estudiante) {
			System.out.println("___________________________________________");
			System.out.println("Valor de e ==> " + e);
			System.out.println("Valor de estudiante ==> " + estudiante);
			System.out.println("");
			System.out.println(e.descripcion());
			System.out.println("");

		}
		
		for (Persona e : lasPersonas) {
			System.out.println("___________________________________________");
			System.out.println("Valor de e ==> " + e);
			System.out.println("Valor de estudiante ==> " + lasPersonas);
			System.out.println("");
			System.out.println(e.descripcion());
			System.out.println("");

		}
	}

}
// FIN CLASE CLASE V46_HerenciaII_Persona_ClasesAstractas(){..}







