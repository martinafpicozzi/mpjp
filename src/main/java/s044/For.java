package s044;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {             //i < 4, i, che è la variabile di loop, arriva fino a 4. Da i=5 si esce dal loop
            System.out.println("Begin block loop " + i);

            if (i == 2) { //check: verifico la condizione, che è false - i=0 e 0 viene confrontato con 2 -, quindi passo all'istruzione successiva
                continue; // l'iterazione ha finito di esistere, torna a i++
            }

            System.out.println("End block loop " + i); //alla fine di tutto il primo ciclo di loop torniamo al for, nello specifico a i++, quindi incrementiamo la i
        }
    }
}
