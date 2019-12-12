package s046;

public class MethodCaller {
    public static void main(String[] args) { // la classe MethodCaller ha il metodo main
        System.out.println(Simple.h()); // String s = Simple.h() - System.out.println (s) // Chiamo il metodo h definito all'interno della classe Simple (che si trova nel file Simple.java, che si trova nello stesso package. JVM ha chiamato h, ha ritornato la stringa "Hi!" e la passo come parametro al metodo println, che stampa il parametro in input sulla console
         
        Simple reference = new Simple(); // stanzia un oggetto di tipo Simple nello heap e alloca nello stack spazio per una variabile di tipo reference chiamata reference e nello spazio metti il reference dell'oggetto Simple. Se non c'è l'oggetto non posso chiamare i metodi.
        
        int result = reference.f(7, 6); //chiamare il metodo f di reference
        System.out.println(result);
        
        reference.g(true); //vai a chiamare il metodo g // reference è una variabile reference a Simple. E' UN REFERENCE A UN OGGETTO DI TIPO SIMPLE 
        reference.g(false);
    }
}
