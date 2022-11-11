package cola;

public class PruebaCola {
	public static void main(String[] args) {

		Cola<Integer> cola = new Cola<Integer>();
		System.out.println(cola.isEmpty());
		System.out.println("el tamaño de la cola es: ");
		System.out.println(cola.lenght());
		cola.enqueque(1);
		cola.enqueque(2);
		cola.enqueque(3);
		cola.enqueque(4);
		cola.enqueque(5);
		System.out.println("el tamaño de la cola es: ");
		System.out.println(cola.lenght());
		cola.transversal();
		System.out.println(cola.isEmpty());
		cola.dequeue();
		cola.transversal();
		cola.dequeue();
		cola.transversal();
		System.out.println("el tamaño de la cola es: ");
		System.out.println(cola.lenght());
	}
}