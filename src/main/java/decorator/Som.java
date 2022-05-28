package decorator;

public class Som extends OrcamentoDecorator {

    public Som(Orcamento orcamento) {
        super(orcamento);
    }

    public float getAcrescimoValorOrcamento() {
        return 25.0f;
    }

    public String getNomeComposicao() {
        return "Aluguel de Som";
    }
}
