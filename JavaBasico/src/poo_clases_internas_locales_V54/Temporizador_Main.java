package poo_clases_internas_locales_V54;

import javax.swing.JOptionPane;

public class Temporizador_Main {


	public static void main(String[] args) {

		Reloj mireloj = new Reloj(); // Invocando constructor por defecto( sin Parametros)
		mireloj.enMarcha(1000, true);

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detenerlo");
		System.exit(0);



	}

}
