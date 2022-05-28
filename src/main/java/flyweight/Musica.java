package flyweight;

public class Musica {

    private String nomeMusica;
    private Estilo estiloMusica;

    public Musica(String nomeMusica, Estilo estiloMusica) {
        this.nomeMusica = nomeMusica;
        this.estiloMusica = estiloMusica;
    }

    public String obterAluno() {
        return "Musica{" +
                "nomeMusica='" + this.nomeMusica + '\'' +
                ", estiloMusica='" + estiloMusica.getNomeEstilo() + '\''+
                '}';
    }
}
