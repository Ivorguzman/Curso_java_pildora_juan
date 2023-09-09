package arrayList.v165_arrayList_ClaseGenericaPropia;

// Definición de clase Generica (<T>)
public class Vehiculo<T> {

	// Campo de clase Generico (<T>)
	private T habilidad;


	public Vehiculo() {
		this.habilidad = null;
	}




	// Setter con argumento Generico (<T>)
	public void setHabilidad(T habilidad) {
		this.habilidad = habilidad;
	}



	// Getter con argumento Generico (<T>)
	public T getHabilidad() {
		return this.habilidad;


	}




}


class MonoCicleta {
	private String habilida;


	public MonoCicleta(String habilida) {
		this.habilida = habilida;
	}


	@Override public String toString() {
		return "MonoCicleta [habilida=" + habilida + "]";
	}
	
	

}
