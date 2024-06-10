package bbdb_JDBC.practicaGuiada_MVC_V211.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdb_JDBC.practicaGuiada_MVC_V211.controlador.Conexion;


public class CargaSecciones
{

	/**
	 * Constructor
	 * Estado inocial de la conexion
	 */
	public CargaSecciones()
	{
		// Crear Objeto tipo Conexion() en campo miConexion
		this.miConexion = new Conexion();
	}


	// Metodo para generar consultas y guardar las registros dentro del resultset y despues en el combobox secciones
	public String ejecutarConsulta()
	{

		// Creando Objeto  tipo Productos
		Productos miProducto = null;

		// Creando Objeto accesoBBDD con la coneccion a bbdd
		Connection accesoBBDD = this.miConexion.getConexion();


		// CREACION DE LA CONSULTA
		try
		{
			// CONSULTA NORMAL SIN PARAMETROS
			Statement secciones = accesoBBDD.createStatement();

			// CREACION DEL RESULTSET DE LA CONSULTA A LA BASE DE DATOS
			this.rs = secciones.executeQuery("SELECT  DISTINCTROW SECCION FROM productos");


			// RECORRIDO DEL RESULTSET / USO DE LOS GETERS Y SETERS DE SECCION
			while (this.rs.next())
			{
				// INSTANCIA DE LA CLASE PRODUCTO
				miProducto = new Productos();


				miProducto.set$SECCION(this.rs.getString(1));

				System.out.println(this.rs.getString(1));

				return miProducto.get$SECCION();
			}

			// CERRANDO EL RESULSET (LIBRANDO RECURSOS)
			this.rs.close();

		} catch(SQLException e)
		{
			e.printStackTrace();
		}


		return miProducto.get$SECCION();

	}

	// Crear campo tipo Conexion
	Conexion miConexion;
	public ResultSet rs;


}















