package clases_temporizador_V52;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;






public class DameLaHora implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Date ahora = new Date();// Almacena la hora actual
			System.out.println("Te pongo la hora cada  segundo:" + ahora);



		}

	}







