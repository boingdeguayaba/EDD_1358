package laberinto;

public class Laberinto {

	final static char C=' '; //camino
	final static char P='|'; //pared
	final static char S='s'; //salida
	final static char E='e'; //entrada
	final static char V='.'; //visitado
	
	final static int InicioI = 0, InicioJ = 3;
    final static int FinI = 7, FinJ = 9;
    
	private static char[][] laberinto= {
			{P,P,P,E,P,P,P,P,P,P},
			{P,C,C,C,P,C,C,P,C,P},
			{P,C,C,C,C,C,P,C,C,P},
			{P,C,P,C,C,P,C,P,C,P},
			{P,C,P,P,C,P,C,P,C,P},
			{P,C,C,C,C,C,C,C,C,P},
			{P,C,C,P,C,P,C,P,C,P},
			{P,C,P,C,C,C,C,C,C,S},
			{P,P,P,C,P,C,P,C,C,P},
			{P,C,P,C,P,C,P,P,P,P},
	};
	
	 public int tamLaberinto() {
	        return laberinto.length;
	    }

	  public void imprimir() {
	        for (int i = 0; i < tamLaberinto(); i++) {
	            for (int j = 0; j < tamLaberinto(); j++) {
	                System.out.print(laberinto[i][j]);
	                System.out.print(' ');
	            }
	            System.out.println();
	        }
	    }

	    public char marcar(int i, int j, char valor) {
	        assert (isInMaze(i, j));
	        char tmp = laberinto[i][j];
	        laberinto[i][j] = valor;
	        return tmp;
	    }

	    public char marcar(Posiciones pos, char value) {
	        return marcar(pos.i(), pos.j(), value);
	    }

	    public boolean isMarked(int i, int j) {
	        assert (isInMaze(i, j));
	        return (laberinto[i][j] == V);
	    }

	    public boolean isMarked(Posiciones pos) {
	        return isMarked(pos.i(), pos.j());
	    }

	    public boolean isClear(int i, int j) {
	        assert (isInMaze(i, j));
	        return (laberinto[i][j] != P && laberinto[i][j] != V);
	    }

	    public boolean isClear(Posiciones pos) {
	        return isClear(pos.i(), pos.j());
	    }

	    public boolean isInMaze(int i, int j) {
	        if (i >= 0 && i < tamLaberinto() && j >= 0 && j < tamLaberinto()) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean isInMaze(Posiciones pos) {
	        return isInMaze(pos.i(), pos.j());
	    }

	    public boolean isFinal(int i, int j) {
	        return (i == Laberinto.FinI && j == Laberinto.FinJ);
	    }

	    public boolean isFinal(Posiciones pos) {
	        return isFinal(pos.i(), pos.j());
	    }

	    @Override
	    public char[][] clone() {

	        char[][] mazeCopy = new char[tamLaberinto()][tamLaberinto()];
	        for (int i = 0; i < tamLaberinto(); i++) {
	            System.arraycopy(laberinto[i], 0, mazeCopy[i], 0, tamLaberinto());
	        }
	        return mazeCopy;
	    }
	    
	    public void solucion() {

	        PilaADT<Posiciones> posiciones = new PilaADT<>();

	        posiciones.push(new Posiciones(InicioI, InicioJ));

	        Posiciones crt, next;
	        while (!posiciones.estaVacia()) {

	            crt = posiciones.pop();

	            if (isFinal(crt)) {
	                break;
	            }

	            marcar(crt, V);

	            next = crt.arriba();
	            if (isInMaze(next) && isClear(next)) {
	                posiciones.push(next);
	            }
	            next = crt.derecha();
	            if (isInMaze(next) && isClear(next)) {
	                posiciones.push(next);
	            }
	            next = crt.izquierda();
	            if (isInMaze(next) && isClear(next)) {
	                posiciones.push(next);
	            }
	            next = crt.abajo();
	            if (isInMaze(next) && isClear(next)) {
	                posiciones.push(next);
	            }
	        }

	        if (!posiciones.estaVacia()) {
	            System.out.println("Camino encontrado");
	        } else {
	            System.out.println("No hay camino");
	        }
	        System.out.println(posiciones.toString());
	        imprimir();
	    }
}