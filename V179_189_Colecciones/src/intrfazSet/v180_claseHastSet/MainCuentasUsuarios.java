package intrfazSet.v180_claseHastSet;
import java.util.HashSet;
import java.util.Set;

public class MainCuentasUsuarios {
	public static void main(String[] args) {

		// instancias de la clase Clientes
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 5000000);





		/*
		 * Aquí estamos diciendo:
		 * 1. Set<Cliente>: Queremos una colección de objetos Cliente que no permita duplicados.
		 * 2. clientesBanco: Este es el nombre de nuestra colección ( Tipo HashSet).
		 * 3. new HashSet<Cliente>(): Estamos creando una nueva instancia de HashSet,
		 * que es una implementación concreta de la interfaz Set.
		 * 
		 * Resumen:
		 * Interfaz (Set): Define qué métodos debe tener una clase, pero no cómo deben funcionar.
		 * Clase concreta (HashSet): Proporciona una implementación concreta de los métodos definidos en la interfaz.
		 */

		// -Set- es una interfaz que no permite elementos duplicados.
		// -HashSet- es una clase que implementa la interfaz -Set-
		// -HashSet- No permite ordenamientos
		Set<Cliente> clientesBanco = new HashSet<>();



		// 3. Agregar clientes con su metodo add de HasSet<???>()
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);


		// 4. Recorrer la colección con (for Mejorado[for ech]
		// fore+Ctrl+spacio=crear forech
		for (Cliente cliente : clientesBanco){

			System.out.println("hashCode:" + cliente.hashCode());
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("N° de Cuenta: " + cliente.getN_cuenta());
			System.out.println("Saldo en cuenta: " + cliente.getSaldo());
			System.out.println();

		}




	}

}





