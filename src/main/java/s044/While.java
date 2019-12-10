package s044;

public class While {
    public static void main(String[] args) {
        boolean condition = true;
        boolean something = true;

        while (condition) { // se la condition è true inizia il loop. FINCHE' LA CONDITION E' TRUE, FAI IL LOOP
            System.out.println("something is true");

            if (something) { //check: stampa la roba che dice sopra solo IF
                condition = false; //alla fine condition diventa false, si ritorna al while, vede che condition è false e non entra nel loop
            }
        }
    }
}
