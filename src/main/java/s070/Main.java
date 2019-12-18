package s070;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2]; // creazione di un array di abbaianti (array di referenze a interface)
        
        barkers[0] = new Fox(); // Fox è un barker, perché implementa l'interfaccia barker
        barkers[1] = new Dog();

        for(Barker barker: barkers) {
            System.out.println(barker.bark()); // abbaia la volpe con il suo abbaio e il cane con il suo abbaio
        }
        
        BarkAndWag baw = new Dog(); // creazione del reference, inserito dentro l'interfaccia BarkAndWag
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog();
        System.out.println(dog.bark(3)); // il metodo bark con il parametro int è definito solo in dog, lo posso chiamare solo su dog
    }
}
