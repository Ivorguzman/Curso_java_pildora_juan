package metodos.v181_182_hashCode_equals;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Libro {



	private String titulo;
	private String autor;
	private int isbn;


	public Libro(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;


	}



	public String getTitulo() {
		return this.titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return this.autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getIsbn() {
		return this.isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/*
	 * Vamos a desglosar el código línea por línea para que sea más fácil de entender.
	 * 
	 * public static int solicitarISBN(String mensaje) {
	 * int isbn = -1;
	 * boolean valido = false;
	 * 
	 * - public static int solicitarISBN(String mensaje) {:
	 * - Esta línea define un método llamado solicitarISBN que es público y estático. Devuelve un valor de tipo int (entero) y recibe un parámetro de tipo String (cadena de
	 * texto) llamado mensaje.
	 * - int isbn = -1;:
	 * - Aquí se declara una variable isbn de tipo int y se inicializa con el valor -1.
	 * Este valor se usará para almacenar el ISBN introducido por el usuario.
	 * - boolean valido = false;:
	 * - Se declara una variable (valido) de tipo boolean y se inicializa con false
	 * Esta variable se usará para controlar el bucle que pedirá al usuario que introduzca un ISBN válido.
	 * 
	 * while (!valido) {
	 * try {
	 * isbn = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
	 * if (isbn > 0) {
	 * valido = true;
	 * } else {
	 * JOptionPane.showMessageDialog(null, "El número debe ser mayor a 0. Inténtelo de nuevo.");
	 * }
	 * } catch (NumberFormatException e) {
	 * JOptionPane.showMessageDialog(null, "Debe introducir un número entero válido. Inténtelo de nuevo.");
	 * }
	 * }
	 * 
	 * - while (!valido) {:
	 * - Este es un bucle while que continuará ejecutándose mientras valido sea false.
	 * - try {:
	 * - El bloque try se usa para intentar ejecutar el código que podría lanzar una excepción (un error).
	 * - isbn = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));:
	 * - Aquí se muestra un cuadro de diálogo al usuario con el mensaje proporcionado. El usuario introduce un valor que se convierte a un número entero usando
	 * Integer.parseInt(). Si la conversión tiene éxito, el valor se almacena en la variable isbn.
	 * - if (isbn > 0) {:
	 * - Esta línea verifica si el número introducido es mayor que 0.
	 * - valido = true;:
	 * - Si el número es mayor que 0, se establece valido a true, lo que hará que el bucle while termine.
	 * - } else {:
	 * - Si el número no es mayor que 0, se ejecuta este bloque else.
	 * - JOptionPane.showMessageDialog(null, "El número debe ser mayor a 0. Inténtelo de nuevo.");:
	 * - Se muestra un mensaje de error al usuario indicando que el número debe ser mayor que 0.
	 * - } catch (NumberFormatException e) {:
	 * - Este bloque catch captura la excepción NumberFormatException, que ocurre si el usuario introduce
	 * un valor que no puede convertirse a un número entero.
	 * - JOptionPane.showMessageDialog(null, "Debe introducir un número entero válido. Inténtelo de nuevo.");:
	 * - Se muestra un mensaje de error al usuario indicando que debe introducir un número entero válido.
	 * 
	 * return isbn;
	 * }
	 * 
	 * - return isbn;:
	 * - Finalmente, el método devuelve el valor de isbn que el usuario ha introducido y que ha pasado todas las validaciones.
	 */

	public static int solicitarISBN(String numero) {
		int isbn = -1;
		boolean valido = false;

		while (!valido){
			try{
				isbn = Integer.parseInt(JOptionPane.showInputDialog(null, numero));
				if (isbn > 0){
					valido = true;
				} else{
					JOptionPane.showMessageDialog(null, "El número debe ser mayor a 0. Inténtelo de nuevo.");
				}
			} catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Debe introducir un número entero válido. Inténtelo de nuevo.");
			}
		}

		return isbn;
	}



	// Creaciòn de forma automatica con ecilpse de el metoddo Sobrescrito equals() y hashCode() para travajar con clases Propias ( usa el metodo heredado getClass())
	@Override
	public int hashCode() {
		return Objects.hash(this.autor, this.isbn, this.titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (!(obj instanceof Libro)){
			return false;
		}
		Libro other = (Libro) obj;
		return Objects.equals(this.autor, other.autor) && this.isbn == other.isbn && Objects.equals(this.titulo, other.titulo);
	}











	/*
	 * // Creaciòn de forma manual de el metoddo Sobrescrito equals para travajar con clases Propias
	 * // Sin sobre escribie el metodo hashCode()
	 * 
	 * @Override
	 * public boolean equals(Object obj) {
	 * 
	 * if (obj instanceof Libro){
	 * 
	 * // Castendo (convirtiebdo el obj_1 que es de tipo clase Object a tipo de clase Libro) y almacenandolo en obj_2
	 * Libro otro = (Libro) obj;
	 * 
	 * // Verifica si la propiedad isbn de el la Clase actual (Libro=>this.isbn) es igual a la propiedad isbn pasado por parametro(Libro => obj_2.isbn) y convertido a
	 * // tipo libro (Casteado)
	 * if (this.isbn == otro.isbn){
	 * 
	 * 
	 * return true;
	 * } else{
	 * 
	 * return false;
	 * }
	 * } else{
	 * 
	 * return false;
	 * }
	 * 
	 * }
	 */


}
