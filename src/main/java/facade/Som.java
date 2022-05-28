package facade;

public class Som extends Checklist {

    private static Som som = new Som();

    private Som() {};

    public static Som getInstancia() {
        return som;
    }

}
