package s070;

public class Dog implements BarkAndWag {
    @Override
    public String bark() { // è diverso dal metodo bark(int) che c'è sotto. Metodi con nome uguale ma diversi sono chiamati overload, il nome bark è sovraccaricato di significati.
        return "woof!";
    }

    public String bark(int count) { // se chiamo bark passando un intero faccio appendere per x volte "woof!". Il nome completo di un metodo ha il nome e la lista dei parametri.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}