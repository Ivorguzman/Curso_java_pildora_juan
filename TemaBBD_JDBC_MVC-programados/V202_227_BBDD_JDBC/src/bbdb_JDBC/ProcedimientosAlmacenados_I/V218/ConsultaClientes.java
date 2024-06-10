package bbdb_JDBC.ProcedimientosAlmacenados_I.V218;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaClientes
{

	public static void main(String[] args) throws SQLException
	{
		// ************** Conección con la base de datos ***************

		Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");
		System.out.println("******** CONECCIÓN ESTABLECIDA ********* ");

		// Almacenando la llamada al procedimiento que esta en la BBDD
		CallableStatement miSentencia = miConexion.prepareCall("{call muestraClientes}");

		// Creando Conjunto de resultados Resultset en $resulset
		ResultSet $resulset = miSentencia.executeQuery();
		


		System.out.print(" Codigo\t"); // encabezados de salida
		System.out.print("      EMPRESA\t"); // encabezados de salida
		System.out.print("           DIRECCION\t"); // encabezados de salida
		System.out.print("         POBLACION\t"); // encabezados de salida
		System.out.println("       TELEFONO\t"); // encabezados de salida
		System.out.println(
				"________________________________________________________________________________________________"); // encabezados de salida

		// Recoreindo el Conjunto de resultados (Resultset)
		while ($resulset.next())
		{

			System.out.printf(" %s \t  %s \t %s      \t %s             %s \t %n", $resulset.getString(1), $resulset
					.getString(
					2),
					$resulset
					.getString(3), $resulset.getString(4), $resulset.getString(5));
			System.out.println(
					"__________________________________________________________________________________________________"); // encabezados de salida


		}
		$resulset.close();

		System.out.println("INTERACCIÓN CON BASE DE DATOS EXITOSA");


	}
}







