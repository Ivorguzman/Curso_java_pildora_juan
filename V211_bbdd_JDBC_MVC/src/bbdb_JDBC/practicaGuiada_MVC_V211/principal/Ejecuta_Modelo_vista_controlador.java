package bbdb_JDBC.practicaGuiada_MVC_V211.principal;

import javax.swing.JFrame;

import bbdb_JDBC.practicaGuiada_MVC_V211.vista.Marco_Aplicacion2;

public class Ejecuta_Modelo_vista_controlador
{

	public static void main(String[] args)
	{
		Marco_Aplicacion2 miMarco = new Marco_Aplicacion2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}
