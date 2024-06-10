package clases_internas_locales__54;

import javax.swing.JOptionPane;

public class Temporizador_54_Main {


	public static void main(String[] args) {

		int tiempo = 1500;
		boolean alarma = true;


		Reloj miReloj = new Reloj();// Invocando el constructor por defecto


		miReloj.enMarcha(tiempo, alarma);
		
		// null para que la ventana este presente en la ejecución en primer plano
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para detener");
		System.exit(0);



	}

}





























