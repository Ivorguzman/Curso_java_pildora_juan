package bbdb_JDBC.practicaGuiada_MVC.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CargarMenu
{

	// Crear campo tipo Conexion
	Conexion miConexion;

	// Crear campo tipo ResultSet
	public ResultSet rs_secciones;
	public ResultSet rs_paises;



	// COSTRUCTOR
	public CargarMenu()
	{
		// Crear Objeto tipo Conexion() en campo miConexion
		this.miConexion = new Conexion();
	}


	// Metodo para generar consultas y guardar las registros dentro del resultset y despues en el combobox secciones
	@SuppressWarnings("null")
	public String ejecutarConsulta()
	{

		// Creando Objeto  tipo Productos
		Productos miProducto = null;

		// Creando Objeto accesoBBDD con la coneccion a bbdd
		Connection accesoBBDD = this.miConexion.getConexion();


		// CREACION DE LA CONSULTA
		try
		{
			// CONSULTA NORMAL (declaración SQL estática ) SIN PARAMETROS
			Statement secciones = accesoBBDD.createStatement();
			Statement paises = accesoBBDD.createStatement();


			// CREACION DEL RESULTSET DE Los resultados de la CONSULTA A LA BASE DE DATOS
			this.rs_secciones = secciones.executeQuery("SELECT  DISTINCTROW SECCION FROM productos");
			this.rs_paises = paises.executeQuery("SELECT  DISTINCTROW PAISDEORIGEN FROM productos");



			// INSTANCIA DE LA CLASE PRODUCTO
			// miProducto = new Productos();


			miProducto.set$SECCION(this.rs_secciones.getString(1));
			miProducto.set$PAISDEORIGEN(this.rs_paises.getString(1));

			// CERRANDO EL RESULSET (LIBRANDO RECURSOS)
			this.rs_secciones.close();
			this.rs_paises.close();
			accesoBBDD.close();

		} catch(SQLException e)
		{
			System.out.println("Problema en ejecucion....");
			e.printStackTrace();
		}
		return miProducto.get$SECCION();
	}



}















