package bbdb_JDBC.consultas_preparadas_V205;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaPreparada {

	public static void main(String[] args) {
		try{
			// 1.CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");

			// 2. PREPARAR CONSULTA
			PreparedStatement miSentencia = miConexion.prepareStatement(
					"SELECT  CODIGOARTICULO, NOMBREARTICULO, PRECIO FROM PRODUCTOS WHERE SECCION=? AND PAISDEORIGEN=?");

			// 3. ESTABLECER PARAMETROS DE CONSULTA
			miSentencia.setString(1, "DEPORTES");
			miSentencia.setString(2, "USA");

			// 4 EJECUTAR Y RRECORRER CONSUILTA
			ResultSet miResultset = miSentencia.executeQuery();

			System.out.print(" Codigo\t"); // encabezados de salida
			System.out.print("     Nombre\t"); // encabezados de salida
			System.out.println("        Precio\t"); // encabezados de salida
			System.out.println("___________________________________________"); // encabezados de salida

			// TODO 4.RECORRER EL RESULTSET
			while (miResultset.next()){

				System.out.printf(" %s \t %s \t %s %n", miResultset.getString("CODIGOARTICULO"),
						miResultset.getString("NOMBREARTICULO"), miResultset.getString("PRECIO"));
				System.out.println("___________________________________________"); // encabezados de salida

			}
			System.out.println("INTERACCIÓN CON BASE DE DATOS EXITOSA");


		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}






















