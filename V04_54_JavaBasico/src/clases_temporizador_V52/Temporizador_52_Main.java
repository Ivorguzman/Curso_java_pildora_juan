package clases_temporizador_V52;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;



public class Temporizador_52_Main {


	public static void main(String[] args) {


		ActionListener oyente = new DameLaHora(); // Primera manera de hacerlo

		// DameLaHora_2 oyente = new DameLaHora_2(); // Segunda manera de hacerlo

		Timer miTemporizador = new Timer(1000, oyente);

		miTemporizador.start();

		// null para que la ventana este presente en la ejecución en primer plano
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);





	}

}
