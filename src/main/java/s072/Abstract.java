package s072;

public abstract class Abstract {
    public abstract void anAbstractMethod(); // è un metodo astratto, c'è il ; alla fine, non ha un body. Non si può creare un oggetto, perché la classe è astratta.

    public void aConcreteMethod() { // l'implementazione di base in questo caso non fa nulla perchè non ha il body
    }
}
