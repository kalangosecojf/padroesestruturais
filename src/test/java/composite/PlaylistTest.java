package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {
    @Test
    void deveRetornarListaMusica() {
        Artista artista1 = new Artista("Sivulca");

        Artista artista2 = new Artista("Dominguinhos");
        Album album21 = new Album("Domingos", 1987);
        artista2.addMusica(album21);

        Artista artista3 = new Artista("Luiz Gonzaga");
        Album album31 = new Album("Danado de Bom", 1981);
        Album album32 = new Album("Asa Branca", 1960);
        artista3.addMusica(album31);
        artista3.addMusica(album32);

        Artista lista = new Artista("Genival Lacerda");
        lista.addMusica(artista1);
        lista.addMusica(artista2);
        lista.addMusica(artista3);

        Playlist playlist = new Playlist();
        playlist.setLista(lista);

        assertEquals("Artista: Genival Lacerda\n" +
                "Artista: Sivulca\n" +
                "Artista: Dominguinhos\n" +
                "Album: Domingos - Ano Gravacao: 1987\n" +
                "Artista: Luiz Gonzaga\n" +
                "Album: Danado de Bom - Ano Gravacao: 1981\n" +
                "Album: Asa Branca - Ano Gravacao: 1960\n", playlist.getLista());
    }

    @Test
    void deveRetornarExecacaoPlaylistSemMusica() {
        try {
            Playlist playlist = new Playlist();
            playlist.getLista();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Playlist sem musica", e.getMessage());
        }
    }
}