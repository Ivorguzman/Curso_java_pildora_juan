package bbdb_JDBC.practicaGuiada_MVC_V210.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Marco_Aplicacion2 extends JFrame
{

	// ***** CONSTRUCTOR *****
	@SuppressWarnings({
			"unchecked", "rawtypes"
	})
	public Marco_Aplicacion2()
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


	}


	// CAMPOS DE CLASES DE LOS JCOMBOOX

	@SuppressWarnings("rawtypes")
	public JComboBox secciones;
	@SuppressWarnings("rawtypes")
	private JComboBox paises;
	private JTextArea resultado;
}
