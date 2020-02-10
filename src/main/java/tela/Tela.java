package tela;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Conexao;
import utils.Elemento;
import utils.OpcaoCaixa;

public class Tela extends Conexao {
	
	Elemento elem = new Elemento();
	OpcaoCaixa opcao = new OpcaoCaixa();
	
	WebElement elemento;
	Select selecao;
	
	
	/**
	 * M�todo para digitar texto em uma caixa ou �rea de texto
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitarTexto(String estrategia, String valor, String texto) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		elemento.sendKeys(texto);
		
	}
	
	/**
	 * M�todo para digitar texto em uma caixa ou �rea de texto
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitarTexto(String estrategia, String valor, String texto, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		elemento.sendKeys(texto);
		
	}
	
	/**
	 * M�todo para clicar em um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicarElemento(String estrategia, String valor) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		elemento.click();
		
	}
	
	/**
	 * M�todo para clicar em um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void clicarElemento(String estrategia, String valor, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		elemento.click();
		
	}
	
	/**
	 * M�todo para encontrar elemento do tipo caixa de checagem (checkbox)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @return
	 */
	public WebElement encontrarCaixaChecagem(String estrategia, String valor) {
		
		return elem.encontrarElemento(estrategia, valor);
		
	}
	
	/**
	 * M�todo para encontrar elemento do tipo caixa de checagem (checkbox)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @return
	 */
	public WebElement encontrarCaixaChecagem(String estrategia, String valor, int posicao) {
		
		return elem.encontrarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * M�todo para selecionar op��o em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor));
		opcao.selecionarOpcaoCaixa(selecao, estrategiaSelect, textoSelect);
		
	}
	
	/**
	 * M�todo para selecionar op��o em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor, posicao));
		opcao.selecionarOpcaoCaixa(selecao, estrategiaSelect, textoSelect);
		
	}
	
	/**
	 * M�todo para selecionar op��o em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, int index) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor));
		opcao.selecionarOpcaoCaixa(selecao, index);
		
	}
	
	/**
	 * M�todo para selecionar op��o em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, int posicao, int index) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor, posicao));
		opcao.selecionarOpcaoCaixa(selecao, index);
		
	}
	
	/**
	 * M�todo para encontrar elemento bot�o de op��o (radio box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void encontrarBotaoOpcao(String estrategia, String valor) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		elemento.click();
		
	}
	
	/**
	 * M�todo para encontrar elemento bot�o de op��o (radio box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void encontrarBotaoOpcao(String estrategia, String valor, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		elemento.click();
		
	}
	
	/**
	 * M�todo para capturar texto de um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @return
	 */
	public String capturarTexto(String estrategia, String valor) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		
		return elemento.getText();
		
	}
	
	/**
	 * M�todo para capturar texto de um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @return
	 */
	public String capturarTexto(String estrategia, String valor, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		
		return elemento.getText();
		
	}

}
