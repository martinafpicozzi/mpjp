package s031;

public class Primitive {
    public static void main(String[] args) { //args è un parametro, non è una variabile inizializzata ma la JVM la inizializza mettendoci i valori passati dall'utente. In questo caso l'utente non ha passato nulla.
        boolean flag = false; //dichiarata la var flag e inizializzata a false
        System.out.println(flag); //invocare il metodo print line e passare come valore flag. Gli stiamo dicendo di stampare flag, che in questo caso è false.

        char c = 'A'; // definita la variabile c e inizializzata con A. In Java apice singolo ' significa character, quello doppio " è stringa
        System.out.println(c); //invocare il metodo println, passandogli il valore A, che è c

        byte y = 42; //definita la variabile y e inizializzata a 42. 
        System.out.println(y); //invocare il metodo println, chiedendo di stampare 42

        short x = 12_000; // è uno short, quindi sono 16 bit. L'underscore aiuta a dividere le centinaia. Java la ignora nell'esecuzione.
        System.out.println(x);

        int i = 1_000_000_000; //viene stampato senza underscore
        System.out.println(i);

        long z = 1_000_000_000_000_000L;
        System.out.println(z);

        float f = 3.12e20F; //la F alla fine definisce che è un float. 3,12 x 10^20
        System.out.println(f);

        double d = 3.12e200; //3,12 x 10^200
        System.out.println(d);
        
        double nan = Double.NaN; //not a number
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        
        if(!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");
        }
    }
}
