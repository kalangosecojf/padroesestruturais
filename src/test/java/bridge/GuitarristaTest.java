package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuitarristaTest {

    @Test
    void deveRetornarCacheGuitarristaCarreiraSolo() {
        Formacao formacao = new Solo();
        Guitarrista guitarrista = new Guitarrista(1000.0f);
        guitarrista.setFormacao(formacao);
        assertEquals(1000.0f, guitarrista.calcularCache(), 1.0f);
    }

    @Test
    void deveRetornarCacheGuitarristaEmDueto() {
        Formacao formacao = new Dueto();
        Guitarrista guitarrista = new Guitarrista(2000.0f);
        guitarrista.setFormacao(formacao);
        assertEquals(1000.0f, guitarrista.calcularCache(), 2.0f);
    }

    @Test
    void deveRetornarCacheGuitarristaEmTrio() {
        Formacao formacao = new Trio();
        Guitarrista guitarrista = new Guitarrista(6000.0f);
        guitarrista.setFormacao(formacao);
        assertEquals(2000.0f, guitarrista.calcularCache(), 3.0f);
    }
}