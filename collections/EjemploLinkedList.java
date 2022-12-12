package collections;

import java.util.LinkedList;// importamos la clase LinkedList

public class EjemploLinkedList {
	public static void main(String[] args) {
		LinkedList<String> receta = new LinkedList<>();
		receta.addLast("mezcla la harina con una cucharadita de polvos para hornear");
		receta.addLast("derrite la mantequilla y agregala a la leche junto a una cucharadita de vainilla liquida");
		receta.addLast("mezcla los solidos con los liquidos hasta formar una mezcla homogenea");
		receta.addLast("engrasa un molde y vierte la mezcla");
		receta.addLast("precalienta el horno a 200° celcius");
		receta.addLast("hornea por aproximadamente 30 minutos");
		receta.addLast("retira del horno y deja reposar");
		System.out.println(receta.toString());
		while(!receta.isEmpty()) {
		System.out.println(receta.getFirst());
		receta.removeFirst();
		}
	}
}
