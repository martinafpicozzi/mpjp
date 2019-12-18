package s072;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract { // la classe concreta estende quella astratta (ad esempio la classe persiano estende la classe astratta gatto)
    @Override // il metodo anAbstactMethod non viene creato qui ma viene da sopra 
    public void anAbstractMethod() {
        System.out.println("not abstract anymore");
    }
}
