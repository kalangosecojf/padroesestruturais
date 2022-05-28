package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CantorTest {

    @Test
    void deveRetornarCacheCantorCarreiraSolo() {
        Formacao formacao = new Solo();
        Cantor cantor = new Cantor(2000.0f);
        cantor.setFormacao(formacao);
        assertEquals(2000.0f, cantor.calcularCache(), 1.0f);
    }

    @Test
    void deveRetornarCacheCantorEmDueto() {
        Formacao formacao = new Dueto();
        Cantor cantor = new Cantor(2000.0f);
        cantor.setFormacao(formacao);
        assertEquals(1000.0f, cantor.calcularCache(), 2.0f);
    }

    @Test
    void deveRetornarCacheCantorEmTrio() {
        Formacao formacao = new Trio();
        Cantor cantor = new Cantor(3000.0f);
        cantor.setFormacao(formacao);
        assertEquals(1000.0f, cantor.calcularCache(), 3.0f);
    }

}