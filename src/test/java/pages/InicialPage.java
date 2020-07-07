package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;

public class InicialPage {
	String elPesquisa = "search";
	String elTituloLivro = "//h2/a";
	String elPreco = "#product-price-44";
	
	public void setPesquisa(CharSequence... valor) {
		WebElement pesquisa = Driver.getDriver().findElement(By.id(this.elPesquisa));
		pesquisa.sendKeys(valor);
	}
	
	public String getTituloLivro() {
		WebElement tituloLivro = Driver.getDriver().findElement(By.xpath(this.elTituloLivro));
		String livro = tituloLivro.getText();
		return livro;
	}
	
	public String getPreco() {
		WebElement preco = Driver.getDriver().findElement(By.cssSelector(this.elPreco));
		return preco.getText();
	}
}
