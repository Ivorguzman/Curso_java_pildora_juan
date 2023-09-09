package arrayList.v166_MetodosGenericos_elementoMenor;

// No pede ser un array de datos primitivos
// Trabaja con cualquier tipo de metodo
class MisMatrices {

	public static <T> String getElementos(T[] arregloGenerico) {

		return "El arreglo tiene " + arregloGenerico.length + " elementos";

}
	

public static <T extends Comparable<T>> T getElementoMenor(T[] elemento) {

	if (elemento == null || elemento.length == 0){
		return null;
	}

	T elementoMenor = elemento[0];

	for (int i = 1; i < elemento.length; i++){
		if (elementoMenor.compareTo(elemento[i]) > 0){
			elementoMenor = elemento[i];
	
}



	}
	return elementoMenor;


}


}































