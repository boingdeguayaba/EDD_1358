package listaDoble;

public class ListaDobleADT<T> {
	NodoDoble<T> head;
	int tamanio;

	public ListaDobleADT() {

	}

	public ListaDobleADT(NodoDoble<T> head, int tamanio) {
		super();
		this.head = head;
		this.tamanio = tamanio;
	}

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		NodoDoble aux = this.head;
		while (aux != null) {
			aux = aux.getSiguiente();
			tamanio++;
		}
		return tamanio;
	}

	public void agregarAlFinal(T valor) {
		NodoDoble<T> nuevo = new NodoDoble(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevo.setSiguiente(null);
			nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
		/*nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
			aux = null;
			nuevo = null;*/
		}
	}

	public void agregarAlInicio(T valor) {
		NodoDoble<T> nuevo = new NodoDoble(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(this.head);
			head.setAnterior(nuevo);
			this.head = nuevo;
		}
	}

	public void buscar(T valor) {
		int contador = 1;
		NodoDoble aux = this.head;
		while (aux.getDato() != valor) {
			aux = aux.getSiguiente();
			contador++;
		}
		System.out.println("se encuentra en la posicion: " + contador);
	}

	public void agregarDespuesDe(T valor, int posicion) {
		NodoDoble nuevo = new NodoDoble(valor);
		NodoDoble aux = this.head;
		NodoDoble aux2 = this.head;
		for (int contador = 1; contador <= posicion-1; contador++) {
			aux = aux.getSiguiente();
			//aux2 = aux2.getSiguiente();
		}
		//aux2.getSiguiente();
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		aux.getAnterior();
		nuevo.setAnterior(aux);
		nuevo.getSiguiente().setAnterior(aux);
		
		/*aux.setSiguiente(nuevo);
		aux2.setAnterior(nuevo);
		nuevo.setSiguiente(aux2);
		nuevo.setAnterior(aux);*/
	}

	public void eliminarElPrimero() {
		NodoDoble aux = this.head;
		aux = aux.getSiguiente();
		head = aux;
		head.setAnterior(null);
		aux = null;
	}

	public void eliminarElUltimo() {
		NodoDoble aux = this.head;
		NodoDoble aux2 = this.head;
		int contador = 1;
		while (aux.getSiguiente() != null) {
			aux = aux.getSiguiente();
			contador++;
		}
		for (int i = 1; i <= contador - 2; i++) {
			aux2 = aux2.getSiguiente();
		}
		aux2.setSiguiente(null);
	}

	public void eliminar(int posicion) {
		posicion--;
		NodoDoble aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}
		//aux2.getSiguiente().getSiguiente();
		aux.setSiguiente(aux.getSiguiente().getSiguiente());
		aux.getSiguiente();
		aux.setAnterior(aux.getAnterior().getAnterior());
	}

	public void actualizar(T aCambiar, T dato) {
		NodoDoble aux = this.head;
		while (aux.getDato() != aCambiar) {
			aux = aux.getSiguiente();
		}
		aux.setDato(dato);
	}

	public void transversal(int direccion) {
		if (direccion == 0) {
			NodoDoble curr_node = this.head;
			while (curr_node != null) {
				System.out.print(curr_node);
				curr_node = curr_node.getSiguiente();
			}
			System.out.println("");
		} else {
			NodoDoble aux = this.head;
			while(aux.getSiguiente()!=null) {
				aux = aux.getSiguiente();
			}
			while (aux.getAnterior() != null) {
				System.out.print(aux);
				aux = aux.getAnterior();
			}
		}
	}
}