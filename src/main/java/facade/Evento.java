package facade;

public class Evento {

    public boolean acompanhar() {
        return EventoFacade.acompanharChecklistDoEvento(this);
    }
}
