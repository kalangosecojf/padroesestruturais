package proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Musica> musicas = new HashMap<>();

    public static Musica getMusica(Integer numeroMucisa) {
        return musicas.get(numeroMucisa);
    }

    public static void addMusica(Musica musica) {
        musicas.put(musica.getNumeroMucisa(), musica);
    }
}
