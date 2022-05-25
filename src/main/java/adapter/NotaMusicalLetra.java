package adapter;

public class NotaMusicalLetra implements INotaMusical {

    private String notaMusical;

    @Override
    public String getNotaMusical() {return this.notaMusical;  }

    @Override
    public void setNotaMusical(String notaMusical) {
        this.notaMusical = notaMusical;
    }
}
