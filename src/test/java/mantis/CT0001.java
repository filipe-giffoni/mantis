package mantis;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import func.Home;
import func.Login;
import func.ReportIssue;
import func.ViewIssues;
import utils.Conexao;

public class CT0001 extends Conexao {
	
	Login login =  new Login();
	Home home = new Home();
	ReportIssue report = new ReportIssue();
	ViewIssues view = new ViewIssues();
	
	LocalDateTime agora = LocalDateTime.now();
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	int cont = 1;
	
	String username = "filipe.giffoni";
	String password = "fgg2020";
	String project = "124";
	String category = "33";
	String reproducibility = "10";
	String severity = "60";
	String priority = "40";
	String profile = "74";
	String summary = "Summary Here " + agora.format(formato);
	String description = "Description Here";
	String stepsReproduce = "Step 1:\nStep 2:\nStep 3:\n\nExpected Result:\nObtained Result:";
	String additionalInfo = "Some additional information";
	String reporter = "filipe.giffoni";
	String type = "Updated";
	String order = "Descending";

	

	@Before
	public void setUp() {
		
		iniciar();
		
	}

	@After
	public void tearDown() throws InterruptedException {
		
		encerrar();
		
	}

	@Test
	public void test() throws InterruptedException {
		
		try {
			
			System.out.println("\n\nCT0001 - Validar criação de report\n\n");
			
			// Login
			System.out.println("Step " + cont++ + " - Digitar Username");
			login.digitaUsername("name", "username", username);
			
			System.out.println("Step " + cont++ + " - Digitar Password");
			login.digitaPassword("name", "password", password);
			
			System.out.println("Step " + cont++ + " - Desmarcar Remember Login (caso esteja marcado)");
			login.desmarcaRememberLogin("name", "perm_login");
			
			System.out.println("Step " + cont++ + " - Desmarcar Secure Session (caso esteja marcado)");
			login.desmarcaSecureSession("name", "secure_session");
			
			System.out.println("Step " + cont++ + " - Clicar em Login");
			login.clicaLogin("className", "button");
			
			
			// Home
			System.out.println("Step " + cont++ + " - Clicar em Report Issue");
			home.clicaReportIssue("xpath", "//a[text() = 'Report Issue']");
						
			
			// Report Issue
			System.out.println("Step " + cont++ + " - Selecionar Project");
			report.selecionaProject("name", "project_id", 1, "Value", project);
			
			System.out.println("Step " + cont++ + " - Desmarcar Make Default (caso esteja marcado)");
			report.desmarcaMakeDefault("name", "make_default");
			
			System.out.println("Step " + cont++ + " - Clicar em Select Project");
			report.clicaSelectProject("className", "button");
			
			System.out.println("Step " + cont++ + " - Selecionar Category");
			report.selecionaCategory("name", "category_id", "Value", category);
			
			System.out.println("Step " + cont++ + " - Selecionar Reproducibility");
			report.selecionaReproducibility("name", "reproducibility", "Value", reproducibility);
			
			System.out.println("Step " + cont++ + " - Selecionar Severity");
			report.selecionaSeverity("name", "severity", "Value", severity);
			
			System.out.println("Step " + cont++ + " - Selecionar Priority");
			report.selecionaPriority("name", "priority", "Value", priority);
			
			System.out.println("Step " + cont++ + " - Selecionar Profile");
			report.selecionaProfile("name", "profile_id", "Value", profile);
			
			System.out.println("Step " + cont++ + " - Digitar Summary");
			report.digitaSummary("name", "summary", summary);
			
			System.out.println("Step " + cont++ + " - Digitar Description");
			report.digitaDescription("name", "description", "Description Here");
			
			System.out.println("Step " + cont++ + " - Digitar Steps to Reproduce");
			report.digitaStepsReproduce("name", "steps_to_reproduce", stepsReproduce);
			
			System.out.println("Step " + cont++ + " - Digitar Additional Information");
			report.digitaAdditionalInfo("name", "additional_info", additionalInfo);
			
			System.out.println("Step " + cont++ + " - Marcar Public");
			report.marcaPublic("xpath", "//input[@tabindex = '14']");
			
			System.out.println("Step " + cont++ + " - Clicar em Submit Report");
			report.clicaSubmitReport("className", "button");
			
			
			// View Issues
			System.out.println("Step " + cont++ + " - Clicar em Reporter");
			view.clicaReporter("id", "reporter_id_filter");
			
			System.out.println("Step " + cont++ + " - Selecionar Reporter");
			view.selecionaReporter("name", "reporter_id[]", "VisibleText", reporter);
			
			System.out.println("Step " + cont++ + " - Clicar em Sort By");
			view.clicaSortBy("id", "show_sort_filter");
			
			System.out.println("Step " + cont++ + " - Selecionar Type");
			view.selecionaType("name", "sort_0", "VisibleText", type);
			
			System.out.println("Step " + cont++ + " - Selecionar Order");
			view.selecionaOrder("name", "dir_0", "VisibleText", order);
			
			System.out.println("Step " + cont++ + " - Clicar em Apply Filter");
			view.clicaApplyFilter("xpath", "//input[@value = 'Apply Filter']", 0);
			
			
			assertEquals(summary, view.capturaTextoSummary("xpath", "//td[@class= 'left']", 0));
		
		}
		catch(AssertionError e) {
			
			System.out.println("\n\nRESULTADO: FAIL\n\n");
			e.printStackTrace();
			throw e;
			
		}
		
		System.out.println("\n\nRESULTADO: PASS\n\n");

	}

}
