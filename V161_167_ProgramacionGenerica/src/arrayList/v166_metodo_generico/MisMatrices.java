package arrayList.v166_metodo_generico;

// No pede ser un array de datos primitivos
// Trabaja con cualquier tipo de metodo
class MisMatrices {

	public static <T> String getElementos(T[] arregloGenerico) {

		return "El arreglo tiene " + arregloGenerico.length + " elementos";

}

}
