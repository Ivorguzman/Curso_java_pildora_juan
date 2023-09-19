package bbdb_JDBC.practicaGuiada_MVC.controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import bbdb_JDBC.practicaGuiada_MVC.modelo.CargaSecciones;
import bbdb_JDBC.practicaGuiada_MVC.vista.Marco_Aplicacion2;

public class ControladorCargaSeciones extends WindowAdapter
{
	CargaSecciones obj = new CargaSecciones();
	private Marco_Aplicacion2 elMarco;

	// Contructor
	public ControladorCargaSeciones(Marco_Aplicacion2 elMarco)
	{
		this.elMarco = elMarco;
	}




	@Override public void windowOpened(WindowEvent e)
	{

		// Se ejecuta el metodo que construye el resultset (ejecutarConsulta())
		this.obj.ejecutarConsulta();

		try
		{

			while (this.obj.rs.next())
			{
				this.elMarco.secciones.addItem(this.obj.rs.getString(1));

			}
		} catch(Exception e2)
		{
			// Imprime la fila del ERROR
			e2.printStackTrace();
		}

	};


}



















