package s073;

public class Main {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[2]; // creazione di un array di Mammal, che erano astratti, ma dentro ci metto Dog e Cats
        mammals[0] = new Dog(63, 40); // ctrl + click : (int gestationDays, int tailLen)
        mammals[1] = new Cat(63, 20);

        for (Mammal mammal : mammals) { // per ogni mammals prendo il reference corrente e stampo il mammal che trasformo in stringa
            System.out.println(mammal.toString()); // mammal chiama il metodo toString di Dog e poi di Cat, per questo poi ritona le stringhe
        }
    }
}
