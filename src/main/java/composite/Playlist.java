package composite;

public class Playlist {

    private Musica lista;

    public void setLista(Musica lista) {
        this.lista = lista;
    }

    public String getLista() {
        if (this.lista == null) {
            throw new NullPointerException("Playlist sem musica");
        }
        return this.lista.getMusica();
    }
}
