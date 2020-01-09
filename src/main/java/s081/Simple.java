package s081;

public class Simple {
	public int negate(int value) { // non si può negare il valore minimo, perchè se si prova a fare ritorna lo
									// stesso numero in quanto non entrerebbe nella locazione di memoria
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE"); // unchecked exception perchè non c'è THROWS
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException { // mynegate creata sotto, estende exception. è checked
																// quindi deve essere dichiarata
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE); // max value non è la risposta giusta ma si avvicina a quella richiesta (sarebbe il valore minimo positivo -1)
		}
		return -value;
	}

	public static void main(String[] args) { // args: array di stringhe, passato quando chiediamo l'esecuzione della classe alla jvm (run > run configurations > args)
		Simple simple = new Simple();

//		if (args.length == 0) {
//			System.out.println("No value!");
//			return;
//		} // è stato unito sotto nel try - catch

//        int value = Integer.parseInt(args[0]); // args 0 è una stringa quindi deve essere convertita in intero

		try {
			int value = Integer.parseInt(args[0]);
			System.out.println("Negate " + value);
			int x = simple.negate2(value); // value, che è 52, passato alla jvm, viene negato in quanto diventato intero da stringa qual era
			System.out.println("My value negated is: " + x);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Pass me an Integer!");
			return; // termina l'esecuzione del metodo a questo punto. Se sotto c'è altro codice che deve essere eseguito comunque non deve essere messo. Ad esempio in questo caso il ciao non viene sysato
		} catch (MyNegateException mne) {
			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
			return;
		} 
		System.out.println("Ciao");
	}
}

class MyNegateException extends Exception { // creata per aggiungere un comportamento particolare
	private static final long serialVersionUID = 1L;
	private int alternativeValue; // proprietà privata, solo per gli oggetti di questa classe e non può essere cambiata perchè è privata. è la proprietà di mynegateexception

	public MyNegateException(int alternativeValue) {
		this.alternativeValue = alternativeValue;
	}

	public int getAlternativeValue() {
		return alternativeValue;
	}
}
