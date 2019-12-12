package s044;

public class DifficultLoop { // se c'è 1 o 7 dimmi in che posizione sono, se non ci sono stampa che non c'è
	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4 };

//		for (int i = 0; i < data.length; i++) {
//			if (data[i] == 1 | data[i] == 7) {
//				System.out.println(i);
//			} else {
//				System.out.println("-1");
//			}
//		}
//System.out.println();
		boolean seven = false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 7) {
				seven = true;
			}
			if (! seven) {
				System.out.println("Not found! Sorry :(");
			}
		}
	}
}
// da rivedere