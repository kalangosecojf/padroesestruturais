package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void deveRetornarAcompanhamentoDiscotecagem() {
        Evento evento = new Evento();
        Discotecagem.getInstancia().addProblemaNoEvento(evento);

        assertEquals(false, evento.acompanhar());
    }

    @Test
    void deveRetornarAcompanhamentoSom() {
        Evento evento = new Evento();
        Som.getInstancia().addProblemaNoEvento(evento);

        assertEquals(false, evento.acompanhar());
    }

    @Test
    void deveRetornarAcompanhamentoIluminacao() {
        Evento evento = new Evento();
        Iluminacao.getInstancia().addProblemaNoEvento(evento);

        assertEquals(false, evento.acompanhar());
    }

    @Test
    void deveRetornarEventoOK() {
        Evento evento = new Evento();

        assertEquals(true, evento.acompanhar());
    }
}