package bbdb_JDBC.Transacciones_I.V220;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaccionProducto
{

	public static void main(String[] args) throws SQLException
	{
		Connection miConexion = null;
		try
		{

			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");

			miConexion.setAutoCommit(false);


			Statement miStatement = miConexion.createStatement();

			String instruccionSql_1 = "INSERT INTO CLIENTES (CODIGOCLIENTE°°°°°, EMPRESA, DIRECCION) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";

			miStatement.executeUpdate(instruccionSql_1);

			String instruccionSql_2 = "INSERT INTO PEDIDOS (NUMERODEPEDIDO, CODIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";

			miStatement.executeUpdate(instruccionSql_2);

			miConexion.commit();


			System.out.println("Datos INSERTADOS correctamente");

		} catch(Exception e)
		{
			miConexion.rollback();

			System.out.println("ERROR EN LA INSERCION DE DATOS!!");

			e.printStackTrace();

		}

	}
	}


