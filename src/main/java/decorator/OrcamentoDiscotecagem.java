package decorator;

public class OrcamentoDiscotecagem implements Orcamento {

    public float valorOrcamento;

    public OrcamentoDiscotecagem() {
    }

    public OrcamentoDiscotecagem(float valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public float getValorOrcamento() {
        return valorOrcamento;
    }

    public String getComposicao() {
        return "Discotecagem";
    }

}
