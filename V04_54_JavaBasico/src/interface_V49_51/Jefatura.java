package interface_V49_51;

import interface_V49_51.interfaces.Itf_Jefes_V50;
import interface_V49_51.interfaces.Itf_Trabajadores_V51;

class Jefatura extends Empleado implements Itf_Jefes_V50 {



	// CONSTRUCTOR DE LA CLASE
	public Jefatura(String nombre, double sueldo, int ahno, int mes, int dia) {

		super(nombre, sueldo, ahno, mes, dia);

	};


	// Implementa metodo tomar_deciciones de la Interfas : Itf_Jefes_V50
	@Override
	public String tomar_deciciones(String decision) {
		return "Decision Resolucion 1203 : " + decision;
	}



	// Implementa Interfas: Itf_Trabajadores_V51
	@Override
	public double estableceBonus(double gratificacion) {
		double primaJefatura = gratificacion * 2;

		return Itf_Trabajadores_V51.bonus_base + gratificacion + primaJefatura;
	}


	private double incentivo;

	// GETTERS Y SETTERS

	@Override
	public double getSueldo() { // realazandolo sobre escribiendo el metodo getSueldo()

		double sueldoJefe = super.getSueldo(); // Invocando el metodo getSueldo de la clase Padre
		return sueldoJefe + this.incentivo;
	}




	public double SueldoJefe() {                  // realazandolo creando el metodo SueldoJefe()
		double sueldoJefe = super.getSueldo();    // Invocando el metodo getSueldo de la
												   // clase Padre return sueldoJefe + this.incentivo;
		return sueldoJefe;

	}


	public void setIncentivo(double incentivo) {
		if (incentivo <= 0){
			throw new IllegalArgumentException("Monto tiene que ser  positivo < Mayor a 0 >");
		}
		this.incentivo = incentivo;
	}




	// Fin de GETTERS Y SETTERS



	public double getIncentivo() {
		return this.incentivo;
	}

}
