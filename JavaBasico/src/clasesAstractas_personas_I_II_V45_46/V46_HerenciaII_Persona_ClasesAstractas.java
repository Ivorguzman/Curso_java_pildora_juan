package clasesAstractas_personas_I_II_V45_46;

import java.util.Date;
import java.util.GregorianCalendar;


// ****** CLASE PERSONA (){...} ABSTRACTA ******
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

	// Getter
	public String getNombre() {
		return this.nombre;
	}


	// Descripcion de Metodo Astracto OJO solo se defini no se construye
	public abstract String getDescripcion();

	@Override public String toString() {
		return "Persona [nombre=" + this.nombre + "]";
	}



}
// ****** FIN CLASE PERSONA ABSTRACTA(){...} ****






// ****** CLASE Empleado2 (){...} ******
class Empleado2 extends Persona {

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
	public Empleado2(String nombre, double sueldo, int ahno, int mes, int dia) {
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
public String getDescripcion() {
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


	@Override public String toString() {
		return "Empleado2 [sueldo=" + this.sueldo + ", altaContrato=" + this.altaContrato + ", id=" + this.id + "]";
	}


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

	@Override public String getDescripcion() {
		return "Nombre: " + this.getNombre() + "\n" + "Carrera: " + this.carrea;


	}

	@Override public String toString() {
		return "Alumnos [carrea=" + this.carrea + "]";
	}

}
// ****** FIN CLASE ALUMNOS (){...} ******






// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°


//********* CLASE PRINCIPAL (){...} (main) ****************

/**
 * The Class V46_HerenciaII_Persona_ClasesAstractas.
 */
// CLASE V46_HerenciaII_Persona_ClasesAstractas(){..}
public class V46_HerenciaII_Persona_ClasesAstractas {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Empleado2[] misEmpleados2 = new Empleado2[3];
		misEmpleados2[0] = new Empleado2("Alexander", 2500, 2024, 05, 01);
		misEmpleados2[1] = new Empleado2("Ivor", 3500, 2024, 06, 01);
		misEmpleados2[2] = new Empleado2("Guzmán", 4000, 2024, 07, 01);
		
		
		Alumnos[] estudiante = new Alumnos[2];
		estudiante[0] = new Alumnos("Alexander", "Ing. Datos");
		estudiante[1] = new Alumnos("Ivor Guzmán", "Ing. de la Información");
		

		// Creado array de Obj. Tipo Personas con Obj. tipo Empleado2() y Obj. tipo
		// Alumnos()
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 5000, 2009, 02, 25);
		lasPersonas[1] = new Alumnos("Ana Lopes", "Biologia");



		

		for (Empleado2 e : misEmpleados2) {

			System.out.println("___________________________________________");
			System.out.println("Valor de e ==> " + e);
			System.out.println("Valor de Empleado2 ==> " + misEmpleados2);
			System.out.println("");
			System.out.println(e.getDescripcion());
			System.out.println(e.getAltaContrato());
			System.out.println("");

		}

		for (Alumnos e : estudiante) {
			System.out.println("___________________________________________");
			System.out.println("Valor de e ==> " + e);
			System.out.println("Valor de estudiante ==> " + estudiante);
			System.out.println("");
			System.out.println(e.getDescripcion());
			System.out.println("");

		}
		
		for (Persona e : lasPersonas) {
			System.out.println("___________________________________________");
			System.out.println("Valor de e ==> " + e);
			System.out.println("Valor de estudiante ==> " + lasPersonas);
			System.out.println("");
			System.out.println(e.getDescripcion());
			System.out.println("");

		}
	}

}
// FIN CLASE CLASE V46_HerenciaII_Persona_ClasesAstractas(){..}







