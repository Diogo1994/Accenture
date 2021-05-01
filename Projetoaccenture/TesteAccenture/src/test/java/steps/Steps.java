package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu estaja no site {string}")

	// Abrindo o site
	public void que_eu_estaja_no_site(String string) {
		metodos.abrirBrowser(string);
	}

	@When("preencher todos os campos dos formularios")
	public void preencher_todos_os_campos_dos_formularios() {

		// Janela 1
		metodos.selecionarCombo(el.getModelo(), "Volkswagen");
		metodos.escrever(el.getDesempenhoMotor(), "100");
		metodos.preencherData(el.getData(), "04/22/2021");
		metodos.selecionarCombo(el.getNumAssentos(), "5");
		metodos.selecionarCombo(el.getTipoCombustivel(), "Gas");
		metodos.escrever(el.getLidtPrice(), "25000");
		metodos.escrever(el.getNumMatricula(), "1000");
		metodos.escrever(el.getMilhaAnual(), "10000");
		metodos.clicarBotao(el.getBotaoNext1());

		// Janela 2
		metodos.escrever(el.getPrimeiroNome(), "Felaki");
		metodos.escrever(el.getSobreNome(), "Kekay");
		metodos.preencherData(el.getMesNiver(), "07/11/1994");
		metodos.selecionarGenero(el.getGeneroMasc());
		metodos.escrever(el.getEndereço(), "Cajamar São Paulo");
		metodos.selecionarCombo(el.getPais(), "Brazil");
		metodos.escrever(el.getCodPostal(), "13245678");
		metodos.escrever(el.getCidade(), "São Paulo");
		metodos.selecionarCombo(el.getOcupacao(), "Public Official");
		metodos.clicarRadio(el.getHobbieBungeeJumpig());
		metodos.clicarBotao(el.getClicarBotao2());

		// Janela 3
		metodos.preencherData(el.getDataInicio(), "09/10/2021");
		metodos.selecionarCombo(el.getSomaSeguro(), "7000000");
		metodos.selecionarCombo(el.getClassificacaoMerito(), "Bonus 2");
		metodos.selecionarCombo(el.getSeguraoDanos(), "Partial Coverage");
		metodos.clicarRadio(el.getProdOpcionalEuroProtection());
		metodos.selecionarCombo(el.getCarroCortesia(), "Yes");
		metodos.clicarBotao(el.getClicarBotao3());

		// Janela 4
		metodos.clicarRadio(el.getSelecionarCotaPlatinum());
		metodos.clicarBotao(el.getClicarBotao4());

		// Janela 5
		metodos.escrever(el.getEmail(), "diogo@diogo.com");
		metodos.escrever(el.getPhone(), "987654321");
		metodos.escrever(el.getUserName(), "Felaky");
		metodos.escrever(el.getPassWord(), "Diogo0403");
		metodos.escrever(el.getConfirmPassWord(), "Diogo0403");
		metodos.escrever(el.getComments(), "Teste Finalizado!");
		metodos.clicarBotao(el.getClicarBotao5());
	}

	@Then("valido a mensagem {string}")
	public void valido_a_mensagem(String string) {

		// Validando as informações e fechando o site
		metodos.validarMensagem("Sending e-mail success!", el.getValidacao());
		metodos.clicarBotao(el.getBotaoOk());
		metodos.fecharBrower();
	}

}
