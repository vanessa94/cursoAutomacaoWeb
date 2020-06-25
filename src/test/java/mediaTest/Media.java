package mediaTest;

import org.junit.Test;
import org.junit.Assert;

import media.CalculoMedia;

public class Media {

	@Test
	public void validaReprovado() {
		CalculoMedia calculaMedia = new CalculoMedia(5, 6);
		String situacao = calculaMedia.getSituacao();
		Assert.assertEquals("Reprovado", situacao);
		
	}
	
	@Test
	public void validaAprovado() {
		CalculoMedia calculaMedia = new CalculoMedia();
		calculaMedia.setNota1(6);
		calculaMedia.setNota2(6);
		Assert.assertEquals("Aprovado", calculaMedia.getSituacao());
	}
	
	@Test
	public void testeBoolean() {
		boolean x = false;
		Assert.assertTrue(x);
	}
	
	@Test
	public void testeBoolean2() {
		boolean x = false;
		Assert.assertEquals("True", x);
	}
	
	@Test
	public void testeErro() throws Exception {
		throw new Exception("Simulação de erro!");
	}

}
