package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
