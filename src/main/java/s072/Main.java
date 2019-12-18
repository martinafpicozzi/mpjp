package s072;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        Abstract ma = new Abstract();
//        Abstract2 ma2 = new Abstract2();

        Abstract ma = new Concrete(); // creazione di oggetto di tipo concrete ma la variabile è di tipo astratto, perchè punta a un oggetto concreto
        ma.anAbstractMethod(); //il metodo era astratto in gatto, poi è stato definito in Concrete.java

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod();
    }
}
