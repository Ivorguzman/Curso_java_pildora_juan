package arrayList.v164_arrayList_sinProgramacionGenerica;

import java.io.File;

public class UsoMyArrayList {

	public static void main(String[] args) {

		MiArrayList archivos = new MiArrayList(6);

		archivos.add(new File(// 0 AÑADIENDO OBJ. TIPO Int
				"G:\\c_programacion\\c__back_end\\talleres_aprendizaje_java\\esp_trab_pildora_info\\ProgramacionGenerica\\src\\arrayList.v161_arrayList\\Empleado.java"));// 0
		archivos.add(3);// 01 AÑADIENDO OBJ. TIPO Int
		archivos.add("MM");// 2 AÑADIENDO OBJ. TIPO String
		archivos.add(32.98);// 3 AÑADIENDO OBJ. TIPO double
		archivos.add(new File(
				"G:\\c_programacion\\c__back_end\\talleres_aprendizaje_java\\esp_trab_pildora_info\\ProgramacionGenerica\\src\\arrayList.v161_arrayList\\UsoEmpleado.java"));// 4
		archivos.add("ALEXANDER");// 4 AÑADIENDO OBJ. TIPO File

		
		// CASTINGS
		File ficheros = (File) archivos.get(0);
		int numeroEntero = (int) archivos.get(1);
		String letra = (String) archivos.get(2);
		double numeroDecimal = (double) archivos.get(3);
		File ficheros2 = (File) archivos.get(4);
		String nommbrePersona = (String) archivos.get(5);




		System.out.println(ficheros);
		System.out.println(numeroEntero);
		System.out.println(letra);
		System.out.println(numeroDecimal);
		System.out.println(ficheros2);
		System.out.println(nommbrePersona);
	}

}








