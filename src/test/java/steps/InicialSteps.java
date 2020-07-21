package steps;

import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InicialSteps {
	@Dado("que estou na pagina principal da loja virtual")
	public void que_estou_na_pagina_principal_da_loja_virtual() {
		Driver.setUrl("https://lojaexemplod.lojablindada.com");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("realizo a busca do livro {string}")
	public void realizo_a_busca_do_livro(String titulo) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("valido o titulo sendo {string}")
	public void valido_o_titulo_sendo(String titulo) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("o preco sendo {string}")
	public void o_preco_sendo(String preco) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("clico no livro pesquisado")
	public void clico_no_livro_pesquisado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("confirmo o titulo sendo {string} e o preco sendo {string}")
	public void confirmo_o_titulo_sendo_e_o_preco_sendo(String titulo, String preco) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
