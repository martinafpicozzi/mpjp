package s073;

public abstract class Mammal { // la classe mammal è astratta
    protected int gestation; // proprietà del mammal

    public Mammal(int gestation) { // è un costruttore, ha lo stesso nome della classe
        this.gestation = gestation; // voglio mettere gestation (valore/parametro passato dall'utente) nella proprietà gestation
    }

    @Override
    public String toString() { //toString è stato dichiarato nella classe madre. Se non è specificata la classe madre, sottointendiamo Object, la prima classe della gerarchia
        return "Mammal [gestation=" + gestation + "]";
    }
}
