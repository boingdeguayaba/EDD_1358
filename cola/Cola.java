package cola;

public class Cola<T> {
	private Nodo<T> head;
	private int tamanio;

	public Cola() {

	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public int lenght() {
		return this.tamanio;
	}

	public void enqueque(T valor) {
		Nodo<T> nuevo = new Nodo<T>(valor);
		if (this.isEmpty()) {
			this.head = nuevo;
		} else {
			Nodo<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		tamanio++;
	}

	public void dequeue() {
		Nodo<T> aux = this.head;
		aux = aux.getSiguiente();
		head = aux;
		aux = null;
		tamanio--;
	}
	public void transversal() {
		Nodo<T> aux = this.head;
		while (aux != null) {
			System.out.print(aux);
			aux = aux.getSiguiente();
		}
		System.out.println("");
	}
}