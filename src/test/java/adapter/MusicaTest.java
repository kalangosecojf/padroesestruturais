package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicaTest {

    @Test
    void deveRetornarNotaMusicalLetra() {
        Musica musica = new Musica();
        musica.setNotaMusical("C");

        assertEquals("C", musica.getNotaMusical());
    }

    @Test
    void deveRetornarNotaMusicalTom() {
        Musica musica = new Musica();
        musica.setNotaMusical("D");

        assertEquals("Ré", musica.getNotaTom());
    }

}