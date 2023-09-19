package bbdb_JDBC.practicaGuiada_MVC_V210.principal;

import javax.swing.WindowConstants;

import bbdb_JDBC.practicaGuiada_MVC_V210.vista.Marco_Aplicacion2;

public class Ejecuta_Modelo_vista_controlador
{

	public static void main(String[] args)
	{
		Marco_Aplicacion2 miMarco = new Marco_Aplicacion2();
		miMarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

