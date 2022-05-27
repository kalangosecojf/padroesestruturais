package bridge;

public class Sanfoneiro extends Banda {

    public Sanfoneiro(float valorCache) {
        super(valorCache);
    }

    public float calcularCache() {
        return this.valorCache / this.formacao.divisaoCache() ;
    }
}
