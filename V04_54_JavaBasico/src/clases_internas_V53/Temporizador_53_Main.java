package clases_internas_V53;

import javax.swing.JOptionPane;

public class Temporizador_53_Main {


	public static void main(String[] args) {

		Reloj miReloj = new Reloj(1500, false);

		miReloj.enMarcha();
		
		// null para que la ventana este presente en la ejecución en primer plano
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para detener");
		System.exit(0);



	}

}





























