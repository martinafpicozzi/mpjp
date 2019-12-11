package s046;

public class Simple {
    static String h() {
        return "Hi"; // la stringa hi viene tornata al chiamante. Chiamando h ritorna una stringa. 
    }

    int f(int a, int b) {
        return a * b;
    }

    void g(boolean flag) { // chiamo g passando un parametro, booleano T o F
        if (flag) { // se flag è vero ESEGUE IL BLOCCO ASSOCIATO // se flag è falso PASSA ALLA RIGA 18
            System.out.println("Hello"); // stampa qualcosa
            return; // termina l'esecuzione del metodo g e non ritorni niente, perchè il metodo è void. Se non metto return stampa sia Hello che Goodbye, altrimenti solo 1
        }

        System.out.println("Goodbye");
    }
}