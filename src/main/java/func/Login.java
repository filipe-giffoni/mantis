package func;

import org.openqa.selenium.WebElement;

import tela.Tela;

public class Login {
	
	Tela tela = new Tela();
	
	WebElement elemento;
	
	
	/**
	 * Método para digitar o Username
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitaUsername(String estrategia, String valor, String texto) {
		
		tela.digitarTexto(estrategia, valor, texto);
		
	}
	
	/**
	 * Método para digitar o Username
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitaUsername(String estrategia, String valor, String texto, int posicao) {
		
		tela.digitarTexto(estrategia, valor, texto, posicao);
		
	}
	
	/**
	 * Método para digitar o Password
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitaPassword(String estrategia, String valor, String texto) {
		
		tela.digitarTexto(estrategia, valor, texto);
		
	}
	
	/**
	 * Método para digitar o Password
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitaPassword(String estrategia, String valor, String texto, int posicao) {
		
		tela.digitarTexto(estrategia, valor, texto, posicao);
		
	}
	
	/**
	 * Método para desmarcar a caixa Remember Login (caso esteja marcada)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void desmarcaRememberLogin(String estrategia, String valor) {
		
		elemento = tela.encontrarCaixaChecagem(estrategia, valor);
		
		if(elemento.isSelected())
			tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para desmarcar a caixa Remember Login (caso esteja marcada)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void desmarcaRememberLogin(String estrategia, String valor, int posicao) {
		
		elemento = tela.encontrarCaixaChecagem(estrategia, valor);
		
		if(elemento.isSelected())
			tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para desmarcar a caixa Secure Session (caso esteja marcada)
	 * @author filip 
	 * @param estrategia
	 * @param valor
	 */
	public void desmarcaSecureSession(String estrategia, String valor) {
		
		elemento = tela.encontrarCaixaChecagem(estrategia, valor);
		
		if(elemento.isSelected())
			tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para desmarcar a caixa Secure Session (caso esteja marcada)
	 * @author filip 
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void desmarcaSecureSession(String estrategia, String valor, int posicao) {
		
		elemento = tela.encontrarCaixaChecagem(estrategia, valor);
		
		if(elemento.isSelected())
			tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para clicar no botão Login
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicaLogin(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para clicar no botão Login
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void clicaLogin(String estrategia, String valor, String texto, int posicao) {
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}

}
