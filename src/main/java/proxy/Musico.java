package proxy;

public class Musico {
    private String nome;
    private boolean dj;

    public Musico(String nome, boolean dj) {
        this.nome = nome;
        this.dj = dj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDj() {
        return dj;
    }

    public void setDj(boolean dj) {
        this.dj = dj;
    }
}
