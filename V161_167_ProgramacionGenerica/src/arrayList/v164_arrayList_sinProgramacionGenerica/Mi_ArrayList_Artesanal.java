package arrayList.v164_arrayList_sinProgramacionGenerica;

// ESTA CLASE MANEJA CUALQUIE TIPO DE OBJETO (Object)
// Creando nuestra propia clase ArayList.
public class Mi_ArrayList_Artesanal {


	private Object[] datosElementos;
	private int i = 0;

	// **** Constructor ****
	public Mi_ArrayList_Artesanal(int elemento) {
		this.datosElementos = new Object[elemento];
	}

	// ESTOS METODOS MANEJAN CUALQUIE TIPO DE OBJETO (Object)
	public Object get(int i) {

		return this.datosElementos[i];
	}

	public void add(Object o) {
		this.datosElementos[this.i] = o;
		this.i++;
	}
	












}
