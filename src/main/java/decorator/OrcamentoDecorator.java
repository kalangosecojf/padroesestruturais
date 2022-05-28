package decorator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class OrcamentoDecorator implements Orcamento {

    private Orcamento orcamento;
    public String composicao;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public OrcamentoDecorator(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public abstract float getAcrescimoValorOrcamento();

    public float getValorOrcamento() {
        float valor = this.orcamento.getValorOrcamento() * (1 + (this.getAcrescimoValorOrcamento() / 100));
        return Math.round(valor);
    }

    public abstract String getNomeComposicao();

    public String getComposicao() {
        return this.orcamento.getComposicao() + "/" + this.getNomeComposicao();
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }
}
