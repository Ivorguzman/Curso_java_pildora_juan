package bbdb_JDBC.practicaGuiada_MVC.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjecutarConsultas
{

	private String pruebas;

	private PreparedStatement enviaConsultaSeccion;
	private final String consultaSeccionParametrica = "SELECT CODIGOARTICULO, NOMBREARTICULO, PRECIO, PAISDEORIGEN  FROM  productos  WHERE SECCION = ?";

	private PreparedStatement enviaConsultaPais;
	private final String consultaPaisParametrica = "SELECT CODIGOARTICULO, NOMBREARTICULO, PRECIO, PAISDEORIGEN  FROM  productos  WHERE PAISDEORIGEN = ?";

	private PreparedStatement enviaConsultaTodos;
	private final String consultaTodosParametrica = "SELECT CODIGOARTICULO, NOMBREARTICULO, PRECIO, PAISDEORIGEN  FROM  productos  WHERE  SECCION = ? AND PAISDEORIGEN = ?";

	ResultSet rsConsultas;

	private Conexion miConexion;


	public ResultSet filtrarBBDD(String seccion, String pais) throws SQLException
	{

		this.miConexion = new Conexion();

		Connection conecta = this.miConexion.getConexion();

		this.rsConsultas = null;


		if (!seccion.equals("Todos") && pais.equals("Todos"))
		{

			this.enviaConsultaSeccion = conecta.prepareStatement(this.consultaSeccionParametrica);
			this.enviaConsultaSeccion.setString(1, seccion);

			// EJECUTAR LA CONSULTA
			this.rsConsultas = this.enviaConsultaSeccion.executeQuery();



		} else if (seccion.equals("Todos") && !pais.equals("Todos"))
			// Si se seleciono el Jcombobox pais
		{

			this.enviaConsultaPais = conecta.prepareStatement(this.consultaPaisParametrica);
			this.enviaConsultaPais.setString(1, pais);

			// EJECUTAR LA CONSULTA
			this.rsConsultas = this.enviaConsultaPais.executeQuery();

		} else
		{

			this.enviaConsultaTodos = conecta.prepareStatement(this.consultaTodosParametrica);
			this.enviaConsultaTodos.setString(1, seccion);
			this.enviaConsultaTodos.setString(2, pais);

			// EJECUTAR LA CONSULTA
			this.rsConsultas = this.enviaConsultaTodos.executeQuery();


		}

		return this.rsConsultas;

	
}



}
