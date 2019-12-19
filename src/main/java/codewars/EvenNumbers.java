package codewars;

//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.

public class EvenNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				counter++;
			}
		}
		int[] array = new int[counter];
		int pos = 0;
		for (int i = 0; i < array.length; i++) {
			if (numbers[i] % divider == 0) {
				numbers[i] = array[pos];
			}
			pos++;
		}
		return array;
	}
}