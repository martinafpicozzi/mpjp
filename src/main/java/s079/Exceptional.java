package s079;

public class Exceptional {
    public void f() {
        try { // prova ad eseguire
            g(); // il metodo g
        } catch (Exception ex) { // catch perchè riceve il throw dell'eccezione
            System.out.println("Exception caught");
        } finally {
            cleanup(); // metodo della classe exceptional
        }
    }

    public void g() throws Exception { // g tira eccezioni di tipo exception
        // ...
        if (somethingUnexpected()) { // se ritorna true (vedi sotto)
            throw new Exception(); // tira l'eccezione
        }
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        Exceptional exceptional = new Exceptional();
        exceptional.f(); // per chiamare il metodo f doveva esserci un oggetto, per questo è stato creato alla riga 30 l'oggetto
    }
}
