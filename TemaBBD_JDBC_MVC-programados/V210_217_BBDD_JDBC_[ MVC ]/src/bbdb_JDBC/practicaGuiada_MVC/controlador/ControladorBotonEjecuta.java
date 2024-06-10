package bbdb_JDBC.practicaGuiada_MVC.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import bbdb_JDBC.practicaGuiada_MVC.modelo.EjecutarConsultas;
import bbdb_JDBC.practicaGuiada_MVC.vista.Marco_Aplicacion2;


public class ControladorBotonEjecuta implements ActionListener
{

	private Marco_Aplicacion2 elMarco;

	EjecutarConsultas obj_consultas = new EjecutarConsultas();

	private ResultSet resultadoConsulta;


	// *** Constructor ***
	public ControladorBotonEjecuta(Marco_Aplicacion2 elMarco)
	{
		this.elMarco = elMarco;
	}


	@Override public void actionPerformed(ActionEvent e)
	{
		
		String seleccionSeccion = (String) this.elMarco.secciones.getSelectedItem();
		String selecionPais = (String) this.elMarco.paises.getSelectedItem();


		try
		{
			this.resultadoConsulta = this.obj_consultas.filtrarBBDD(seleccionSeccion, selecionPais);
			
			
			this.elMarco.resultado.setText(""); // Limpia la lamina resultado
			while (this.resultadoConsulta.next())
			{
				this.elMarco.resultado.append("\n ");
				this.elMarco.resultado.append(this.resultadoConsulta.getString(1));
				this.elMarco.resultado.append("  |  ");
				this.elMarco.resultado.append(this.resultadoConsulta.getString(2));
				this.elMarco.resultado.append("  |  ");
				this.elMarco.resultado.append(this.resultadoConsulta.getString(3));
				this.elMarco.resultado.append("  |  ");
				this.elMarco.resultado.append(this.resultadoConsulta.getString(4));
				this.elMarco.resultado.append("\n ");
				this.elMarco.resultado.append(
						"_________________________________________________________________________________________________________");
				this.elMarco.resultado.append("\n ");

			}
			
		} catch(SQLException e1)
		{

			System.out.println("ERROR: No se pudeo conectar a base de datos");
			e1.printStackTrace();
		}




	}







}
