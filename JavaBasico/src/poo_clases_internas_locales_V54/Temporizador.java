package poo_clases_internas_locales_V54;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

// Clase interna local: son declaradas dentro de un metodo y sin modificador de
// acceso

class Reloj {

	public void enMarcha(int intervalo, final boolean sonido) {

		// Clase Interna (Local)No puede tener ningiun midificador a execto el implicito
		// por defecto es totatal mente invisible
		class DameLaHora implements ActionListener {

			@Override public void actionPerformed(ActionEvent e) {

				Date ahora = new Date();
				System.out.println("Te pongo la hora cada  segundo Internas Locales :" + ahora);

				if (sonido){

					Toolkit.getDefaultToolkit().beep();
				}

			}

		}
		ActionListener oyente = new DameLaHora();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();

	}



}





