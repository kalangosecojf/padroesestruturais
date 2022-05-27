package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SanfoneiroTest {

    @Test
    void deveRetornarCacheSanfoneiroCarreiraSolo() {
        Formacao formacao = new Solo();
        Sanfoneiro sanfoneiro = new Sanfoneiro(5000.0f);
        sanfoneiro.setFormacao(formacao);
        assertEquals(5000.0f, sanfoneiro.calcularCache(), 1.0f);
    }

    @Test
    void deveRetornarCacheSanfoneiroEmDueto() {
        Formacao formacao = new Dueto();
        Sanfoneiro sanfoneiro = new Sanfoneiro(5000.0f);
        sanfoneiro.setFormacao(formacao);
        assertEquals(2500.0f, sanfoneiro.calcularCache(), 2.0f);
    }

    @Test
    void deveRetornarCacheSanfoneiroEmTrio() {
        Formacao formacao = new Trio();
        Sanfoneiro sanfoneiro = new Sanfoneiro(9000.0f);
        sanfoneiro.setFormacao(formacao);
        assertEquals(3000.0f, sanfoneiro.calcularCache(), 3.0f);
    }
}
