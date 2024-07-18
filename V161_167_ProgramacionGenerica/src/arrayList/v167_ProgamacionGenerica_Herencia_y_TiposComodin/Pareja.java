package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

// Añadimo el parametro de tipo<T> y transformamos la clase Estandar en una clase generica
public class Pareja<T> {

	// Definir campo de calse Generico y encapsulado
	private T primeroEmpleado;
	private T primeroJefatura;

	// Contructor Sin parametros
	public Pareja( ) {

		this.primeroEmpleado = null;
		this.primeroJefatura = null;

	}

	// Metodo setters Generico Cambia el estado del compo primero de null a lo que indique el paranetro de Metodo
	public T getPrimeroEmpleado() {
		return this.primeroEmpleado;
	}

	public T getPrimeroJefatura() {
		return this.primeroJefatura;
	}

	public void setPrimeroEmpleado(T primeroEmpleado) {
		this.primeroEmpleado = primeroEmpleado;
	}

	public void setPrimeroJefatura(T primeroJefatura) {
		this.primeroJefatura = primeroJefatura;
	}


	// Metodo static sin parametro comodin
	public static void imprimirTrabajador(Pareja<Empleado> parametroEmpleado, Pareja<Jefatura> parametroJefatura) {

		Empleado primeroEmpleado = parametroEmpleado.getPrimeroEmpleado();
		Jefatura primeroJefatura = parametroJefatura.getPrimeroJefatura();


		System.out.println(primeroEmpleado);
		System.out.println(primeroJefatura);
	}




	// Metodo static con parametro comodin (? extends XXXX )
	@SuppressWarnings("null")
	public static void imprimirTrabajadorComodin(Pareja<? extends Empleado> parametroEmpleado) {
		
		if (parametroEmpleado != null) {
			
			Empleado primeroEmpleado = parametroEmpleado.getPrimeroEmpleado();
			System.out.println(parametroEmpleado.toString1());

		} else{


			Empleado primeroEmpleado = parametroEmpleado.getPrimeroEmpleado();
			System.out.println(parametroEmpleado.toString2());
		}

		


	}


	// Metodos toString() Personalizados
	public String toString1() {


		return "Pareja ==>  " + this.primeroEmpleado;
	}

	public String toString2() {
		return "Pareja ==>  " + this.primeroJefatura;
	}





}

















