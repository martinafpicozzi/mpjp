package s073;

public class Tail { // classe pubblica con proprietà privata size
    private int size;

    public Tail(int size) { // la size viene passata dall'utente e viene messa in this.size
        this.size = size;
    }

    public int getSize() { // size è privato, nasce con una certa dimensione e rimane tale
        return size; // quando chiamo getSize mi torna la size
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
