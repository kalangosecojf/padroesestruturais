package facade;

public class Iluminacao extends Checklist {

    private static Iluminacao iluminacao = new Iluminacao();

    private Iluminacao() {};

    public static Iluminacao getInstancia() {
        return iluminacao;
    }
}
