package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EventoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addMusica(new Musica(1, "Asa Branca", "Forro", "Do", "3:47"));
        BD.addMusica(new Musica(2, "Sala de Reboco", "Xote", "Fa", "3:15"));
    }

    @Test
    void deveRetornarDadosDaMusica() {
        MusicaProxy musica = new MusicaProxy(1);

        assertEquals(Arrays.asList("Asa Branca", "Forro"), musica.obterDadosMusica());
    }

    @Test
    void deveRetonarDadosTecnicoMusica() {
        Musico musico = new Musico("Kalango", true);
        MusicaProxy musica = new MusicaProxy(2);

        assertEquals(Arrays.asList("Fa","3:15"), musica.obterDadosTecnicoMusica(musico));
    }


    @Test
    void deveRetonarExcecaoMusicoNaoAutorizadoConsultarDadosTecnicoMusica() {
        try {
            Musico musico = new Musico("Danilo", false);
            MusicaProxy musica = new MusicaProxy(2);

            musica.obterDadosTecnicoMusica(musico);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Musico nao autorizado", e.getMessage());
        }
    }

}