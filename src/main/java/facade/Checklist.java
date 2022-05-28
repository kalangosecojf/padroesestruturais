package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Checklist {

    private List<Evento> problemaNoEvento = new ArrayList<Evento>();

    public void addProblemaNoEvento(Evento evento) {
        this.problemaNoEvento.add(evento);
    }

    public boolean checarProblemaNoEvento(Evento evento) {
        return this.problemaNoEvento.contains(evento);
    }

}

