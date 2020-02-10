package func;

import tela.Tela;

public class ViewIssues {
	
	Tela tela = new Tela();
	
	
	/**
	 * M�todo para clicar no link Reporter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @throws InterruptedException
	 */
	public void clicaReporter(String estrategia, String valor) throws InterruptedException {
		
		Thread.sleep(5000);
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * M�todo para clicar no link Reporter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 * @throws InterruptedException
	 */
	public void clicaReporter(String estrategia, String valor, String texto, int posicao) throws InterruptedException {
		
		Thread.sleep(5000);
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * M�todo para selecionar Reporter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 * @throws InterruptedException
	 */
	public void selecionaReporter(String estrategia, String valor, String estrategiaSelect, String textoSelect) throws InterruptedException {
		
		Thread.sleep(500);
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * M�todo para selecionar Reporter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 * @throws InterruptedException
	 */
	public void selecionaReporter(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) throws InterruptedException {
		
		Thread.sleep(500);
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * M�todo para selecionar Reporter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaReporter(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * M�todo para selecionar Reporter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaReporter(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * M�todo para clicar no link Sort By
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicaSortBy(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * M�todo para clicar no link Sort By
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void clicaSortBy(String estrategia, String valor, String texto, int posicao) {
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * M�todo para selecionar Type (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 * @throws InterruptedException
	 */
	public void selecionaType(String estrategia, String valor, String estrategiaSelect, String textoSelect) throws InterruptedException {
		
		Thread.sleep(500);
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * M�todo para selecionar Type (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 * @throws InterruptedException
	 */
	public void selecionaType(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) throws InterruptedException {
		
		Thread.sleep(500);
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * M�todo para selecionar Type (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaType(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * M�todo para selecionar Type (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaType(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * M�todo para selecionar Order (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaOrder(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * M�todo para selecionar Order (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaOrder(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * M�todo para selecionar Order (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaOrder(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * M�todo para selecionar Order (Sort By)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaOrder(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * M�todo para clicar no bot�o Apply Filter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicaApplyFilter(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * M�todo para clicar no bot�o Apply Filter
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void clicaApplyFilter(String estrategia, String valor, int posicao) {
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * M�todo para capturar texto na coluna Summary (primeira linha)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @return
	 */
	public String capturaTextoSummary(String estrategia, String valor) {
		
		return tela.capturarTexto(estrategia, valor);
		
	}
	
	/**
	 * M�todo para capturar texto na coluna Summary (primeira linha)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @return
	 */
	public String capturaTextoSummary(String estrategia, String valor, int posicao) {
		
		return tela.capturarTexto(estrategia, valor, posicao);
		
	}

}
