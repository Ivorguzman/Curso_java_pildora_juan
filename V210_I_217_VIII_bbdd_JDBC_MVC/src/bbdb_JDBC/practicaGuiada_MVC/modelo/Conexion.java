package bbdb_JDBC.practicaGuiada_MVC.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion
{
	Connection miConexion = null;

	public Conexion() // 0J0 CON ESTE CONSTRUCTOR
	{

	}




	public Connection getConexion()
	{
		try
		{
			this.miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");

			// Mi comprobación
			System.out.println("******** CONECCIÓN ESTABLECIDA ********* ");

		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return this.miConexion;

	}





}














