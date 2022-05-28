package composite;

public class Album extends Musica {

    private int anoGravacao;

    public Album(String nome, int anoGravacao) {
        super(nome);
        this.anoGravacao = anoGravacao;
    }
    public int getAnoGravacao() {
        return anoGravacao;
    }

    public void setAnoGravacao(int anoGravacao) {
        this.anoGravacao = anoGravacao;
    }

    public String getMusica() {
        return "Album: " + this.getNome() + " - Ano Gravacao: " + this.anoGravacao + "\n";
    }

}
