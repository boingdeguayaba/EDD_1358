package listaDoble;

public class NodoDoble<T> {
	private T dato;
	private NodoDoble<T> siguiente;
	private NodoDoble<T> anterior;

	public NodoDoble() {
	}

	public NodoDoble(T valor) {
		this.dato = valor;
	}

	public NodoDoble(T valor, NodoDoble<T> sig, NodoDoble<T> ant) {
		this.dato = valor;
		this.siguiente = sig;
		this.anterior = ant;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}
	
    public String toString() {
        
        return "|"+dato+"| -->";
    }
}
