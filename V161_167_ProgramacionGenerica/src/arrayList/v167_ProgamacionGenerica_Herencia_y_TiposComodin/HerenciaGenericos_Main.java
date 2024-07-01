package arrayList.v167_ProgamacionGenerica_Herencia_y_TiposComodin;

import java.util.Date;
import java.util.GregorianCalendar;


// ********* CLASE PRINCIPAL (main) ****************

public class HerenciaGenericos_Main {

	public static void main(String[] args) {
		
		// ****************** POLIMORFISMO GENERICO) *********************
		Empleado desarrolladorJr = new Empleado("Ívor Guzmán", "Desarrollador Jn_LoMaximo");
		Jefatura jefeSistemas = new Jefatura("Ívor Guzmán", 10000, 2027, 06, 25);

		Pareja<Empleado> desarrollador = new Pareja<>();
		Pareja<Jefatura> sistemas = new Pareja<>();

		System.out.println(desarrolladorJr.getNombre());
		System.out.println(desarrolladorJr.getCargo());
		


	}



}































