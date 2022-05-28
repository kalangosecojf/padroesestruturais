package proxy;

import java.util.Arrays;
import java.util.List;

public class Musica implements IMusica {

    private Integer numeroMucisa;
    private String nomeMusica;
    private String estiloMusica;
    private String tomMusica;
    private String tempoMusica;

    public Musica(int numeroMucisa) {
        this.numeroMucisa = numeroMucisa;
        Musica objeto = BD.getMusica(numeroMucisa);
        this.nomeMusica = objeto.nomeMusica;
        this.estiloMusica = objeto.estiloMusica;
        this.tomMusica = objeto.tomMusica;
        this.tempoMusica = objeto.tempoMusica;
    }

    public Musica(Integer numeroMucisa, String nomeMusica, String estiloMusica, String tomMusica, String tempoMusica) {
        this.numeroMucisa = numeroMucisa;
        this.nomeMusica = nomeMusica;
        this.estiloMusica = estiloMusica;
        this.tomMusica = tomMusica;
        this.tempoMusica = tempoMusica;
    }

    public Integer getNumeroMucisa() {
        return numeroMucisa;
    }

    @Override
    public List<String> obterDadosMusica() {
        return Arrays.asList(this.nomeMusica, this.estiloMusica);
    }

    @Override
    public List<String> obterDadosTecnicoMusica(Musico musico) { return Arrays.asList(this.tomMusica, this.tempoMusica);
    }
}
