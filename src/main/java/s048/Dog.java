package s048;

public class Dog {
	String name;  // il cane ha la proprietà name, ma non è inizializzata. Per questo è null.

	public Dog() { // costruttore
		System.out.println("Un nuovo cane è stato creato!");
	}

	public void bark() { // creazione del metodo
		System.out.println(name + ": Bau bauuu");
	}
}