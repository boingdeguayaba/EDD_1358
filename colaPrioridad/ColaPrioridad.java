package colaPrioridad;

import listaLigada.Nodo;

public class ColaPrioridad<T> {
	private NodoPrioridad<T> head;
	private int tamanio;
	private int nivMax;

	public ColaPrioridad(int nivMax) {
		super();
		this.nivMax = nivMax;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public int lenght() {
		return this.tamanio;
	}

	public void enqueue(int nivel, T dato) {
		if (nivel <= nivMax) {
			NodoPrioridad<T> nuevo = new NodoPrioridad<T>(dato, nivel);
			if (this.isEmpty()) {
				this.head = nuevo;
				tamanio++;
			} else {
				if (nivel == nivMax) {
					NodoPrioridad<T> aux3 = this.head;
					while (aux3.getSiguiente() != null) {
						aux3 = aux3.getSiguiente();
					}
					aux3.setSiguiente(nuevo);
					tamanio++;
				} else {
					NodoPrioridad<T> aux = head;
					NodoPrioridad<T> aux2 = head;
					boolean encontrado = false;
					while ((aux.getSiguiente() != null) && (!encontrado)) {

						if (aux.getSiguiente().getPrioridad() > nivel) {
							encontrado = true;
						} else {
							aux = aux.getSiguiente();
						}
					}
					aux2 = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(aux2);
					tamanio++;
				}

			}
		} else {
			System.out.println(
					"el nivel de prioridad de este elemento es mayor a la prioridad maxima de la cola no podemos meter el elemento: "
							+ nivel + " " + dato + ", el nivel maximo es: " + nivMax);
		}
	}

	public void dequeue() {
		NodoPrioridad<T> aux = this.head;
		aux = aux.getSiguiente();
		head = aux;
		aux = null;
		tamanio--;
	}

	public void transversal() {
		NodoPrioridad<T> aux = this.head;
		while (aux != null) {
			System.out.print(aux);
			aux = aux.getSiguiente();
		}
		System.out.println("");
	}

}
