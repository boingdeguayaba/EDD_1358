package listaDoble;

public class PruebaListaDoble {
	public static void main(String[] args) {
		
	ListaDobleADT<Integer> lista=new ListaDobleADT<Integer>();
	
	System.out.println(lista.estaVacia());
	lista.agregarAlInicio(2);
	lista.agregarAlInicio(1);
	lista.agregarAlFinal(3);
	lista.agregarAlFinal(5);
	lista.transversal(0);
	lista.agregarDespuesDe(4, 3);
	lista.transversal(0);
	lista.eliminarElPrimero();
	lista.transversal(0);
	lista.eliminarElUltimo();
	lista.transversal(0);
	lista.agregarAlFinal(6);
	lista.agregarAlFinal(7);
	lista.agregarAlFinal(8);
	lista.transversal(0);
	lista.eliminar(4);
	lista.transversal(0);
	lista.actualizar(8, 10);
	lista.transversal(0);
	System.out.println(lista.getTamanio());
	System.out.println(lista.estaVacia());
	lista.eliminar(4);
	//si el valor de transeversal es 0 la lista se recorre hacia la derecha, si es 1 se recorre hacia la izquierda
	//tuve problemas con las referencias "NodoDoble<T> anterior" por lo que el transversal hacia la izquierda no funciona, creo que el problema se encuentra en el metodo eliminar
	lista.transversal(0);
	lista.transversal(1);
	}
}
