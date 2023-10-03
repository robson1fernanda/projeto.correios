
@regressivos
Feature: Buscar endereco
Como usuario do site dos correios
Quero informar dados validos
Para localizar endereco

Background: Entrar na tela principal
Given que esteja no site dos correios

Scenario: Validar cep
When informar cep
And apertar botao enter
Then sistema apresenta dados de endereco

Scenario: Validar endereco
When informar endereco
And apertar botao enter
Then sistema apresenta dados de endereco e cep