package proxy;

import java.util.List;

public class MusicaProxy implements IMusica {

    private Musica musica;

    private Integer numeroMucisa;

    public MusicaProxy(Integer numeroMucisa) {
        this.numeroMucisa = numeroMucisa;
    }

    @Override
    public List<String> obterDadosMusica() {
        if (this.musica == null) {
            this.musica = new Musica(this.numeroMucisa);
        }
        return this.musica.obterDadosMusica();
    }

    @Override
    public List<String> obterDadosTecnicoMusica(Musico musico) {
        if (!musico.isDj()) {
            throw new IllegalArgumentException("Musico nao autorizado");
        }
        if (this.musica == null) {
            this.musica = new Musica(this.numeroMucisa);
        }
        return this.musica.obterDadosTecnicoMusica(musico);
    }
}
