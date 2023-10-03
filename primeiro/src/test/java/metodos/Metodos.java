package metodos;



import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
		
	}

	public void trocarDeAba(String titulo) {
		String handleAtual = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().equals(titulo)) {
				return;
			}
		}
		//Se a aba com o título fornecido não for encontrada,voltar ao handle atual
		driver.switchTo().window(handleAtual);
	}
	
	public void validarCep(By elemento, String cepEsperado) {
		String cepCapturado = driver.findElement(elemento).getText();
		assertEquals(cepEsperado, cepCapturado);
		
	}
	
	public void validarEndereco(By elemento, String enderecoEsperado) {
		String enderecoCapturado = driver.findElement(elemento).getText();
		assertEquals(enderecoEsperado, enderecoCapturado);
		
	}
}
