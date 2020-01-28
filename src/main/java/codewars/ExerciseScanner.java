package codewars;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseScanner {
	public static void main(String[] args) {
//		System.out.println("Please, enter a few words");
//		
//		Scanner scanner = new Scanner(System.in);
//		ArrayList <String> result = new ArrayList <>();
//		while (scanner.hasNext()) {
//			result.add(scanner.next());
//		}
//		System.out.println(result);
//		scanner.close();
		
		System.out.println("Please, enter a few words");
		Scanner scanner2 = new Scanner(System.in);
		ArrayList <String> result2 = new ArrayList <>();
		while (scanner2.hasNext()) {
			String s = scanner2.next();
			if (s.equals("exit")) {
				break;
			}
			result2.add(s);
		}
		scanner2.close();
		System.out.println(result2);
	}
}
