package laberinto;

public class Posiciones {
	private int i;
	private int j;

	public Posiciones(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public int i() {
		return i;
	}

	public int j() {
		return j;
	}

	public void print() {
		System.out.println("(" + i + "," + j + ")");
	}

	public Posiciones arriba() {
		return new Posiciones(i - 1, j);
	}

	public Posiciones abajo() {
		return new Posiciones(i + 1, j);
	}

	public Posiciones derecha() {
		return new Posiciones(i, j + 1);
	}

	public Posiciones izquierda() {
		return new Posiciones(i, j - 1);
	}
}
