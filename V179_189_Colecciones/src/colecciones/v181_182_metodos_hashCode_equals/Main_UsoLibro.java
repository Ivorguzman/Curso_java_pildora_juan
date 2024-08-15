package colecciones.v181_182_metodos_hashCode_equals;

public class Main_UsoLibro {
	public static void main(String[] args) {
		// int numeroRecursivo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero a factorizar en forma recursiva"));
		int isbn_1 = 0;
		int isbn_2 = 0;


		// solicitar isbn de manera dinamica y lo almacena
		isbn_1 = Libro.solicitarISBN("Introduzca el número del primer ISBN");
		isbn_2 = Libro.solicitarISBN("Introduzca el número del segundo ISBN");


		Libro libro1 = new Libro("Programacón en Java", "Juan Pildoras", isbn_1);
		Libro libro2 = new Libro("Programacón en Java", "Juan Pildoras", isbn_2);



		if (libro1.equals(libro2)){
			System.out.println("Libro1 con ISBN = " + libro1.getIsbn() + " es Igual al Libro2 con ISBN = " + libro2.getIsbn());
			System.out.println("hashCode Libro 1: " + libro1.hashCode());
			System.out.println("hashCode Libro 2: " + libro2.hashCode());
		} else{
			System.out.println("Libro1 con ISBN = " + libro1.getIsbn() + " es Diferente al Libro2 con ISBN = " + libro2.getIsbn());
			System.out.println("hashCode Libro 1: " + libro1.hashCode());
			System.out.println("hashCode Libro 2: " + libro2.hashCode());
		}



		/*
		 * System.out.println();
		 * System.out.println();
		 * 
		 * 
		 * libro1 = libro2;// Ojo se verifica como apunta al miso Objeto.
		 * if (libro1.equals(libro2)){
		 * System.out.println("Libro1 con ISBN = " + libro1.getIsbn() + " es Igual al Libro2 con ISBN = " + libro2.getIsbn());
		 * System.out.println("con  la sentencia  libro1 = libro2 ");
		 * System.out.println("hashCode Libro 1: " + libro1.hashCode());
		 * System.out.println("hashCode Libro 2: " + libro2.hashCode());
		 * } else{
		 * System.out.println("Libro1 con ISBN = " + libro1.getIsbn() + " es Diferente al Libro2 con ISBN = " + libro2.getIsbn());
		 * System.out.println("hashCode Libro 1: " + libro1.hashCode());
		 * System.out.println("hashCode Libro 2: " + libro2.hashCode());
		 * }
		 */
	}

}













