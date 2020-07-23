package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import pages.LivroPage;

public class LivroSteps {
	LivroPage livroPage = new LivroPage();
	
	@Entao("confirmo o titulo sendo {string} e o preco sendo {string}")
	public void confirmo_o_titulo_sendo_e_o_preco_sendo(String titulo, String preco) {
		assertEquals(titulo,livroPage.getTitulo());
		assertEquals(preco, livroPage.getPreco());

	}
}
