import java.util.Scanner;

public class V48_enumerados2_Main extends V48_enumerados2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String tamahno;
		System.out.print(
				"Ingrese el tipo de talla EXTRA_PEQUEÑA, PEQUEÑA, MEDIANA, GRANDE,EXTRA_GRANDE, EXTRA_EXTRA_GRANDE  :");
		tamahno = teclado.next().toUpperCase();

		// Metodo estatico Enum.valueOf(....) Retorna el nombre de la contante enumerada
		Talla2 tallaSelecionada = Enum.valueOf(Talla2.class, tamahno);

		System.out.println("Medida : " + tallaSelecionada);
		System.out.println("Talla : " + tallaSelecionada.getAbreiviatura());
		
		


	}

}
