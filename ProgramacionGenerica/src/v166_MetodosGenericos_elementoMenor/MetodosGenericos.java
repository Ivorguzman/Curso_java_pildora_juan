package v166_MetodosGenericos_elementoMenor;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		// *******************************************************************
		String nombres[] = {
				"Jose","Ana","Pepe","Abel","Aanei"
		};
		String personas = MisMatrices.<String>getElementos(nombres);

		System.out.println(personas + " Objeto tipo String");
		System.out.print("y el elemnto menor es: ");
		System.out.println(MisMatrices.<String>getElementoMenor(nombres));
		// *******************************************************************




	}

}
