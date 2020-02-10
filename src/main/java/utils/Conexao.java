package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conexao {
	
	public String url;
	public static WebDriver driver;
	
	
	/**
	 * Método para abrir o navegador e acessar a página do Mantis
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
	 * Método para fechar o navegador
	 * @author filip
	 * @throws InterruptedException
	 */
	public void encerrar() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
