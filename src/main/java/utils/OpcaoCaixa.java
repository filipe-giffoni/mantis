package utils;

import org.openqa.selenium.support.ui.Select;

public class OpcaoCaixa {
	
	
	/**
	 * M�todo para selecionar uma das op��es de uma caixa de listagem ou de lista por VisibleText ou Value
	 * @author filip
	 * @param selecao
	 * @param estrategia
	 * @param texto
	 */
	public void selecionarOpcaoCaixa(Select selecao, String estrategia, String texto) {
		
		switch(estrategia) {
		
			case "VisibleText":	selecao.selectByVisibleText(texto);
								break;
		
			case "Value":		selecao.selectByValue(texto);
								break;
				
		}	
		
	}
	
	/**
	 * M�todo para selecionar uma das op��es de uma caixa de listagem ou de lista por Index
	 * @author filip
	 * @param selecao
	 * @param index
	 */
	public void selecionarOpcaoCaixa(Select selecao, int index) {
		
		selecao.selectByIndex(index);
		
	}

}
