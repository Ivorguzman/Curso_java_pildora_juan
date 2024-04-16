import java.util.HashSet;
import java.util.Set;

public class MainCuentasUsuarios {
	public static void main(String[] args) {

		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 5000000);

		// Elejir clase que se adecuada a mis nececidades (HashSet) y implemente una interfas (Set)

		// 1. Escoger la Coleccion Adecuada .
		// 2. Crear la coleccion (HashSet)
		Set<Cliente> clientesBanco = new HashSet<Cliente>();

		// 3. Agregar clientes
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
