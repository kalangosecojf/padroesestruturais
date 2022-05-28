package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Musica> musicas = new ArrayList<>();

    public void cadastrar(String nomeMusica, String estiloMusica) {
        Estilo estilo = EstiloFactory.getNomeEstilo(estiloMusica);
        Musica musica = new Musica(nomeMusica, estilo);
        musicas.add(musica);
    }

    public List<String> retornarMusicas() {
        List<String> retorno = new ArrayList<String>();
        for (Musica musica : this.musicas) {
            retorno.add(musica.obterAluno());
        }
        return retorno;
    }


}
