package arrayList.v165_arrayList_ClasesPropia;

public class UsoPareja_Main {


	public static void main(String[] args) {


		Persona persona1 = new Persona("Persona Asiatica");

		Pareja<String> pareja1Nombre = new Pareja<>();
		Pareja<Integer> pareja1Edad = new Pareja<>();
		Pareja<Double> pareja1Sueldo = new Pareja<>();
		Pareja<Boolean> pareja1Activo = new Pareja<>();
		Pareja<Persona> pareja1Persona = new Pareja<>();




		pareja1Nombre.setPrimero("Juan");
		pareja1Edad.setPrimero(57);
		pareja1Sueldo.setPrimero(80000.54);
		pareja1Activo.setPrimero(true);

		pareja1Persona.setPrimero(persona1);




		System.out.println("Pareja ==> T primero(Persona) = " + pareja1Persona.getPrimero());

		System.out.println("Pareja ==> T primero (String) = " + pareja1Nombre.getPrimero());
		System.out.println("Pareja ==> T primero(Integer) = " + pareja1Edad.getPrimero());
		System.out.println("Pareja ==> T primero(Double) = " + pareja1Sueldo.getPrimero());
		System.out.println("Pareja ==> T primero(Boolean) = " + pareja1Activo.getPrimero());



		
		//



	}

}
