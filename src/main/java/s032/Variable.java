package s032;

public class Variable {
    public static void main(String[] args) {
        int value = 42;
        String name = "Bob";

        System.out.println(name);
        System.out.println(value);

        // Dangerous! Beware of null!
        String noName = null; //null è un finto indirizzo, non ho un reference per quell'oggetto
        System.out.println(noName);
        
        // Java 10 inferred type
        var bValue = 42; //con java 10, se scrivo var è java che attribuisce la tipologia di variabile
        var bName = "Tom"; //qui java capisce che è una stringa

        System.out.println(bName);
        System.out.println(bValue);
    }
}
