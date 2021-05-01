package metodos;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import elementos.Elementos;

public class Metodos extends Elementos {

	private static WebDriver driver;

	public static WebDriver adriver() {
		return driver;
	}

	public void abrirBrowser(String site) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("nav_automobile")).click();
	}
	
	public void selecionarCombo(By elemento, String nomeModelo) {
		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByValue(nomeModelo);
	}
	
	public void escrever(By id_campo, String texto) {
		driver.findElement(id_campo).sendKeys(texto);
	}
	
	public void preencherData(By id_campo, String diaMesAno) {
		driver.findElement(id_campo).sendKeys(diaMesAno);		
	}
	
	public void clicarBotao(By id_campo) {
		driver.findElement(id_campo).click();
	}
	
	public void selecionarGenero(By id_campo) {
		driver.findElement(id_campo).click();
	}

	public void clicarRadio(By id_campo) {
		driver.findElement(id_campo).click();
	}
	
	public void validarMensagem(String texto, By elemento) {
		String txt = driver.findElement(elemento).getText();
		assertEquals(texto, txt);		
	}
	
	public void fecharBrower() {
		driver.quit();
	}
}
