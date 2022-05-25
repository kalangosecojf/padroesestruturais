package adapter;

public class NotaMusicalAdapter extends NotaMusicalTom {

    private INotaMusical notaMusical;

    public NotaMusicalAdapter(INotaMusical notaMusical) {
        this.notaMusical = notaMusical;
    }

    public String recuperarNotaMusical() {
        if (this.getNotaTom() == "Dó")
            notaMusical.setNotaMusical("C");
        else
            if (this.getNotaTom() == "Ré")
                notaMusical.setNotaMusical("D");
            else
                if (this.getNotaTom() == "Mi")
                    notaMusical.setNotaMusical("E");
                else
                    if (this.getNotaTom() == "Fá")
                        notaMusical.setNotaMusical("F");
                    else
                        if (this.getNotaTom() == "Sol")
                            notaMusical.setNotaMusical("G");
                        else
                            if (this.getNotaTom() == "Lá")
                                notaMusical.setNotaMusical("A");
                            else
                                notaMusical.setNotaMusical("B");
        return notaMusical.getNotaMusical();
    }

    public void salvarNotaMusical() {
        if (notaMusical.getNotaMusical().equals("C"))
            this.setNotaTom("Dó");
        else
            if (notaMusical.getNotaMusical().equals("D"))
                this.setNotaTom("Ré");
            else
                if (notaMusical.getNotaMusical().equals("E"))
                    this.setNotaTom("Mi");
                else
                    if (notaMusical.getNotaMusical().equals("F"))
                        this.setNotaTom("Fá");
                    else
                        if (notaMusical.getNotaMusical().equals("G"))
                            this.setNotaTom("Sol");
                        else
                            if (notaMusical.getNotaMusical().equals("A"))
                                this.setNotaTom("Lá");
                            else
                                this.setNotaTom("Si");
    }
}
