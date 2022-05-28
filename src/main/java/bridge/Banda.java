package bridge;

public abstract class Banda {

    protected Formacao formacao;

    protected float valorCache;

    public Banda(float valorCache) {
        this.valorCache = valorCache;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public void setValorCache(float valorCache) {
        this.valorCache = valorCache;
    }

    public abstract float calcularCache();

}
