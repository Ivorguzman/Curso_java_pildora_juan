package metodos.v181_182_hashCode_equals;

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


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object este_obj) {

		if (este_obj instanceof Libro){

			Libro otro_obj = (Libro) este_obj;


			if (this.isbn == otro_obj.isbn){


				return true;
			} else{

				return false;
			}
		} else{

			return false;
		}

	}


}
