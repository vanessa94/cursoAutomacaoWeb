package cursoTeste;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import pages.InicialPage;


public class LojaTeste extends BaseTest {
	InicialPage inicialPage = new InicialPage();
	
	@Test
	public void realizaPesquisa() {
		inicialPage.setPesquisa("Fortaleza Digital", Keys.ENTER);
		String livro = inicialPage.getTituloLivro();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		String preco = inicialPage.getPreco();
		Assert.assertEquals("R$519,90", preco);
	}
	
	@Test
	public void realizaPesquisa_assertThat() {
		inicialPage.setPesquisa("Fortaleza Digital", Keys.ENTER);
		String livro = inicialPage.getTituloLivro();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		String preco = inicialPage.getPreco();
		assertThat("R$519,90", is (preco));
	}
	
	@Test
	public void testClickLista() {
		inicialPage.setPesquisa("html", Keys.ENTER);
		String preco = inicialPage.getPrecoLista();
		assertThat("R$444,50", is (preco));
	}
}
