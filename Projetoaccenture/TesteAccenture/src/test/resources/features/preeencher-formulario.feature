#Author: dsoaresdeavila@gmail.com

@executa
Feature: Preencher formulario
  Eu como usuario quero preencher os formulario e enviar os dados 


  Scenario: Preencher formulario e enviar as informações
    Given que eu estaja no site "http://sampleapp.tricentis.com/101/app.php"
    When preencher todos os campos dos formularios
    Then valido a mensagem "Sending e-mail success!"