package bbdb_JDBC.Transacciones_II.V221;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


//NO FUNCIONNA el rollBack()
public class Transaccion_Productos
{
	public static void main(String[] args)
	{
		Connection miConexion = null;
		try
		{
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");
			System.out.println("Nombre del driver de conección : " + miConexion.getClass().getName());
			miConexion.setAutoCommit(false);
			Statement miStatement = miConexion.createStatement();
			String instruccionSql_1 = "DELETE FROM PRODUCTOS WHERE PAISDEORIGEN = 'ITALIA'";
			String instruccionSql_2 = "DELETE FROM PRODUCTOS WHERE PRECIO > 300";
			String instruccionSql_3 = "UPDETE PRODUCTOS||||||||  SET PRECIO= PRECIO * 1.15";
			boolean ejecutar = ejecutarTransaccion(); // Devuelve TRUE o FALSE
			if (ejecutar)
			{
				miStatement.executeUpdate(instruccionSql_1);
				miStatement.executeUpdate(instruccionSql_2);
				miStatement.executeUpdate(instruccionSql_3);

				/*
				 * Una vez commiteada la transacción los cambios serán permanentes, por lo tanto, por
				 * más que invoquemos el método rollback este no podrá deshacer lo que ya fue
				 * commiteado.
				 */

				miConexion.commit();// Dando OK. a la transacción
				System.out.println(" !  Transacción  exitosa !");
			}
		} catch(Exception e)
		{
			System.out.println("ERROR: EN LA EJECUCUIÓN DEL PROGRAMA!!");
			e.printStackTrace();
			try
			{
				assert miConexion != null;
				miConexion.rollback();
				System.out.println(" No se Realizo Nigun tipo de operación (! Toda Operacion Reversada!)");
			} catch(SQLException e1)
			{
				e1.printStackTrace();
				System.out.println("ERROR: EN LA EJECUCUIÓN DEL PROGRAMA!!");
			}
		}
	}

	public static boolean ejecutarTransaccion()
	{
		String ejecucion = JOptionPane.showInputDialog(" ¿ EstaEjecutar transacción ? si / no");
		if (ejecucion.equalsIgnoreCase("si"))
		{
			return true;
		} else
		{
			return false;
		}
	}
}



/*
 * //NO FUNCIONNA el rollBack()
 * public class Transaccion_Productos
 * {
 * public static void main(String[] args)
 * {
 * Connection connection = null;
 * try
 * {
 * connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");
 * connection.setAutoCommit(false);
 * Statement statement = connection.createStatement();
 * String instruccion1 = "DELETE FROM PRODUCTOS WHERE PAISDEORIGEN='ITALIA'";
 * String instruccion2 = "DELETE FROM PRODUCTOS WHERE PRECIO>100";
 * String instruccion3 = "UPDATE PRODUCTOSsss SET PRECIO=PRECIO*1.15";
 * boolean eleccion = ejecutar_transaccion();
 * if (eleccion)
 * {
 * statement.executeUpdate(instruccion1);
 * statement.executeUpdate(instruccion2);
 * statement.executeUpdate(instruccion3);
 * connection.commit();
 * System.out.println("Todo Perfecto");
 * }
 * } catch(SQLException e)
 * {
 * System.out.println("Algo ha salido mal, revirtiendo . . .");
 * e.printStackTrace();
 * try
 * {
 * assert connection != null;
 * connection.rollback();
 * System.out.println("revertido . . .");
 * } catch(SQLException ex)
 * {
 * ex.printStackTrace();
 * System.out.println("No se ha podido recuperar el cambio . . .");
 * }
 * }
 * }
 * public static boolean ejecutar_transaccion()
 * {
 * String e = JOptionPane.showInputDialog("Quieres ejecutar el programa?");
 * if (e.equalsIgnoreCase("si"))
 * {
 * return true;
 * } else
 * {
 * return false;
 * }
 * }
 * }
 */


/*
 * //NO FUNCIONNA el rollBack()
 * public class Transaccion_Productos
 * {
 * public static void main(String[] args)
 * {
 * Connection connection = null;
 * try
 * {
 * connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");
 * connection.setAutoCommit(false);
 * Statement statement = connection.createStatement();
 * String instruccion1 = "DELETE FROM PRODUCTOS WHERE PAISDEORIGEN='ITALIA'";
 * String instruccion2 = "DELETE FROM PRODUCTOS WHERE PRECIO>100";
 * String instruccion3 = "UPDATE PRODUCTOS|||| SET PRECIO=PRECIO*1.15";
 * boolean eleccion = ejecutar_transaccion();
 * if (eleccion)
 * {
 * statement.executeUpdate(instruccion1);
 * statement.executeUpdate(instruccion2);
 * statement.executeUpdate(instruccion3);
 * connection.commit();
 * System.out.println("Todo Perfecto");
 * }
 * } catch(SQLException e)
 * {
 * System.out.println("Algo ha salido mal, revirtiendo . . .");
 * e.printStackTrace();
 * try
 * {
 * assert connection != null;
 * connection.rollback();
 * System.out.println("revertido . . .");
 * } catch(SQLException ex)
 * {
 * ex.printStackTrace();
 * System.out.println("No se ha podido recuperar el cambio . . .");
 * }
 * }
 * }
 * public static boolean ejecutar_transaccion()
 * {
 * String e = JOptionPane.showInputDialog("Quieres ejecutar el programa?");
 * if (e.equalsIgnoreCase("si"))
 * {
 * return true;
 * } else
 * {
 * return false;
 * }
 * }
 * }
 */





