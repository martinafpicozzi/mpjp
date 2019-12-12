package s044;

public class Loop {
	public static void main(String[] args) { // args è un parametro, una variabile
		int[] data = { 5, 7, 1, 3, 4 };

		System.out.print("[");

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]); // senza ln in println non va a capo
			if (i != data.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

		System.out.println();
		
//		System.out.println("]");    alternativa ai due syso sopra

		System.out.print("[");

		int i = 0;
		while (i < data.length) {
			System.out.print(data[i]);
			if (i != data.length - 1) {
				System.out.print(", ");
			}
			++i; // i++; i= i+1; i += 1. Tutti si equivalgono
		}

		System.out.print("]");

		System.out.println();

		System.out.print("[");

		for (int item : data) { // per tutti gli item di data (array). Item è una variabile, rappresenta il valore corrente dell'array. Non si considera l'indice ma l'item.
			System.out.print(item + ", ");
//			if (i != data.length - 1)
//				System.out.print(", "); non posso togliere la virgola alla fine perchè con il for each non conosco la posizione (i)
		}

		System.out.print("]");
	}
}
