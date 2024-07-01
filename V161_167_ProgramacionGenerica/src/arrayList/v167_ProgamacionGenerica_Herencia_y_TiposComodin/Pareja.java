package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

// Añadimo el parametro de tipo<T> y transformamos la clase Estandar en una clase generica
public class Pareja<T> {

	// Definir campo de calse Generico y encapsulado
	private T primero;

	// Contructor Sin parametros
	public Pareja( ) {

		this.primero = null;

	}

	// Metodo setters Generico Cambia el estado del compo primero de null a lo que indique el paranetro de Metodo
	public void setPrimero(T NuevoValor) {
		this.primero = NuevoValor;
	}


	// Metodo Getters Generico retorna el estado del compo primero
	public T getPrimero() {
		return this.primero;

	}







}
