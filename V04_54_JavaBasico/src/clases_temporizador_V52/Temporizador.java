package clases_temporizador_V52;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;



class Reloj {

	private int intervalo;
	private boolean sonido;

	public Reloj(int inervalo, boolean sonido) {
		this.intervalo = inervalo;
		this.sonido = sonido;

	}


	public void enMarcha() {
		ActionListener oyente = new DameLaHora();
		Timer mitemporizador = new Timer(this.intervalo, oyente);
		mitemporizador.start();

	}

	// Clase Interna (Anidada) Puede ser tipo private
	private class DameLaHora implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Date ahora = new Date();
			System.out.println("Te pongo la hora cada  segundo:" + ahora);

			// Reloj.this.sonido. Pertenece al hambito superior (class Reloj ) no esta
			// declarada en la clase DameLaHora() pero puede se utilizarla por la clase
			// DameLaHora() ya que esta una sub clase Reloj() incluso teniendo modificador
			// de acceso private, ventaja no se nececitan metodo geters y setters
			// Para manipular las propiedades y metodos de la clase superior

			if (Reloj.this.sonido){

				Toolkit.getDefaultToolkit().beep();
			}

		}

	}

}





