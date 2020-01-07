package ex;

import java.lang.reflect.Array;

public class S60 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString(); // converte stringbuilder in stringa
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
//	public static String removeVowels(String s) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < s.length() - 1; i++) {
//			if ((s.charAt(i)) != ('a', 'e', 'i' , 'o' , 'u')) {
//				sb.append(s.charAt(i));
//			}
//		}
//		return sb.toString();
//	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
		int j = 0;
		for (int i = data.length -1; i >= 0; i --) { // si parte dalla fine dell'array
			result [j] = data [i];
			j++;
		}
		return result;
	}

	/**
	 Seconda possibilità di codice* 
	 */
	public static int[] reverse2(int[] data) {
		int[] result = new int[data.length];
		for (int i = data.length -1, j = 0; i >= 0; j++, i --) {
			result [j] = data [i];
		}
		return result;
	}
	
	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) { // attenzione: se faccio divisione tra interi ottengo un intero. Deve
												// ritornare un double
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

//	for (int value : data) { // con il for each
//		sum += value;

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) { // si può usare l'Integer, classe che contiene la proprietà del valore più piccolo

//		if (data.length == 0) { // se data è vuoto (null o 0, deve tirare un'eccezione)
//			return biggest;
//		}
//		if (data == null) {         // NON E' CHIARO
//			return;
//		}
		
		int biggest = data[0];
		for (int i = 1; i < data.length; i++) {
			if (biggest < data[i]) {
				biggest = data[i];
			}
		}
		return biggest;
	}
}
// int biggest = Integer.MIN_VALUE; 