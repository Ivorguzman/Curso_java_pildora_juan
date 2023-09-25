package bbdb_JDBC.practicaGuiada_MVC.controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import bbdb_JDBC.practicaGuiada_MVC.modelo.CargarMenu;
import bbdb_JDBC.practicaGuiada_MVC.vista.Marco_Aplicacion2;

public class ControladorCargaMenu extends WindowAdapter
{
	CargarMenu obj_seccion = new CargarMenu();

	private Marco_Aplicacion2 elMarco;

	// Contructor
	public ControladorCargaMenu(Marco_Aplicacion2 elMarco)
	{
		this.elMarco = elMarco;
	}


	@Override public void windowOpened(WindowEvent e)
	{
		// Se ejecuta el metodo que construye el resultset (ejecutarConsulta())
		try
		{
			this.obj_seccion.ejecutarConsulta();

		} catch(Exception e1)
		{
			System.out.println("Problema en ejecucion del metodo ejecutarConsulta()");
		}


		try

		{
			// Bucle que carga información es los combos boss de las secciones
			while (this.obj_seccion.rs_secciones.next() && this.obj_seccion.rs_paises.next())
			{
				this.elMarco.secciones.addItem(this.obj_seccion.rs_secciones.getString(1));
				this.elMarco.paises.addItem(this.obj_seccion.rs_paises.getString(1));
			}
		} catch(Exception e2)
		{
			System.out.println("Problema en ejecucion del metodo .addItem()");
		}

	};


}



















