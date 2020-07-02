package cursoTeste;

import static org.hamcrest.MatcherAssert.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class LojaTeste extends BaseTest {

	@Test
	public void realizaPesquisa() {
		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("Fortaleza Digital", Keys.ENTER);
		WebElement elTituloLivro = driver.findElement(By.xpath("//h2/a"));
		String livro = elTituloLivro.getText();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		WebElement elPreco = driver.findElement(By.cssSelector("#product-price-44"));
		String preco = elPreco.getText();
		Assert.assertEquals("R$519,90", preco);
	}
	
	@Test
	public void realizaPesquisa_assertThat() {
		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("Fortaleza Digital", Keys.ENTER);
		WebElement elTituloLivro = driver.findElement(By.xpath("//h2/a"));
		String livro = elTituloLivro.getText();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		WebElement elPreco = driver.findElement(By.cssSelector("#product-price-44"));
		String preco = elPreco.getText();
		assertThat("519,90", is (preco));
	}
	
	@Test
	public void testClickLista() {
		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("html", Keys.ENTER);
		List<WebElement> elLivros = driver.findElements(By.cssSelector("ul.products-grid > li"));
		for (WebElement elLivro : elLivros) {
			WebElement elTituloLivro = elLivro.findElement(By.cssSelector("h2 > a"));
			String tituloLivro = elTituloLivro.getText();
			if(tituloLivro.contains("Ajax com Java")) {
				WebElement elpreco = elLivro.findElement(By.cssSelector("span.price"));
				assertThat("R$444,50", is(elpreco.getText()));
			}
		}
	}
}
