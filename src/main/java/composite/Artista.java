package composite;

import java.util.ArrayList;
import java.util.List;

public class Artista extends Musica {

    private List<Musica> musicas;

    public Artista(String nome) {
        super(nome);
        this.musicas = new ArrayList<Musica>();
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public String getMusica() {
        String retorno = "";
        retorno = "Artista: " + this.getNome() + "\n";
        for (Musica musica : musicas) {
            retorno += musica.getMusica();
        }
        return retorno;
    }
}
