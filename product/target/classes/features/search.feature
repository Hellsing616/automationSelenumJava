@pesquisar_smartfone_amazon
Feature: Pesquisar produtos em site

  @pesquisar_smartfone_amazon
  Scenario Outline: Pesquisar smartfone no site www.amazon.com
    Given Eu como cliente acesso o "<SITE>"
    And digite o nome do "<PRODUTO>" desejado
    When click na lupa de pesquisa
    Then devo ver uma lista de produtos
    And devo gerar uma planilha de nome e preço com "<STATUS>"
    Examples:
      | SITE              | PRODUTO | STATUS  |
      | www.amazon.com.br | iphone  | sucesso |