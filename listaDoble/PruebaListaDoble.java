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
	lista.transversal(0);
	lista.transversal(1);
	}
}
