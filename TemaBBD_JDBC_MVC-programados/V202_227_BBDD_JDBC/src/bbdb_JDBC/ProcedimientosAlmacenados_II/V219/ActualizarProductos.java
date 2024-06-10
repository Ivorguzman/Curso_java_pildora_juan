package bbdb_JDBC.ProcedimientosAlmacenados_II.V219;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ActualizarProductos
{

	public static void main(String[] args) throws SQLException
	{
		// int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introdusca precio"));
		double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Introdusca precio"));
		String nombreArticulo = JOptionPane.showInputDialog("Introdusca Nombre del articulo");


				
				
				
		Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");
		System.out.println("******** CONECCIÓN ESTABLECIDA ********* ");

		// Almacenando la llamada al procedimiento que esta en la BBDD
		CallableStatement miSentencia = miConexion.prepareCall("{call ActualizaProducto(?,?)}");
		

		miSentencia.setDouble(1, nuevoPrecio);
		miSentencia.setString(2, nombreArticulo);


		miSentencia.execute(); // devolución tipo boolean

		System.out.println("INTERACCIÓN CON BASE DE DATOS EXITOSA");


	}





}



















