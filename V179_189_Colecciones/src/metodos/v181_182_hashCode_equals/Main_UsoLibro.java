package metodos.v181_182_hashCode_equals;

public class Main_UsoLibro {

	public static void main(String[] args) {



		Libro libro1 = new Libro("Programacón en Java", "Juan Pildoras", 125);

		Libro libro2 = new Libro("Programacón en Java", "Juan Pildoras", 125);




		if (libro1.equals(libro2)){

			System.out.println("Libro1 con IBSN = " + libro1.getIsbn() + " es Igual al Libro2 con  ISBN = " + libro2.getIsbn());

		} else{

			System.out.println("Libro1 con IBSN = " + libro1.getIsbn() + " es Diferente al Libro2 con  ISBN = " + libro2.getIsbn());

		}
	}

}













