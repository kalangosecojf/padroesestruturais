package padroesestruturais.flyweight;

import flyweight.EstiloFactory;
import flyweight.Playlist;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @Test
    void deveRetornarMusicas() {
        Playlist playlist = new Playlist();
        playlist.cadastrar("Asa Branca", "Forró");
        playlist.cadastrar("Danado de Bom", "Forró");
        playlist.cadastrar("Sala de Reboco", "Xote");
        playlist.cadastrar("Festa do Interior", "Forró");
        playlist.cadastrar("Coco de Roda", "Coco");

        List<String> retorno = Arrays.asList(
                "Musica{nomeMusica='Asa Branca', estiloMusica='Forró'}",
                "Musica{nomeMusica='Danado de Bom', estiloMusica='Forró'}",
                "Musica{nomeMusica='Sala de Reboco', estiloMusica='Xote'}",
                "Musica{nomeMusica='Festa do Interior', estiloMusica='Forró'}",
                "Musica{nomeMusica='Coco de Roda', estiloMusica='Coco'}");

        assertEquals(retorno, playlist.retornarMusicas());
    }

    @Test
    void deveRetornarTotalCidades() {
        Playlist playlist = new Playlist();
        playlist.cadastrar("Asa Branca", "Forró");
        playlist.cadastrar("Danado de Bom", "Forró");
        playlist.cadastrar("Sala de Reboco", "Xote");
        playlist.cadastrar("Festa do Interior", "Forró");
        playlist.cadastrar("Coco de Roda", "Coco");

        assertEquals(3, EstiloFactory.getTotalEstilos());
    }

}