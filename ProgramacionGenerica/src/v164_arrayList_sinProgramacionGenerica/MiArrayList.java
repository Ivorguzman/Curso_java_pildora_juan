package v164_arrayList_sinProgramacionGenerica;

// ESTA CLASE MANEJA CUALQUIE TIPO DE OBJETO (Object)
// Creando nuestra propia clase ArayList.
public class MiArrayList {


	private Object[] datosElementos;

	private int i = 0;


	public MiArrayList(int e) {
		this.datosElementos = new Object[e];
	}

	// ESTA CLASE MANEJA CUALQUIE TIPO DE OBJETO (Object)
	public Object get(int i) {

		return this.datosElementos[i];
	}

	public void add(Object o) {
		this.datosElementos[this.i] = o;
		this.i++;
	}
	












}
