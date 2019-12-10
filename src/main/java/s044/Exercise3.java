package s044;

public class Exercise3 { // quanti sono i numeri pari nell'array
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8 };
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				counter = ++ counter; 
			}
		}
		System.out.println("Your array has " + counter + " even numbers");
	}
}