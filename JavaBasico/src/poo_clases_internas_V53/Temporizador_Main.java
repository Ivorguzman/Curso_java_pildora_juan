package poo_clases_internas_V53;

import javax.swing.JOptionPane;

public class Temporizador_Main {


	public static void main(String[] args) {

		Reloj mireloj = new Reloj(1000, true);
		mireloj.enMarcha();

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detenerlo");
		System.exit(0);



	}

}
