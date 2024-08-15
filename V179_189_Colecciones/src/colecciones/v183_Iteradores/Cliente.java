package colecciones.v183_Iteradores;

import java.util.Objects;

public class Cliente {

	private String nombre;
	private String n_cuenta;
	private Double saldo;



	public Cliente(String nombre, String n_cuenta, double saldo) {
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}



	public String getNombre() {
		return this.nombre;
	}



	public String getN_cuenta() {
		return this.n_cuenta;
	}



	public Double getSaldo() {
		return this.saldo;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	@Override public String toString() {
		return "Cliente [nombre=" + this.nombre + ", n_cuenta=" + this.n_cuenta + ", saldo=" + this.saldo + "]";
	}



	// Creaciòn de forma automatica con ecilpse de el metoddo Sobrescrito equals() y hashCode() para travajar con clases Propias ( usa el metodo heredado getClass())
	@Override
	public int hashCode() {
		return Objects.hash(this.n_cuenta);
	}

	@Override
	public boolean equals(Object obj) {
		// Validando que parametro recibido
		if (this == obj){
			return true;
		}
		if (!(obj instanceof Cliente)){

			return false;
		}
		Cliente other = (Cliente) obj;
		// System.out.println("---Cuenta repetida en Balance ---");
		// System.out.println("Nombre Del Cliebnte: " + other.getNombre());
		// System.out.println("Numero de cuenta :" + other.n_cuenta);
		// System.out.println();
		return Objects.equals(this.n_cuenta, other.n_cuenta);
	}

}






