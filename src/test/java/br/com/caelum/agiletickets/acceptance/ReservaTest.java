package br.com.caelum.agiletickets.acceptance;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.agiletickets.acceptance.page.ReservaPage;

public class ReservaTest {

	private static WebDriver browser;
	private ReservaPage reservaPage;
	
	@BeforeClass
	public static void abreBrowser(){
		browser = new FirefoxDriver();
	}
	
	@Before
	public void setUp() throws Exception {
		reservaPage = new ReservaPage(browser);
	}
	
	@Test
	public void teste(){
		reservaPage.abreListagem();
		reservaPage.procuraPorLinhasCom100Ingressos();
	}
	
}
