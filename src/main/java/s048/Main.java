package s048;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];                 // abbiamo creato e inizializzato - con null - un array di cani. Se io non metto niente nell'array di stringhe, inizialmente c'è un null in ogni cella. New vuol dire che l'array è nello heap. Non abbiamo creato dei cani, abbiamo solo creato un array. 
		
		for (int i = 0; i < dogs.length; i++) {   // la i serve solo per indicare quante volte fare il loop
			dogs[i] = new Dog();                  // Dog dog = new Dog(); // creato oggetto dog e salvato il reference in Dog. Il reference viene assegnato nella cella dell'array.
		}
		
		dogs[5].bark();                           // abbiamo chiamato il metodo bark solo per il cane in posizione 5
	}
}