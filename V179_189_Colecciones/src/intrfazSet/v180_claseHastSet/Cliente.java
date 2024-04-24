package intrfazSet.v180_claseHastSet;
import java.util.Objects;

public class Cliente {

	private String nombre;
	private String n_cuenta;
	private double saldo;



	public Cliente(String nombre, String n_cuenta, double saldo) {
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}



	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return this.nombre;
	}



	/**
	 * @param nombre
	 *               el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return el n_cuenta
	 */
	public String getN_cuenta() {
		return this.n_cuenta;
	}



	/**
	 * @param n_cuenta
	 *                 el n_cuenta a establecer
	 */
	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}



	/**
	 * @return el saldo
	 */
	public double getSaldo() {
		return this.saldo;
	}



	/**
	 * @param saldo
	 *              el saldo a establecer
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	@Override public String toString() {
		return "Cliente [nombre=" + this.nombre + ", n_cuenta=" + this.n_cuenta + ", saldo=" + this.saldo + "]";
	}



	@Override public int hashCode() {
		return Objects.hash(this.n_cuenta, this.nombre, this.saldo);
	}









}






