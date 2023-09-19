package bbdb_JDBC.practicaGuiada_MVC_V211.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
	Connection miConexion = null;

	public Conexion()
	{

	}

	public Connection getConexion()
	{
		try
		{
			this.miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");

			// System.out.println(this.miConexion);

		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return this.miConexion;

	}
	
	


}














