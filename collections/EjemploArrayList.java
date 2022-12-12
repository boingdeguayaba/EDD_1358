package collections;

import java.util.ArrayList;// importamos la clase ArrayList

public class EjemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> ingredientes = new ArrayList<>();// instanciamos el objeto
		ingredientes.add("1 kg de harina");
		ingredientes.add("3 huevos");
		ingredientes.add("1 barra de mantequilla");
		ingredientes.add("medio kilo de azucar");
		ingredientes.add("un bote de vainilla liquida");
		ingredientes.add("una cucharada de polvos para hornear");
		ingredientes.add("1 litro de leche");//ingresamos todos los ingredientes con el metodo add
		System.out.println(ingredientes.toString());
		System.out.println(ingredientes.size());//nos regresa el numero de elementos de la lista
		ingredientes.remove(5);
		ingredientes.remove(3);
		System.out.println(ingredientes.toString());
		//revisamos el tamaño de la lista despues de eliminar 2 elementos
		System.out.println("aun quedan " + ingredientes.size()+ " articulos por comprar");
		ingredientes.removeAll(ingredientes);
		System.out.println(ingredientes.isEmpty());
	}

}
