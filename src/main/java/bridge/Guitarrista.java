package bridge;

public class Guitarrista extends Banda {

    public Guitarrista(float valorCache) {
        super(valorCache);
    }

    public float calcularCache() {
        return this.valorCache / this.formacao.divisaoCache();
    }
}
