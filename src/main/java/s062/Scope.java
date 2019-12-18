package s062;

public class Scope {
    private static int staticMember = 5; // privato lo vedo solo nella classe, statico è relativo alla classe e non all'oggetto
    private long member = 5; // per vedere member dovrei avere l'oggetto di tipo scope. Member è una proprietà non statica

    public void f() {
        int local = 7;
        if (staticMember == 2) {
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }
    
    public static void main(String[] args) {
        double local = 5; // c'è un'altra variabile local ma non hanno nulla a che fare perché sono relative solo al blocco
        System.out.println(local);
        staticMember = 12;
        Scope scope = new Scope(); // serve l'oggetto per lavorare su member, perchè non è statico ma è una variabile di istanza
        System.out.println(scope.member); // proprietà member dell'oggetto scope passata al metodo syso
        // qui il metodo f può essere chiamato solo se esiste un oggetto scope, perchè f non è static
    }
}
