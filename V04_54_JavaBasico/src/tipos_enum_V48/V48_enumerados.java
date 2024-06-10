package tipos_enum_V48;

import java.util.Scanner;

public class V48_enumerados {

	// TIPO ENUMERAD ES UNA VARIABLE OBJETO DE TIPO enum que almacena solo un tipo
	// No puede ser creado en el metodo main();

	enum Talla {
		EXTRA_PEQUEÑA, PEQUEÑA, MEDIANA, LARGA, EXTRA_LARGA, EXTRA_EXTRA_LARGA
	};

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Variables Objetos
		Talla ss = Talla.EXTRA_PEQUEÑA;
		Talla s = Talla.PEQUEÑA;
		Talla m = Talla.MEDIANA;
		Talla l = Talla.LARGA;
		Talla xl = Talla.EXTRA_LARGA;
		Talla xxl = Talla.EXTRA_LARGA;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String tamahno;
		System.out.print("Ingrese el tipo de talla :");
		tamahno = teclado.next();

		switch (tamahno) {
		case "ss":
			System.out.println("Talla  " + Talla.EXTRA_PEQUEÑA);

			break;
		case "s":
			System.out.println("Talla  " + Talla.PEQUEÑA);

			break;
		case "m":
			System.out.println("Talla  " + Talla.MEDIANA);

			break;
		case "l":
			System.out.println("Talla  " + Talla.LARGA);

			break;
		case "xl":
			System.out.println("Talla  " + Talla.EXTRA_LARGA);

			break;
		case "xxl":
			System.out.println("Talla  " + Talla.EXTRA_EXTRA_LARGA);

			break;


		default:
			System.out.println("Talla  Validas  ss,s,m,l xl,xxl ");
			break;
		}

	}


}



















