package colaPrioridad;

public class NodoPrioridad<T> {
    private T dato;
    private NodoPrioridad<T> siguiente;
    private int prioridad;
    
    public NodoPrioridad() {
    }

    public NodoPrioridad(T valor) {
        this.dato = valor;
    }

    public NodoPrioridad(T dato, NodoPrioridad<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    

    public NodoPrioridad(T dato, int prioridad) {
		super();
		this.dato = dato;
		this.prioridad = prioridad;
	}

	public NodoPrioridad<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrioridad<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    

    public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
    public String toString() {
        
        return "|"+dato+"| -->"; 
    }
    public String printAll(){
        return "[ Prioridad" + prioridad + "Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }
}
