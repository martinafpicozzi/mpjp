package s044;

public class Main {
	public static void main(String[] args) { // stampare gli argomenti della stringa
		System.out.println(args.length);
		for (String arg : args) { // arg è la variabile di loop
			System.out.println(arg);
		}
		for (int i = 0; i < args.length; i++) { // l'indice è sempre e comunque un intero
			System.out.println(args[i]);
		}
		int i = 0;
		while (i < args.length) {
			System.out.println(args[i]);
			++i;
		}
	}
}