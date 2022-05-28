package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcamentoTest {

    @Test
    void deveRetornarOrcamentoDiscotecagem() {
        Orcamento orcamento = new OrcamentoDiscotecagem(800.0f);

        assertEquals(800.0f, orcamento.getValorOrcamento());
    }

    @Test
    void deveRetornarOrcamentoDiscotecagemComSom() {
        Orcamento orcamento = new Som(new OrcamentoDiscotecagem(800.0f));

        assertEquals(1000.0f, orcamento.getValorOrcamento());
    }

    @Test
    void deveRetornarOrcamentoDiscotecagemComFotos() {
        Orcamento orcamento = new Fotos(new OrcamentoDiscotecagem(800.0f));

        assertEquals(920.0f, orcamento.getValorOrcamento());
    }

    @Test
    void deveRetornarOrcamentoDiscotecagemComIluminacao() {
        Orcamento orcamento = new Iluminacao(new OrcamentoDiscotecagem(800.0f));

        assertEquals(896, orcamento.getValorOrcamento());
    }
    @Test
    void deveRetornarOrcamentoDiscotecagemComIluminacaoMaisSom() {
        Orcamento orcamento = new Iluminacao(new Som(new OrcamentoDiscotecagem(800.0f)));

        assertEquals(1120, orcamento.getValorOrcamento());
    }
    @Test
    void deveRetornarOrcamentoDiscotecagemComIluminacaoMaisFotos() {
        Orcamento orcamento = new Iluminacao(new Fotos(new OrcamentoDiscotecagem(800.0f)));

        assertEquals(1030, orcamento.getValorOrcamento());
    }
    @Test
    void deveRetornarOrcamentoDiscotecagemComFotoMaisSom() {
        Orcamento orcamento = new Fotos(new Som(new OrcamentoDiscotecagem(800.0f)));

        assertEquals(1150, orcamento.getValorOrcamento());
    }
    @Test
    void deveRetornarOrcamentoDiscotecagemComFotoMaisSomMaisIluminacao() {
        Orcamento orcamento = new Fotos(new Som(new Iluminacao(new OrcamentoDiscotecagem(800.0f))));

        assertEquals(1288, orcamento.getValorOrcamento());
    }


    @Test
    void deveRetornarOrcamentoDiscotecagemComSomMaisIluminacaoMaisFotos() {
        Orcamento orcamento = new Som(new Iluminacao(new Fotos(new OrcamentoDiscotecagem(800.0f))));

        assertEquals(1288, orcamento.getValorOrcamento());
    }

    @Test
    void deveRetornarComposicao() {
        Orcamento orcamento= new OrcamentoDiscotecagem();

        assertEquals("Discotecagem", orcamento.getComposicao());
    }

    @Test
    void deveRetornarComposicaoComSom() {
        Orcamento orcamento= new Som(new OrcamentoDiscotecagem());

        assertEquals("Discotecagem/Aluguel de Som", orcamento.getComposicao());
    }

    @Test
    void deveRetornarComposicaoComFotos() {
        Orcamento orcamento= new Fotos(new OrcamentoDiscotecagem());

        assertEquals("Discotecagem/Mais Fotografo", orcamento.getComposicao());
    }

    @Test
    void deveRetornarComposicaoComIluminacao() {
        Orcamento orcamento= new Iluminacao(new OrcamentoDiscotecagem());

        assertEquals("Discotecagem/Aluguel de Iluminacao", orcamento.getComposicao());
    }

    @Test
    void deveRetornarComposicaoComIluminacaoMaisSom() {
        Orcamento orcamento= new Iluminacao(new Som(new OrcamentoDiscotecagem()));

        assertEquals("Discotecagem/Aluguel de Som/Aluguel de Iluminacao", orcamento.getComposicao());
    }

    @Test
    void deveRetornarComposicaoComIluminacaoMaisFotos() {
        Orcamento orcamento= new Iluminacao(new Fotos(new OrcamentoDiscotecagem()));

        assertEquals("Discotecagem/Mais Fotografo/Aluguel de Iluminacao", orcamento.getComposicao());
    }

    @Test
    void deveRetornarComposicaoComIluminacaoMaisSomMaisFotos() {
        Orcamento orcamento= new Fotos(new Iluminacao(new Som(new OrcamentoDiscotecagem())));

        assertEquals("Discotecagem/Aluguel de Som/Aluguel de Iluminacao/Mais Fotografo", orcamento.getComposicao());
    }

}