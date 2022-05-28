package facade;

public class EventoFacade {

    public static boolean acompanharChecklistDoEvento(Evento evento) {
        if (Som.getInstancia().checarProblemaNoEvento(evento)) {
            return false;
        }
        if (Discotecagem.getInstancia().checarProblemaNoEvento(evento)) {
            return false;
        }
        if (Iluminacao.getInstancia().checarProblemaNoEvento(evento)) {
            return false;
        }
        return true;
    }
}
