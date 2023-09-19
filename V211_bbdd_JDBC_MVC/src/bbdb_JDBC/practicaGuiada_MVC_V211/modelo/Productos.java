package bbdb_JDBC.practicaGuiada_MVC_V211.modelo;

// "SELECT  NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN  FROM  productos  WHERE SECCION = ?";
public class Productos
{
	private String $NOMBREARTICULO;
	private String $SECCION;
	private String $PRECIO;
	private String $PAISDEORIGEN;

	/**
	 * GENERANDO ESTADO INICIAL DEL LOS CAMPOS
	 * ctrl + shift + A
	 */
	public Productos()
	{
		this.$NOMBREARTICULO = "";
		this.$SECCION = "";
		this.$PRECIO = "";
		this.$PAISDEORIGEN = "";
	}




	public String get$NOMBREARTICULO()
	{
		return this.$NOMBREARTICULO;
	}

	public void set$NOMBREARTICULO(String $nombrearticulo)
	{
		this.$NOMBREARTICULO = $nombrearticulo;
	}




	public String get$SECCION()
	{
		return this.$SECCION;
	}

	public void set$SECCION(String $seccion)
	{
		this.$SECCION = $seccion;
	}





	public String get$PRECIO()
	{
		return this.$PRECIO;
	}

	public void set$PRECIO(String $precio)
	{
		this.$PRECIO = $precio;
	}




	String get$PAISDEORIGEN()
	{
		return this.$PAISDEORIGEN;
	}

	public void set$PAISDEORIGEN(String $paisdeorigen)
	{
		this.$PAISDEORIGEN = $paisdeorigen;
	}







}



















