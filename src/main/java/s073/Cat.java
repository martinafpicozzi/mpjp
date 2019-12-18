package s073;

public class Cat extends Mammal {
    private Tail tail; // proprietà privata di tipo tail

    public Cat(int gestationDays, int tailLen) { //cat ha due parametri: giorni di gestazione e lunghezza della coda. Cat è un costruttore, ha lo stesso nome della classe e non ha un return, può essere chiamato solo da new
        super(gestationDays); // super: stiamo risalendo la gerarchia, anche questo è un costruttore. Implicitamente chiama il costruttore Mammal. 
        this.tail = new Tail(tailLen); // this: riferimento alla classe corrente.
    } // il gatto alla fine del costruttore avrà tutte le proprietà di Mammal e avrà anche la sua coda

    @Override
    public String toString() { // la variabile tail deve essre convertita in stringa per fare la concatenazione, attraverso il metodo toString().
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]"; // la variabile tail è di tipo (APPARTIENE ALLA CLASSE) Tail. Vedo gestation perchè è nella classe madre, perché è protected.
    }
}
