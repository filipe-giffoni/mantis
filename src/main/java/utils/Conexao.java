package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conexao {
	
	public String url;
	public static WebDriver driver;
	
	
	/**
	 * M�todo para abrir o navegador e acessar a p�gina do Mantis
	 * @author filip
	 */
	public void iniciar() {
		
		url = "https://mantis-prova.base2.com.br/login_page.php";
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	/**
	 * M�todo para fechar o navegador
	 * @author filip
	 * @throws InterruptedException
	 */
	public void encerrar() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
