package codewars;

// Write a Java program to print 'Hello' on screen and then print your name on a separate line
public class exercises {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Martina Picozzi");
		System.out.print("Hello\nMartina Picozzi");
	}

// Write a Java program to print the sum of two numbers.
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

// Write a Java program to divide two numbers and print on the screen
	public static void div(int a, int b) {
		System.out.println(a / b);
	}

// Write a Java program that takes two numbers as input and display the product of two numbers
	public static void prod(int a, int b) {
		int c = a * b;
		System.out.println(a + "*" + b + "=" + c);
	}

// Write a Java program to compute a specified formula
	public static void exp() {
		double a = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println(a);
	}

// Write a Java program that takes three numbers as input to calculate and print the average of the numbers
	public static void avg(int a, int b, int c) {
		int d = (a + b + c) / 3;
		System.out.println(d);
	}

// Write a Java program to print the area and perimeter of a rectangle.
	public static void rectarea(int a, int b) {
		int p = (a + b) * 2;
		int ar = a * b;
		System.out.println("Perimeter is" + p + ". Area is" + ar);
	}

// Write a Java program to add two binary numbers
	public static String bin(String s, String t) {
		int sum = 0;
		int len = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				sum += Math.pow(2, (len - 1 - i));
			}
		}
		int sum2 = 0;
		int len2 = s.length();
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(i) == '1') {
				sum2 += Math.pow(2, (len2 - 1 - i));
			}
		}
		Integer dec = sum + sum2;
		String z = Integer.toBinaryString(dec);
		return z;

	}

// Write a Java program to get a number from the user and print whether it is positive or negative.
	public static void posorneg(int a) {
		if (a >= 0) {
			System.out.println(a + "is positive");
		} else {
			System.out.println(a + "is negative");
		}
	}
	
// Write a Java program to test if an array contains a specific value
	public static void contains(int[] array, int a) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == a) {
				System.out.println("Your array contains" + a);
			}
		}
	}

// Write a Java program to find the index of an array element
	public static void index(int[] array, int a) {
		for (int i = 0; i < array.length; i++) {
			if (i == a) {
				System.out.println("The index of your element is" + a);
			}
		}
	}
}
