package bbdb_JDBC.insert_update_delete_V204;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {

		try{
			// 1.CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "");




			// 2.CREAR OBJETO STATEMENT
			Statement miStatemen = miConexion.createStatement();




			/* // 3. EJECUTAR SQL
			 * ResultSet miResultset = miStatemen.executeQuery("SELECT * FROM productos LIMIT 0 ,10");
			 * Object objet = miResultset;
			 * System.out.println(objet.toString());
			 * System.out.print(" Codigo\t"); // encabezados de salida
			 * System.out.print("     Nombre\t"); // encabezados de salida
			 * System.out.println("        Precio\t"); // encabezados de salida
			 * System.out.println("___________________________________________"); // encabezados de salida
			 * // TODO 4.RECORRER EL RESULTSET
			 * while (miResultset.next()){
			 * System.out.printf(" %s \t %s \t %s %n", miResultset.getString("CODIGOARTICULO"),
			 * miResultset.getString("NOMBREARTICULO"), miResultset.getString("PRECIO"));
			 * System.out.println("___________________________________________"); // encabezados de salida
			 * } */


		}catch(Exception e){
			// Exception generica

			System.out.println("ERROR: No se pudeo conectar a base de datos");
			e.printStackTrace();
		}

	}



	@Override public String toString() {
		return "ModificaBBDD [toString()=" + super.toString() + "]";
	}

}
