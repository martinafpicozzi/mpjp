package s047;

import java.util.Objects;

public class ParameterPassing { // java esegui questa classe PP, deve esserci il metodo main, che è alla riga 52
    static void primitive(int parameter) { //in parameter mette primitiveValue =12 perchè fa il passaggio by value, indicato nel main. E' una variabile inizializzata dal chiamante (il chiamante di primitive è main, main chiama primitive alla riga 56). Al chiamante non ritorna niente.
        parameter += 1;
        System.out.println("parameter is " + parameter);
    } // finisce il blocco e il return è sottointeso e si ritorna dal chiamante (main) che ha il controllo

    static int square(int value) { //value è una copia, il valore originario non viene modificato. Square ha passato primitiveValue
    	value *= value;
    	System.out.println("Value is " + value);
    	return value;
    }
    
    static int triple(int value) {
    	value *= 3; 
    	System.out.println("Value is " + value);
    	return value;
    }
    
    static void immutableReference(String parameter) {
        if (parameter == null) { //bisogna saper gestire anche i null
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
        Objects.requireNonNull(parameter, "Parameter should not be null");

        System.out.println("parameter id was " + System.identityHashCode(parameter)); // io ho accesso a questo identityHashCode, tipo l'indirizzo dell'oggetto nello heap
        parameter += " there"; //= Hi there. Non ho modificato parameter, perchè esiste ancora nello heap e c'è dentro ancora Hi. Ho creato una nuova stringa, che è la concatenazione della stringa precedente con quella aggiunta ("there")
        System.out.println("Now parameter id is " + System.identityHashCode(parameter));
        System.out.println("parameter value is " + parameter);
    }

    static void reference(StringBuilder parameter) { //ho chiamato reference e ho passato Hi
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
        Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter.append(" there"); // metodo append (metodo append per StringBuilder) per appendere ad Hi + there
        System.out.println("parameter value is " + parameter);
    } // torniamo al chiamante

    static void reference(int[] data) {
        if (data == null || data.length == 0) { // or: prima fa il controllo a sinistra del || e si prosegue in base a data == null oppure no
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
        Objects.requireNonNull(data, "Parameter should not be null");

        data[0] += 1;
        System.out.println("data[0] is " + data[0]);
    }

    public static void main(String[] args) {
        int primitiveValue = 12;

        System.out.println("primitiveValue has been initialized to " + primitiveValue);
        primitive(primitiveValue); // invocazione al metodo primitive (è un metodo perchè è seguito dalle parentesi tonde) della classe corrente, che è ParameterPassing, passandogli la variabile primitiveValue
        
        int result = square(primitiveValue);
        System.out.println("primitiveValue squared is " + result);

        result = triple(primitiveValue);
        System.out.println("primitiveValue tripled is " + result);
        
        String string = "Hi";

        System.out.println("string has been initialized to " + string);
        immutableReference(string);
        System.out.println("string is still " + string);

        StringBuilder referenceValue = new StringBuilder("Hi");

        System.out.println("referenceValue has been initialized to " + referenceValue);
        reference(referenceValue);
        System.out.println("referenceValue now is " + referenceValue);

        int[] array = { 42 }; // creazione di array di interi e lo inizializzo con un solo intero, 42. 

        System.out.println("array[0] is " + array[0]);
        reference(array); // chiamo reference di array
        System.out.println("array[0] now is " + array[0]);
    }
}
