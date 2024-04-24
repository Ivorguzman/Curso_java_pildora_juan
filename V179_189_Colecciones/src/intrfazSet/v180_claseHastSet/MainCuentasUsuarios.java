package intrfazSet.v180_claseHastSet;
import java.util.HashSet;
import java.util.Set;

public class MainCuentasUsuarios {
	public static void main(String[] args) {
		
		/* Forma 1 de crear un Objeto y instanciarlo */
		/*
		 * Cliente cl1;
		 * Cliente cl2;
		 * Cliente cl3;
		 * Cliente cl4;
		 * 
		 * cl1 = new Cliente("Antonio Banderas", "0 0001", 200000);
		 * cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		 * cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		 * cl4 = new Cliente("Julio Iglesias", "00004", 5000000);
		 */



		/* Forma 1 de crear un Objeto y instanciarlo ( Forma Habiual de hacerlo por convención) */
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 5000000);



		// Elejir clase que se adecuada a mis nececidades (HashSet) y implemente una interfas (Set)[Para elementos no repetidos y sin Ordenar[

		// 1. Escoger la Coleccion Adecuada


		// 2. Crear la coleccion de Tipo Ha ( con la clase HashSet)
		Set<Cliente> clientesBanco = new HashSet<Cliente>();



		// 3. Agregar clientes con su metodo add de HasSet<???>()
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);



		// 4. Recorrer la colección con (for Mejorado[for ech]
		for (Cliente cliente : clientesBanco){

			System.out.println("hashCode:" + cliente.hashCode());
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("N° de Cuenta: " + cliente.getN_cuenta());
			System.out.println("Saldo en cuenta: " + cliente.getSaldo());
			System.out.println();

		}




	}

}





