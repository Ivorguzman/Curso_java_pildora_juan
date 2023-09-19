package bbdb_JDBC.practicaGuiada_I_V206;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


@SuppressWarnings("serial")
class Marco_Aplicacion extends JFrame
{

	@SuppressWarnings("unchecked")
	public Marco_Aplicacion()
	{

		this.setTitle("Consulta BBDD");

		this.setBounds(500, 300, 400, 400);

		this.setLayout(new BorderLayout());

		JPanel menus = new JPanel();

		menus.setLayout(new FlowLayout());

		this.secciones = new JComboBox();

		this.secciones.setEditable(false);

		this.secciones.addItem("Todos");

		this.paises = new JComboBox();

		this.paises.setEditable(false);

		this.paises.addItem("Todos");

		this.resultado = new JTextArea(4, 50);

		this.resultado.setEditable(false);

		this.add(this.resultado);

		menus.add(this.secciones);

		menus.add(this.paises);

		this.add(menus, BorderLayout.NORTH);

		this.add(this.resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Consulta");

		this.add(botonConsulta, BorderLayout.SOUTH);



		try
		{

			// CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");


			// CREAR OBJETO STATEMENT
			Statement sentenciaSTM = miConexion.createStatement();

			// CARGA JCOMBOX SECCION
			String consulta = "SELECT   DISTINCTROW  SECCION FROM productos";

			// CONSTRUCCIÓN DEL RESULSET
			ResultSet rs = sentenciaSTM.executeQuery(consulta);


			// RECORRER RESULSET E INCLUIR SUS REGISTROS EN EL JCOMBOBOX SECCIONES
			while (rs.next())
			{
				this.secciones.addItem(rs.getString(1));

			}
			rs.close();


			// CARGA JCOMBOX PAISES
			consulta = "SELECT   DISTINCTROW  PAISDEORIGEN FROM productos";

			// CONSTRUCCIÓN DEL RESULSETDATOS DE LA CONSULTA
			rs = sentenciaSTM.executeQuery(consulta);


			// RECORRER RESULSET E INCLUIR SUS REGISTROS EN EL JCOMBOBOX PAISES
			while (rs.next())
			{
				this.paises.addItem(rs.getString(1));

			}
			rs.close();



		} catch(Exception e)
		{
			// Exception generica

			System.out.println("ERROR: No se pudeo conectar a base de datos");
			e.printStackTrace();
		}

	}





	private JComboBox secciones;

	private JComboBox paises;

	private JTextArea resultado;












}
















// INICIO ******************************** MAIN ()***************************************************



public class Aplicacion_Consulta
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		JFrame mimarco = new Marco_Aplicacion();

		mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}
// FIN ******************************** MAIN ()***************************************************
