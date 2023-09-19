package bbdb_JDBC.practicaGuiada_III_V208;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	Connection miConexion;
	// ***** CONSTRUCTOR *****
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

		botonConsulta.addActionListener(new ActionListener()
		{
			@Override public void actionPerformed(ActionEvent e)
			{
				Marco_Aplicacion.this.ejecutarConsulta();
			}

		});

		this.add(botonConsulta, BorderLayout.SOUTH);

		try
		{

			// CREAR CONEXION
			this.miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasjava", "root", "");

			// CREAR OBJETO STATEMENT
			Statement sentenciaSTM = this.miConexion.createStatement();

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


	// CAMPOS DE CLASES DE LOS JCOMBOOX

	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultado;
	private PreparedStatement enviaConsultaSeccion;
	private final String consultaSeccionParametrica = "SELECT CODIGOARTICULO, NOMBREARTICULO, PRECIO, PAISDEORIGEN  FROM  productos  WHERE SECCION = ?";
	private PreparedStatement enviaConsultaPais;
	private final String consultaPaisParametrica = "SELECT CODIGOARTICULO, NOMBREARTICULO, PRECIO, PAISDEORIGEN  FROM  productos  WHERE PAISDEORIGEN = ?";
	private PreparedStatement enviaConsultaTodos;
	private final String consultaTodosParametrica = "SELECT CODIGOARTICULO, NOMBREARTICULO, PRECIO, PAISDEORIGEN  FROM  productos  WHERE  SECCION = ? AND PAISDEORIGEN = ?";

	// METOD QUE SE INVOCA CON EL BOTON JButton("Consulta");
	private void ejecutarConsulta()
	{

		ResultSet rs = null;
		try
		{
			String seccion = (String) this.secciones.getSelectedItem();
			String pais = (String) this.paises.getSelectedItem();

			// Si se seleciono el Jcombobox secciones
			if (!seccion.equals("Todos") && pais.equals("Todos"))
			{
				this.enviaConsultaSeccion = this.miConexion.prepareStatement(this.consultaSeccionParametrica);
				this.enviaConsultaSeccion.setString(1, seccion);
				// EJECUTAR LA CONSULTA
				rs = this.enviaConsultaSeccion.executeQuery();

				// Si se seleciono el Jcombobox
			} else if (seccion.equals("Todos") && !pais.equals("Todos"))
			{
				this.enviaConsultaPais = this.miConexion.prepareStatement(this.consultaPaisParametrica);
				this.enviaConsultaPais.setString(1, pais);
				// EJECUTAR LA CONSULTA
				rs = this.enviaConsultaPais.executeQuery();

			} else if (!seccion.equals("Todos") && !pais.equals("Todos"))
			{
				this.enviaConsultaTodos = this.miConexion.prepareStatement(this.consultaTodosParametrica);
				this.enviaConsultaTodos.setString(1, seccion);
				this.enviaConsultaTodos.setString(2, pais);



				// EJECUTAR LA CONSULTA
				rs = this.enviaConsultaTodos.executeQuery();
			}


			this.resultado.setText(""); // Limpia la lamina resultado
			while (rs.next())
			{
				this.resultado.append("\n ");
				this.resultado.append(rs.getString(1));
				this.resultado.append("  |  ");
				this.resultado.append(rs.getString(2));
				this.resultado.append("  |  ");
				this.resultado.append(rs.getString(3));
				this.resultado.append("  |  ");
				this.resultado.append(rs.getString(3));
				this.resultado.append("\n ");
				this.resultado.append(
						"_________________________________________________________________________________________________________");
				this.resultado.append("\n ");

			}

		} catch(Exception e)
		{

			System.out.println("ERROR: No se pudeo conectar a base de datos");
			e.printStackTrace();
		}

	}




















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
