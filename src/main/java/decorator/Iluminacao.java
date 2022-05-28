package decorator;

public class Iluminacao extends OrcamentoDecorator {

    public Iluminacao(Orcamento orcamento) {
        super(orcamento);
    }

    public float getAcrescimoValorOrcamento() {
        return 12.0f;
    }

    public String getNomeComposicao() {
        return "Aluguel de Iluminacao";
    }
}
