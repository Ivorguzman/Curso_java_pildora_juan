package clases_internas_locales__54;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;


// ********** Clases interna Local : son declaradas dentro de un metodo sin constructor explisito, sin modificadores de acceso ni campos de clase **********
class Reloj {


	String estaEsMiubicacion = "Soy la propiedad estaEsMiubicacion y etoy el la clase Reloj ; FUERA de la clase Interna DameLaHora_2";



	// Metodo para limpiar consola __ NO FUNCIONA _____ ESTIDIAR PORQUE

	public void limpiarConsola() {
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(Exception e){
			// Manejo de la excepción
		}
	}





	// Metodo se encarga de poner en marcha el programa
	// Los parametros por ser usados po la clase interna local DameLaHora_2 debes ser obligatoriamente << final >>
	public void enMarcha(final int intervalo, final boolean sonido) {


		// Es una clase interna local por el echo de estan dentro de un metodo ( public void enMarcha() )
		// Por ser una clase interna local solo es visble solo en el ambito del metodo donde este ( public void enMarcha() )
		// Puede acceder a los campos de la clase externa como a las variables del metodo dondende este.
		// PERO: La clase enterna no puede acceder al la clase interna loca sin usar metodos de acceso (getters y setters)
		// ** CLASE INTERNA local DameLaHora_2; <No pueden tener modificadores explicitos> **
		class DameLaHora_2 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent evento) {

				DameLaHora_2.this.miUbicacionEs(Reloj.this.estaEsMiubicacion);
				Reloj.this.limpiarConsola();
				System.out.println("***************************************************");


				Date ahora = new Date();
				System.out.println(" DameLaHora_2 ==> Seinicio con intrevalo de:" + ahora + " Segundos");
				System.out.println(" DameLaHora_2 ==> Te pongo la hora cada  segundo:" + intervalo + " Segundos");



				// Accediendo a la propiedad sonido de la clase externa Reloj sin metodo de acceso
				if (sonido){
					Toolkit.getDefaultToolkit().beep();
					System.out.println(" DameLaHora_2 ==> con configuración de sonido:" + sonido + " como valor");

				} else{
					System.out.println(" DameLaHora_2 ==> con configuración de sonido:" + sonido + " como valor");
				}
				System.out.println("***************************************************");
				System.out.println(" ");
			}

			public void miUbicacionEs(String cordenadas) {
				System.out.println(Reloj.this.estaEsMiubicacion);
			}
		}
		ActionListener oyente = new DameLaHora_2();

		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}

}





