package laberinto;

public class PilaADT<T> {
	private Nodo<T> top;
	private int tamanio;

	public PilaADT() {
		top = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {
		return top == null;
	}

	public int tamanio() {
		return tamanio;
	}

	public T pop() {
		if (estaVacia()) {
			return null;
		} else {
			T elemento = top.getDato();
			Nodo<T> aux = top.getSiguiente();
			top = null;
			top = aux;
			this.tamanio--;
			return elemento;
		}
	}

	public void peek() {
		if (estaVacia()) {
			System.out.println("Esta vacia");
		} else {
			System.out.println("top= " + top.getDato());
		}
	}

	public void push(T dato) {
		Nodo<T> aux = new Nodo<T>(dato, top);
		top = aux;
		tamanio++;
	}

	@Override
	public String toString() {
		if (estaVacia()) {
			return "La pila esta vacia";
		} else {
			String resultado = "";
			Nodo<T> aux = top;
			while (aux != null) {
				resultado += aux.toString();
				aux = aux.getSiguiente();
			}
			return resultado;
		}
	}
}