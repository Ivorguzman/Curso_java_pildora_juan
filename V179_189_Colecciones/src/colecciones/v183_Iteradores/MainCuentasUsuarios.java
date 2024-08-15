package colecciones.v183_Iteradores;
import java.util.HashSet;
import java.util.Iterator;

public class MainCuentasUsuarios {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		// instancias de la clase Clientes
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 5000000);
		Cliente cl5 = new Cliente("Julio Iglesias", "00004", 5000000);
		Cliente cl6 = new Cliente("Rafael Nadal", "00002", 250000);





		/*
		 * Aquí estamos diciendo:
		 * a.) Set<Cliente>: Queremos una colección
		 * de objetos Cliente que no permita duplicados.
		 * 
		 * b.) clientesBanco: Este es el nombre de
		 * de mi colección
		 * 
		 * c.) new HashSet<Cliente>(): Estoy creando una nueva
		 * instancia de HashSet, que es una implementación
		 * concreta de la interfaz Set (Tipo HashSet).
		 * 
		 * Resumen:
		 * A- Interfaz (Set): Define qué métodos debe
		 * tener una clase, pero no cómo deben funcionar.
		 * 
		 * B- Clase concreta (HashSet): Proporciona una implementación
		 * concreta de los métodos definidos en la interfaz
		 * (Los propios de la clase más los implementado en las interfases que usa) .
		 * 
		 * NOTA:
		 * -Set- es una interfaz que no permite elementos duplicados.
		 * -HashSet- es una clase que implementa la interfaz -Set- y otras
		 * -HashSet- No permite ordenamientos
		 *
		 * La diferencia entre usar Set<Cliente> clientesBanco = new HashSet<>(); y HashSet<Cliente> clientesBanco = new HashSet<>(); radica en el tipo de referencia que
		 * estás utilizando:
		 * - Uso de la interfaz (Set<Cliente>):
		 * 
		 * Set<Cliente> clientesBanco = new HashSet<>();
		 * 
		 * - Ventaja: Promueve la programación orientada a interfaces,
		 * lo que hace que tu código sea más flexible y fácil de mantener.
		 * Si en el futuro decides cambiar la implementación de la colección (por ejemplo, usar TreeSet en lugar de HashSet), solo necesitas cambiar la instancia, no la
		 * referencia.
		 * - Ejemplo:
		 * 
		 * Set<Cliente> clientesBanco = new TreeSet<>();
		 * 
		 * - Uso de la clase concreta (HashSet<Cliente>):
		 * 
		 * HashSet<Cliente> clientesBanco = new HashSet<>();
		 * 
		 * - Ventaja:
		 * Es más explícito sobre la implementación específica que estás utilizando.
		 * Esto puede ser útil si necesitas acceder a métodos específicos de HashSet que
		 * no están definidos en la interfaz Set.
		 * 
		 * - Ejemplo:
		 * 
		 * HashSet<Cliente> clientesBanco = new HashSet<>();
		 * 
		 * En resumen, usar la interfaz (Set<Cliente>) es generalmente preferible porque
		 * te da más flexibilidad y promueve buenas prácticas de programación.
		 * Sin embargo, si necesitas funcionalidades específicas de HashSet,
		 * entonces usar la clase concreta puede ser más adecuado.
		 */
		// Set<Cliente> clientesBanco = new HashSet<Cliente>(); // programación orientada a interfaces (Set<Cliente> clientesBanco)
		HashSet<Cliente> clientesBanco = new HashSet<Cliente>(); // programación orientada a Classes


		// Agregar clientes con su metodo add de HasSet<???>()
		// que gestiona los duplicados en la coleccion
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		clientesBanco.add(cl6);




		System.out.println();
		System.out.println("Recorrer la colección con (for Mejorado[for ech] sin aplicar miIterador.remove()");
		System.out.println();
		// Recorrer la colección con (for Mejorado[for ech] si aplicar miIterador.remove();
		// fore+Ctrl+spacio=crear forech
		for (Cliente cuentaHabiente : clientesBanco){
			System.out.println("hashCode:" + cuentaHabiente.hashCode());
			System.out.println("Nombre: " + cuentaHabiente.getNombre());
			System.out.println("N° de Cuenta: " + cuentaHabiente.getN_cuenta());
			System.out.printf("Saldo de cuenta : %,.2f\n", cuentaHabiente.getSaldo());
			System.out.println();
		}




		// Creando el iterador (miIterador)
		Iterator<Cliente> miIterador = clientesBanco.iterator();
		
		// Utilizando el metodo hastNext ( mientra exista oto elemento debuelve true)
		while (miIterador.hasNext()){

			String nombreCliente = miIterador.next().getNombre();

			if (nombreCliente.equals("Julio Iglesias")){
				// Eliminando objetos dentro de una colección(miIterador.remove())
				miIterador.remove();
			}
		}

		System.out.println();
		System.out.println("Recorrer la colección  con (for Mejorado[for ech] despues de aplicar miIterador.remove()");
		System.out.println();
		// Recorrer la colección con (for Mejorado[for ech] despues de aplicar miIterador.remove();
		// fore+Ctrl+spacio=crear forech
		for (Cliente cuentaHabiente : clientesBanco){
			System.out.println("hashCode:" + cuentaHabiente.hashCode());
			System.out.println("Nombre: " + cuentaHabiente.getNombre());
			System.out.println("N° de Cuenta: " + cuentaHabiente.getN_cuenta());
			System.out.printf("Saldo de cuenta : %,.2f\n", cuentaHabiente.getSaldo());
			System.out.println();
		}

}

}





























