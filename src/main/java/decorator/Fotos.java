package decorator;

public class Fotos extends OrcamentoDecorator {

    public Fotos(Orcamento orcamento) {
        super(orcamento);
    }

    public float getAcrescimoValorOrcamento() {
        return 15.0f;
    }

    public String getNomeComposicao() {
        return "Mais Fotografo";
    }

}
