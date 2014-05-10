package br.com.caelum.agiletickets.acceptance.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservaPage {

	private static final String BASE_URL = "http://localhost:8080";
	private final WebDriver driver;
	
	public ReservaPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void abreListagem() {
		driver.get(BASE_URL);
	}
	
	public void procuraPorLinhasCom100Ingressos(){
		List<WebElement> linhas = driver.findElements(By.tagName("li"));
		
		String proximaPagina = "";
		
		for(WebElement linha : linhas){
			WebElement href = linha.findElements(By.tagName("a")).get(0);
			String text = href.getText();
			
			if(text.contains("100")){
				proximaPagina = href.getAttribute("href");
				linha.click();
				break;
			}
		}
		
		if(!proximaPagina.isEmpty()){
			driver.get(BASE_URL + proximaPagina);
			
			WebElement form = driver.findElements(By.tagName("li")).get(0);
			
			
			
		}
	}
}
