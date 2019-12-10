package s044;

public class ForEach { //classe è ForEach
    public static void main(String[] args) { //il metodo main riceve come parametro in input un array di stringhe 
        String[] array = new String[5]; //array di stringhe denominato array, è inizializzato per farci stare dentro 5 stringhe. Se fosse un array di interi, i valori sono inizializzati a 0, dato che sono stringhe, le reference sono inizializzate a NULL
        // ...

        for (String item : array) { //per ogni elemento dell'array
            System.out.println(item); // stampo l'elemento dell'array. A println viene passato l'elemento dell'array,  che viene stampato
        }
    }
}
