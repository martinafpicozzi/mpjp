package s049;

public class MyString {
	static int compareTo(String s, String t) {

		int lengthS = s.length();
		int lengthT = t.length();
		int minLength = 0;

		if (lengthS < lengthT) {
			minLength = lengthS;
		} else {
			minLength = lengthT;
		}

		for (int i = 0; i < minLength; i++) {
			if (s.charAt(i) < t.charAt(i)) {
				return -1; // il compito dei metodi è ritornare valori
			} else if (s.charAt(i) > t.charAt(i)) {
				return +1;
			}
		}

		if (lengthS == lengthT) {
			return 0;
		} else if (lengthS < lengthT) {
			return -1;
		} else {
			return +1;
		}
	}

	public static void main(String[] args) {
		String s1 = "hello";
		String t1 = "world";

		int result1 = compareTo(s1, t1); // è un metodo statico, lo posso passare anche senza che ci sia un oggetto

		System.out.println("hello vs world, result is: " + result1);

		String s2 = "hello";
		String t2 = "hello";

		int result2 = compareTo(s2, t2);

		System.out.println("hello vs hello, result is: " + result2);

		String s3 = "hello";
		String t3 = "hell";

		int result3 = compareTo(s3, t3);

		System.out.println("hello vs hell, result is: " + result3);
	}
}
