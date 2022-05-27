package bridge;

public class Cantor extends Banda {

    public Cantor(float valorCache) {
        super(valorCache);
    }

    public float calcularCache() {
        return this.valorCache / this.formacao.divisaoCache();
    }

}
