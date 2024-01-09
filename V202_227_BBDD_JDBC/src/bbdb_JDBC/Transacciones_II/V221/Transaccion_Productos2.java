package bbdb_JDBC.Transacciones_II.V221;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Transaccion_Productos2
{


	public static void main(String[] args)
	{
		// parametros de la conexion
		String usr = "root";
		String pwd = "";
		String driver = "com.mysql.cj.jdbc.ConnectionImpl";
		String url = "jdbc:mysql://localhost:3306/pruebasjava";
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try
		{
			// -------------
			// ** PARTE 1 **
			// -------------
			// levanto el driver
			Class.forName(driver);

			// establezco la conexion
			con = DriverManager.getConnection(url, usr, pwd);

			// seteo el autocommit en false
			con.setAutoCommit(false);


			// defino y ejecuto la sentencia DELETE
			String sql1 = "DELETE FROM clientes WHERE CÓDIGOCLIENTE  = 'CT03'";
			String sql2 = "DELETE FROM clientes WHERE CÓDIGOCLIENTE  = 'CT04'";


			/*
			 * String sql2 = "DELETE FROM PRODUCTOS WHERE PRECIO > 300";
			 * String sql3 = "UPDETE PRODUCTOS||||||||  SET PRECIO= PRECIO * 1.15";
			 */

			// preparo la sentencia que voy a ejecutar
			pstm = con.prepareStatement(sql1);
			pstm = con.prepareStatement(sql2);


			/*
			 * pstm = con.prepareStatement(sql2);
			 * pstm = con.prepareStatement(sql3);
			 */

			// ejecuto la sentencia y obtengo los resultados en rs
			// pstm.executeQuery(sql1);


			int rtdo1 = pstm.executeUpdate();
			int rtdo2 = pstm.executeUpdate();
			/*
			 * rs = pstm.executeQuery(sql2);
			 * rs = pstm.executeQuery(sql2);
			 */


			// se afecto una sola fila como esperabamos...
			if (rtdo1 == 1 && rtdo1 == 2)
			{
				// todo OK entonces commiteo la operacion
				System.out.println(" !  Transacción  exitosa !");
				con.commit();
			} else
			{
				throw new RuntimeException("Error...");
			}
		} catch(Exception ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally
		{
			try
			{
				// rollback "por las dudas"
				if (con != null)
				{
					con.rollback();
					System.out.println(" No se Realizo Nigun tipo de operación (! Toda Operacion Reversada!)");
				}
				if (pstm != null)
				{
					pstm.close();
				}
			} catch(Exception ex)
			{
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		}





	}
}



