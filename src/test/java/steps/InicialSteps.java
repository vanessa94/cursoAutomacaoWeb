package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

//import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.InicialPage;

public class InicialSteps {
	InicialPage inicialPage = new InicialPage();
	
	@Dado("que estou na pagina principal da loja virtual")
	public void que_estou_na_pagina_principal_da_loja_virtual() {
		//Driver.setUrl("https://lojaexemplod.lojablindada.com");
	}

	@Quando("realizo a busca do livro {string}")
	public void realizo_a_busca_do_livro(String titulo) {
	    inicialPage.setPesquisa(titulo, Keys.ENTER);
	}

	@Entao("valido o titulo sendo {string}")
	public void valido_o_titulo_sendo(String titulo) {
		assertEquals(titulo,inicialPage.getTituloLivro());
	}

	@Entao("o preco sendo {string}")
	public void o_preco_sendo(String preco) {
		assertEquals(preco,inicialPage.getPreco());  
	}

	@Quando("clico no livro pesquisado")
	public void clico_no_livro_pesquisado() {
	   inicialPage.clickTitulo();
	}



}
