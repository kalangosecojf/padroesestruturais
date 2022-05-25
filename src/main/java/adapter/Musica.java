package adapter;

public class Musica {

    INotaMusical notaMusical;
    NotaMusicalAdapter persistencia;

    public Musica() {
        notaMusical  = new NotaMusicalLetra();
        persistencia = new NotaMusicalAdapter(notaMusical);
    }

    public void setNotaMusical(String letra) {
        notaMusical.setNotaMusical(letra);
        persistencia.salvarNotaMusical();
    }

    public String getNotaMusical() {
        return persistencia.recuperarNotaMusical();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public String getNotaTom() {
        return persistencia.getNotaTom();
    }

}
