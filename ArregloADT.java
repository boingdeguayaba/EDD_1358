package tareaDos;

import java.util.ArrayList;

public class ArregloADT {
	private int longitud;
	private ArrayList<Object> datos;
	private int indice;

	public ArregloADT(int longitud, ArrayList<Object> datos) {
		super();
		this.longitud = longitud;
		this.datos = datos;
		datos=new ArrayList();
		for (int i = 0; i < longitud; i++) {
			datos.add(new Object());
		}
	}

	public void getElemento(int indice, ArrayList<Object> datos) {
		System.out.println(datos.get(indice));
	}

	public void setElemento(int indice, ArrayList<Object> datos) {
		if (indice >= 0 && indice < this.longitud) {
			datos.set(indice, datos);
		}
	}

	public void getLongitud() {
		System.out.println(datos.size());
	}

	public void limpiar() {
		datos.replaceAll(null);
	}

	@Override
	public String toString() {
		return "ArregloADT [longitud=" + longitud + ", datos=" + datos + ", indice=" + indice + "]";
	}
	
}