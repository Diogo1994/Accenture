package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Elementos da Janela 1
	private By modelo = By.id("make");
	private By desempenhoMotor = By.id("engineperformance");
	private By data = By.id("dateofmanufacture");
	private By listPrice = By.id("listprice");
	private By numAssentos = By.id("numberofseats");
	private By tipoCombustivel = By.id("fuel");
	private By numMatricula = By.id("licenseplatenumber");
	private By milhaAnual = By.id("annualmileage");
	private By botaoNext1 = By.id("nextenterinsurantdata");
	
	// Elementos da janela 2
	private By primeiroNome = By.id("firstname");
	private By sobreNome = By.id("lastname");
	private By mesNiver = By.id("birthdate");
	private By generoMasc = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By generoFemi = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
	private By endereço = By.id("streetaddress");
	private By pais = By.id("country");
	private By codPostal = By.id("zipcode");
	private By cidade = By.id("city");
	private By ocupacao = By.id("occupation");
	private By hobbieBungeeJumpig = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
	private By clicarBotao2 = By.id("nextenterproductdata");
	
	// Elementos da janela 3
	private By dataInicio = By.id("startdate");
	private By somaSeguro = By.id("insurancesum");
	private By classificacaoMerito = By.id("meritrating");
	private By seguroDanos = By.id("damageinsurance");
	private By prodOpcionalEuroProtection  = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	private By prodOpcionalLegalDefenseInsurance = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span");
	private By carroCortesia = By.id("courtesycar");
	private By clicarBotao3 = By.id("nextselectpriceoption");
	
	// Elemento da janela 4
	private By selecionarCotaPlatinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
	private By clicarBotao4 = By.id("nextsendquote");
	
	// Elementos da janela 5
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By userName = By.id("username");
	private By passWord = By.id("password");
	private By confirmPassWord = By.id("confirmpassword");
	private By comments = By.id("Comments");
	private By clicarBotao5 = By.id("sendemail");
	
	// Elementos da janela 6
	private By validacao = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	private By botaoOk = By.xpath("/html/body/div[4]/div[7]/div/button");
	

	public By getModelo() {
		return modelo;
	}

	public By getDesempenhoMotor() {
		return desempenhoMotor;
	}

	public By getData() {
		return data;
	}

	public By getLidtPrice() {
		return listPrice;
	}

	public By getNumAssentos() {
		return numAssentos;
	}

	public By getTipoCombustivel() {
		return tipoCombustivel;
	}

	public By getNumMatricula() {
		return numMatricula;
	}

	public By getMilhaAnual() {
		return milhaAnual;
	}

	public By getBotaoNext1() {
		return botaoNext1;
	}

	public By getPrimeiroNome() {
		return primeiroNome;
	}

	public By getSobreNome() {
		return sobreNome;
	}

	public By getMesNiver() {
		return mesNiver;
	}

	public By getGeneroMasc() {
		return generoMasc;
	}

	public By getGeneroFemi() {
		return generoFemi;
	}

	public By getEndereço() {
		return endereço;
	}

	public By getPais() {
		return pais;
	}

	public void setPais(By pais) {
		this.pais = pais;
	}

	public By getCodPostal() {
		return codPostal;
	}

	public By getCidade() {
		return cidade;
	}

	public By getOcupacao() {
		return ocupacao;
	}

	public By getHobbieBungeeJumpig() {
		return hobbieBungeeJumpig;
	}

	public By getClicarBotao2() {
		return clicarBotao2;
	}

	public By getDataInicio() {
		return dataInicio;
	}

	public By getSomaSeguro() {
		return somaSeguro;
	}

	public By getClassificacaoMerito() {
		return classificacaoMerito;
	}

	public By getSeguraoDanos() {
		return seguroDanos;
	}

	public By getProdOpcionalEuroProtection() {
		return prodOpcionalEuroProtection;
	}

	public By getProdOpcionalLegalDefenseInsurance() {
		return prodOpcionalLegalDefenseInsurance;
	}

	public By getCarroCortesia() {
		return carroCortesia;
	}

	public By getClicarBotao3() {
		return clicarBotao3;
	}

	public By getSelecionarCotaPlatinum() {
		return selecionarCotaPlatinum;
	}

	public By getClicarBotao4() {
		return clicarBotao4;
	}

	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUserName() {
		return userName;
	}

	public By getPassWord() {
		return passWord;
	}

	public By getConfirmPassWord() {
		return confirmPassWord;
	}

	public By getComments() {
		return comments;
	}

	public By getClicarBotao5() {
		return clicarBotao5;
	}

	public By getBotaoOk() {
		return botaoOk;
	}

	public void setBotaoOk(By botaoOk) {
		this.botaoOk = botaoOk;
	}

	public By getValidacao() {
		return validacao;
	}

}