package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // creazione di 3 SB
        StringBuilder sb2 = new StringBuilder(20);
        StringBuilder sb3 = new StringBuilder("hello"); // la stringa viene modificata con i comandi che indichiamo sotto
        
        System.out.println("capacity 1: " + sb.capacity()); // capacità: quanto spazio allocato per lo SB
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world"));
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2));
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c")); //inserire una stringa a partire da una certa posizione
        
        System.out.println("current sb3 length: " + sb3.length());
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r")); // dalla posizione 2 alla posizione 7 (esclusa)
        
        System.out.println("reversing: " + sb3.reverse());
        
        sb3.setCharAt(5, 'a');
        System.out.println("setCharAt: " + sb3);
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3);
    }
}
