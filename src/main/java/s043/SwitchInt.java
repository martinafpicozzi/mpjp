package s043;

public class SwitchInt {
    public static void main(String[] args) {
        int value = 42;

        // ...

        switch (value) {
        case 1: // non significa CASO 1, ma NEL CASO IN CUI VALUE SIA 1
            System.out.println("value is one"); // tutto questo prima del ; è uno statement
            break; // se tolgo il break, la JVM non li vede e non c'è la fine del case e passa a quello successivo fino a che trova un break
        case 2:
            System.out.println("value is two");
            break;
        default:
            System.out.println("value is neither one nor two");
            break;
        }
    }
}
