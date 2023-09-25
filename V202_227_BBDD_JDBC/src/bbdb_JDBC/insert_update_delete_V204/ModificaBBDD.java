package bbdb_JDBC.insert_update_delete_V204;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {

		try{
			// 1.CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");



			// 2.CREAR OBJETO STATEMENT
			Statement miStatemen = miConexion.createStatement();



			/* 3. MODIFICACION DE LA BASE DE DATOS CON INSERT O UPDATE O DELETE */


			// 3.1 Insertar datos
			// String instruccionSqL = "INSERT INTO PRODUCTOS (CODIGOARTICULO,NOMBREARTICULO,PRECIO) VALUES ('AR77','PANTALON',5.34) ";


			// 3.2 Actualizar
			// String instruccionSqL = "UPDATE PRODUCTOS SET PRECIO = PRECIO*2 WHERE CODIGOARTICULO= 'AR77'";



			// 3.3 Actualizar
			// String instruccionSqL = "DELETE FROM PRODUCTOS WHERE CODIGOARTICULO= 'AR77'";




			// miStatemen.executeUpdate(instruccionSqL);







			/* 4. CONSULTA DE BASE DE DATOS */
			ResultSet miResultset = miStatemen.executeQuery("SELECT * FROM productos ");


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
