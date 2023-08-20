package poo;

public class V47_Clase1_poo {
	// Contructor por defecto


	// con modificador por defecto implicito
	int mivar_implicito = 5;
	////
	// con modificadores Explicitos
	protected int mivar_protected = 3;
	public int mivar_public = 7;
	private int mivar_private = 3;


	// con modificadores por defecto implicito
	String miMetodo_implicito() {
		return " El valor de mivar_implicito es: " + this.mivar_implicito;
	}

	// con modificador Explicito protected
	protected String miMetodo_protected() {
		return " El valor de mivar_protected es: " + this.mivar_protected;
	}

	// con modificador Explicito public
	public String miMetodo_public() {
		return " El valor de mivar_public es: " + this.mivar_public;
	}

	// con modificador Explicito private
	private String miMetodo_private() {
		return " El valor de mivar_private es: " + this.mivar_private;
	}
}
