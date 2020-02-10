package func;

import tela.Tela;

public class Home {
	
	Tela tela = new Tela();
	
	
	/**
	 * M�todo para clicar no link Report Issue
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicaReportIssue(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * M�todo para clicar no link Report Issue
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void clicaReportIssue(String estrategia, String valor, String texto, int posicao) {
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}

}
