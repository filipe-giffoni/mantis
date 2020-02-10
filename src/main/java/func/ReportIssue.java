package func;

import org.openqa.selenium.WebElement;

import tela.Tela;

public class ReportIssue {
	
	Tela tela = new Tela();
	
	WebElement elemento;
	
	
	/**
	 * Método para selecionar Project
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaProject(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * Método para selecionar Project
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaProject(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * Método para selecionar Project
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaProject(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * Método para selecionar Project
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaProject(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * Método para desmarcar a caixa Make Default (caso esteja marcada)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void desmarcaMakeDefault(String estrategia, String valor) {
		
		elemento = tela.encontrarCaixaChecagem(estrategia, valor);
		
		if(elemento.isSelected())
			tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para desmarcar a caixa Make Default (caso esteja marcada)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void desmarcaMakeDefault(String estrategia, String valor, int posicao) {
		
		elemento = tela.encontrarCaixaChecagem(estrategia, valor, posicao);
		
		if(elemento.isSelected())
			tela.clicarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * Método para clicar no botão Select Project
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicaSelectProject(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para clicar no botão Select Project
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void clicaSelectProject(String estrategia, String valor, int posicao) {
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * Método para selecionar Category
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaCategory(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * Método para selecionar Category
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaCategory(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * Método para selecionar Category
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaCategory(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * Método para selecionar Category
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaCategory(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * Método para selecionar Reproducibility
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaReproducibility(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * Método para selecionar Reproducibility
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaReproducibility(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * Método para selecionar Reproducibility
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaReproducibility(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * Método para selecionar Reproducibility
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaReproducibility(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * Método para selecionar Severity
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaSeverity(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * Método para selecionar Severity
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaSeverity(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * Método para selecionar Severity
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaSeverity(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * Método para selecionar Severity
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaSeverity(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * Método para selecionar Priority
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaPriority(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * Método para selecionar Priority
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaPriority(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * Método para selecionar Priority
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaPriority(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * Método para selecionar Priority
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaPriority(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * Método para selecionar Profile
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaProfile(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, estrategiaSelect, textoSelect);		
		
	}
	
	/**
	 * Método para selecionar Profile
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionaProfile(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, estrategiaSelect, textoSelect);
				
	}
	
	/**
	 * Método para selecionar Profile
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionaProfile(String estrategia, String valor, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, index);		
		
	}
	
	/**
	 * Método para selecionar Profile
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionaProfile(String estrategia, String valor, int posicao, int index) {
		
		tela.selecionarOpcaoCaixa(estrategia, valor, posicao, index);
				
	}
	
	/**
	 * Método para digitar Summary
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitaSummary(String estrategia, String valor, String texto) {
		
		tela.digitarTexto(estrategia, valor, texto);
		
	}
	
	/**
	 * Método para digitar Summary
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitaSummary(String estrategia, String valor, String texto, int posicao) {
		
		tela.digitarTexto(estrategia, valor, texto, posicao);
		
	}
	
	/**
	 * Método para digitar Description
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitaDescription(String estrategia, String valor, String texto) {
		
		tela.digitarTexto(estrategia, valor, texto);
		
	}
	
	/**
	 * Método para digitar Description
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitaDescription(String estrategia, String valor, String texto, int posicao) {
		
		tela.digitarTexto(estrategia, valor, texto, posicao);
		
	}
	
	/**
	 * Método para digitar Steps to Reproduce
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitaStepsReproduce(String estrategia, String valor, String texto) {
		
		tela.digitarTexto(estrategia, valor, texto);
		
	}
	
	/**
	 * Método para digitar Steps to Reproduce
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitaStepsReproduce(String estrategia, String valor, String texto, int posicao) {
		
		tela.digitarTexto(estrategia, valor, texto, posicao);
		
	}
	
	/**
	 * Método para digitar Additional Information
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitaAdditionalInfo(String estrategia, String valor, String texto) {
		
		tela.digitarTexto(estrategia, valor, texto);
		
	}
	
	/**
	 * Método para digitar Additional Information
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitaAdditionalInfo(String estrategia, String valor, String texto, int posicao) {
		
		tela.digitarTexto(estrategia, valor, texto, posicao);
		
	}
	
	/**
	 * Método para marcar o botão Public
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void marcaPublic(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para marcar o botão Public
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void marcaPublic(String estrategia, String valor, int posicao) {
		
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}
	
	/**
	 * Método para clicar no botão Submit Report
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicaSubmitReport(String estrategia, String valor) {
		
		tela.clicarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para clicar no botão Submit Report
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void clicaSubmitReport(String estrategia, String valor, String texto, int posicao) {
		
		tela.clicarElemento(estrategia, valor, posicao);
		
	}

}
