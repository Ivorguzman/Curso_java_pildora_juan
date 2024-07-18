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



	public String getNombre() {
		return this.nombre;
	}



	public String getN_cuenta() {
		return this.n_cuenta;
	}



	public double getSaldo() {
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



	@Override public int hashCode() {
		return Objects.hash(this.n_cuenta, this.nombre, this.saldo);
	}









}






