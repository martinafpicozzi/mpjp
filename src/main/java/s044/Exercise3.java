package s044;

public class Exercise3 { // quanti sono i numeri pari nell'array e somma dei numeri dispari
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 76, 9, 6 };
		int counter = 0;
		int sumodds = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				++counter; 
			else
				sumodds += array[i];
			}
		}
		System.out.println("Your array has " + counter + " even number(s)");
		}
	}