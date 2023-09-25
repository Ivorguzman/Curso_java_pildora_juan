package bbdb_JDBC.Transacciones_I.V220;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Inserta_Clientes_Pedidos
{

	public static void main(String[] args)
	{
		
		try
		{

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");


			Statement miStatement = miConexion.createStatement();

			String instruccionSql_1 = "INSERT INTO CLIENTES (CODIGOCLIENTE, EMPRESA, DIRECCION) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";

			miStatement.executeUpdate(instruccionSql_1);

			String instruccionSql_2 = "INSERT INTO PEDIDOS (NUMERODEPEDIDO, CODIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";

			miStatement.executeUpdate(instruccionSql_2);


			System.out.println("Datos INSERTADOS correctamente");

		} catch(Exception e)
		{


			System.out.println("ERROR EN LA INSERCION DE DATOS!!");

			e.printStackTrace();

		}

	}

}
