package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1)); // char at prende la lettera alla posizione 1

        System.out.println("s < t: " + s.compareTo(t));  // confronta 2 stringhe. (negativo) -1: viene prima in ordine alfabetico; 0: pari; (positivo) 1: viene prima la seconda stringa in ordine alfabetico.
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t)); // unione di stringhe. Creazione di una nuova stringa (su s chiamo il metodo concat e passo t)

        System.out.println("t contains u? " + t.contains(u)); // or è dentro world, quindi ritorna true

        String u2 = t.substring(1, 3); // dato che si tratta di un insieme, che è chiuso a sx e aperto a dx. Quindi viene presa in questo caso la posizione 1 compresa fino alla posizione 3 esclusa. Begin compreso, end escluso.
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); // se non metto un end, significa "da quel punto in avanti"

        System.out.println("u equals u2? " + u.equals(u2)); // verifica se due stringhe sono uguali, verifica il contenuto
        System.out.println("u == u2? " + (u == u2)); // è falso perchè sono due reference diversi, sono due oggetti diversi in memoria (heap)

        System.out.println("First index of 'l' is s: " + s.indexOf('l')); // do una lettera, lui ritorna il primo indice corrispondente alla lettera. Se non c'è ritorna -1
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l')); // ultimo carattere richiesto della parola 
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); // controlla se la stringa è vuota, non NULL ma "". Ritorna un booleano

        System.out.println("s length: " + s.length()); // è un metodo quindi ci vanno le parentesi tonde

        String s2 = s.replace('l', 'q'); // cambia tutte le l con le q
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" "); // il metodo split ritorna un array di stringhe. Si può creare direttamente una nuova stringa prima del . del metodo
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); // è un metodo statico e fa il lavoro opposto dello split. A sinistra di join c'è il nome della classe.
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase()); // ritorna una copia di hello in maiuscolo, la stringa originale non viene cambiata
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]"); // tolti gli spazi ai lati
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); // converte la x nella sua rappresentazione stringa. Anche questo è un metodo statico. Costruisco una stringa partendo dall'oggetto che viene passato.
    }
}
