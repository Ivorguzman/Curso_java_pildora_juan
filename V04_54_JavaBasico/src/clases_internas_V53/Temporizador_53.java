package clases_internas_V53;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

// ********** Clase interna : son declaradas dentro de otra clase **********
class Reloj {

	private int intervalo;
	private boolean sonido;
	String estaEsMiubicacion = "Soy la propiedad estaEsMiubicacion y etoy el la clase Reloj ; FUERA de la clase Interna DameLaHora_2";




	// Costructor
	public Reloj(int intervalo, final boolean sonido) {

		this.intervalo = intervalo;
		this.sonido = sonido;



	}
	

	// Metodo para limpiar consola __ NO FUNCIONA _____ ESTIDIAR PORQUE
	public void limpiarConsola() {
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(Exception e){
			// Manejo de la excepción
		}
	}





	// ********** CLASE INTERNA DameLaHora_2 ****************
	private class DameLaHora_2 implements ActionListener {
		
		public void miUbicacionEs() {

			System.out.println(Reloj.this.estaEsMiubicacion);
		}


		@Override
		public void actionPerformed(ActionEvent e) {

			DameLaHora_2.this.miUbicacionEs();

			Reloj.this.limpiarConsola();

			System.out.println("***************************************************");

			Date ahora = new Date();
			System.out.println(" DameLaHora_2 ==> Seinicio con intrevalo de:" + ahora + " Segundos");
			System.out.println(" DameLaHora_2 ==> Te pongo la hora cada  segundo:" + Reloj.this.intervalo + " Segundos");

			// Accediendo a la propiedad sonido de la clase externa Reloj sin metodo de acceso
			if (Reloj.this.sonido){
				Toolkit.getDefaultToolkit().beep();
				System.out.println(" DameLaHora_2 ==> con configuración de sonido:" + Reloj.this.sonido + " como valor");

			} else{
				System.out.println(" DameLaHora_2 ==> con configuración de sonido:" + Reloj.this.sonido + " como valor");

			}
			System.out.println("***************************************************");
			System.out.println(" ");
			
		}

	}
	// ********** FIN CLASE INTERNA DameLaHora_2 ****************



	// Metodo se encarga de poner en marcha el programa
	public void enMarcha() {

		ActionListener oyente =  new DameLaHora_2();

		Timer miTemporizador = new Timer(this.intervalo, oyente);

		miTemporizador.start();

	}

}





