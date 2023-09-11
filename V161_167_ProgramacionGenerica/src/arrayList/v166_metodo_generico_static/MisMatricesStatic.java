package arrayList.v166_metodo_generico_static;

// No pede ser un array de datos primitivos
// Trabaja con cualquier tipo de metodo
class MisMatricesStatic {

	public static <T> String getElementos(T[] arregloGenerico) {

		return "El arreglo tiene " + arregloGenerico.length + " elementos";

}

}
