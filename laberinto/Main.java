package laberinto;

public class Main {
	public static void main(String[] args) {

        Laberinto maze = new Laberinto();
        maze.imprimir();
        System.out.println("Solución: ");
        maze.solucion();
}
}