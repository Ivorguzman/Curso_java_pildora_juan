package modificadoresDeAcceso_V47;

import modificadoresDeAcceso_paquetePruebas_V47.V47_Clase3_PaquetePruebas;

public class V47_Clase2_Main_ModificadoresDeAcceso {

	public static void main(String[] args) {

		// Instanciando de Clase1
		V47_Clase1_ModificadoresDeAcceso miobj = new V47_Clase1_ModificadoresDeAcceso();

		System.out.println(miobj.mivar_implicito);
		miobj.mivar_implicito = 2;
		System.out.println(miobj.mivar_implicito);

		System.out.println(miobj.mivar_protected);
		miobj.mivar_protected = 20;
		System.out.println(miobj.mivar_protected);

		System.out.println(miobj.mivar_public);
		miobj.mivar_public = 30;
		System.out.println(miobj.mivar_public);

		System.out.println(miobj.miMetodo_implicito());
		System.out.println(miobj.miMetodo_protected());
		System.out.println(miobj.miMetodo_public());



		// Instancia de Clase3
		V47_Clase3_PaquetePruebas miobj2 = new V47_Clase3_PaquetePruebas();

		/*
		 * ERROR no admite implicito
		 * System.out.println(miobj2.mivar_implicito);
		 * miobj2.mivar_implicito = 50;
		 * System.out.println(miobj2.mivar_implicito);
		 * System.out.println(miobj2.mivar_implicito);
		 */

		System.out.println(miobj2.mivar_protected);
		miobj2.mivar_protected = 50;
		System.out.println(miobj2.mivar_protected);

		System.out.println(miobj2.mivar_public);
		miobj2.mivar_public = 50;
		System.out.println(miobj2.mivar_public);


		// System.out.println(miobj2.miMetodo_implicito());// ERROR no admite implicito

		System.out.println(miobj2.miMetodo_protected());
		System.out.println(miobj2.miMetodo_public());






	}

}
