package arrayList.v164_arrayList_sinProgramacionGenerica;

import java.io.File;

public class Miain_ArrayList_Artesanal {

	public static void main(String[] args) {

		Mi_ArrayList_Artesanal archivos = new Mi_ArrayList_Artesanal(6);

		archivos.add(new File(// 0 AÑADIENDO OBJ. TIPO file
				"G:\\c_programacion\\c__back_end\\talleres_aprendizaje_java\\esp_trab_pildora_info\\ProgramacionGenerica\\src\\arrayList.v161_arrayList\\Empleado.java"));

		archivos.add(3);// 1 AÑADIENDO OBJ. TIPO Int
		archivos.add("ALEXANDER");// 2 AÑADIENDO OBJ. TIPO String
		archivos.add(32.98);// 3 AÑADIENDO OBJ. TIPO double

		
		// CASTINGS
		File ficheros = (File) archivos.get(0);
		System.out.println(ficheros);


		int numeroEntero = (int) archivos.get(1);
		System.out.println(numeroEntero);


		String letra = (String) archivos.get(2);

		System.out.println(letra);
		System.out.println(letra.getClass());


		double numeroDecimal = (double) archivos.get(3);
		System.out.println(numeroDecimal);






	}

}








