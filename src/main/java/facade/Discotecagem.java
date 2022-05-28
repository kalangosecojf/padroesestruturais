package facade;

public class Discotecagem extends Checklist {

    private static Discotecagem discotecagem = new Discotecagem();

    private Discotecagem() {};

    public static Discotecagem getInstancia() {
        return discotecagem;
    }
}
