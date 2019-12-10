package s044;

public class Exercise2 {                       // ho un array di interi e devo stampare il minimo
	public static void main(String[] args) {
		int[] array = { 3, 5, 1, 7 };
		int min = array[0];

		for (int i = 1; i < array.length; i++) {  // tutti gli array hanno questa proprietà array.length, meglio essere generici
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
