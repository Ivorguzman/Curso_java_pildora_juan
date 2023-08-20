

public class V48_enumerados2 {

	// son variables OBJETOS de tipo enum que SOLO ADMITEN los valores que de
	// ante mano se les establesca
	// Los enumerados no premiten crear instancias (new) de tipo enum
	enum Talla2 {

		EXTRA_PEQUEÑA("SS"), PEQUEÑA("S"), MEDIANA("M"), GRANDE("L"), EXTRA_GRANDE("X"), EXTRA_EXTRA_GRANDE("XXL");


		private String abreiviatura;

		// Se crea private al contructor para esconderlo y no poder crear Instancias
		private Talla2(String abreiviatura) {

			this.abreiviatura = abreiviatura;
		}


		public String getAbreiviatura() {
			return this.abreiviatura;
		}



	


	};


}
