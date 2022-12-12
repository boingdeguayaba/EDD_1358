package collections;

import java.util.Stack;// importamos la clase stack

public class EjemploStack {
	public static void main(String[] args) {
		Stack<String> posiciones = new Stack<>(); // instanciamos el objeto
		posiciones.push("Jorge");
		posiciones.push("Enrrique");
		posiciones.push("Carlos");
		posiciones.push("Sebastian");
		posiciones.push("Jose");
		int lugar = 5;
		while (!posiciones.isEmpty()) {
			System.out.println("El alumno " + posiciones.pop() + " quedo en " + lugar + " lugar");
			lugar--;
		}
	}
}
