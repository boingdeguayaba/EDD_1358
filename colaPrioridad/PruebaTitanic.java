package colaPrioridad;

public class PruebaTitanic {
public static void main(String[] args) {
	ColaPrioridad<String> colaPrioridad=new ColaPrioridad<String>(5);
	colaPrioridad.enqueue(1, "Niños");
	colaPrioridad.enqueue(4, "Mecánico");
	colaPrioridad.enqueue(3, "Hombres");
	colaPrioridad.enqueue(4, "vigia");
	colaPrioridad.enqueue(5, "Capitan");
	colaPrioridad.enqueue(4, "Timonel");
	colaPrioridad.enqueue(3, "Mujeres");
	colaPrioridad.enqueue(2, "3ra edad");
	colaPrioridad.enqueue(1, "Niñas");
	// estoy probando que pasa si metes una prioridad mas grande que la maxima
	colaPrioridad.enqueue(6, "Polizón");
	colaPrioridad.transversal();
	System.out.println(colaPrioridad.lenght());
	System.out.println("Es hora de meterlos en los botes salvavidas");
	colaPrioridad.dequeue(); //1
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //2
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //3
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //4
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //5
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //6
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //7
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //8
	colaPrioridad.transversal();
	colaPrioridad.dequeue(); //9
	colaPrioridad.transversal();
	System.out.println(colaPrioridad.lenght());
	System.out.println("Todos se encuentran en los botes salvavidas, se han salvado :)");
}
}
