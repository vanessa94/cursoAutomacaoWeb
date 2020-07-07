package cursoTeste;

import static org.hamcrest.MatcherAssert.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.Driver;
import pages.InicialPage;


public class LojaTeste extends BaseTest {
	InicialPage inicialPage = new InicialPage();
	
	@Test
	public void realizaPesquisa() {
		inicialPage.setPesquisa("Fortaleza Digital", Keys.ENTER);
		WebElement elTituloLivro = Driver.getDriver().findElement(By.xpath("//h2/a"));
		String livro = elTituloLivro.getText();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		WebElement elPreco = Driver.getDriver().findElement(By.cssSelector("#product-price-44"));
		String preco = elPreco.getText();
		Assert.assertEquals("R$519,90", preco);
	}
	
	@Test
	public void realizaPesquisa_assertThat() {
		inicialPage.setPesquisa("Fortaleza Digital", Keys.ENTER);
		WebElement elTituloLivro = Driver.getDriver().findElement(By.xpath("//h2/a"));
		String livro = elTituloLivro.getText();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		WebElement elPreco = Driver.getDriver().findElement(By.cssSelector("#product-price-44"));
		String preco = elPreco.getText();
		assertThat("R$519,90", is (preco));
	}
	
	@Test
	public void testClickLista() {
		inicialPage.setPesquisa("html", Keys.ENTER);
		List<WebElement> elLivros = Driver.getDriver().findElements(By.cssSelector("ul.products-grid > li"));
		for (WebElement elLivro : elLivros) {
			WebElement elTituloLivro = elLivro.findElement(By.cssSelector("h2 > a"));
			String tituloLivro = elTituloLivro.getText();
			if(tituloLivro.contains("Ajax com Java")) {
				WebElement elpreco = elLivro.findElement(By.cssSelector("span.price"));
				assertThat("R$444,50", is(elpreco.getText()));
				break;
			}
		}
	}
}
