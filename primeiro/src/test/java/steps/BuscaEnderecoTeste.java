package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class BuscaEnderecoTeste {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que esteja no site dos correios")
	public void que_esteja_no_site_dos_correios() {
	    Executa.abrirNavegador();
	}
	
	@When("informar cep")
	public void informar_cep() {
	    metodo.escrever(el.cep, "08260-030");
	}

	@When("apertar botao enter")
	public void apertar_botao_enter() {
	   metodo.submit(el.cep);
	}

	@Then("sistema apresenta dados de endereco")
	public void sistema_apresenta_dados_de_endereco() {
	    metodo.trocarDeAba("Busca CEP");
	    metodo.validarCep(el.cepCapturado, "08260-030");
	    Executa.fecharJanela();
	    Executa.fecharNavegador();
	}

	@When("informar endereco")
	public void informar_endereco() {
	    metodo.escrever(el.cep, "Rua Agrimensor Sugaya");
	}

	@Then("sistema apresenta dados de endereco e cep")
	public void sistema_apresenta_dados_de_endereco_e_cep() {
	    metodo.trocarDeAba("Busca CEP");
	    metodo.validarEndereco(el.enderecoCapturado, "Rua Agrimensor Sugaya");
	    Executa.fecharJanela();
	    Executa.fecharNavegador();
	}

}
