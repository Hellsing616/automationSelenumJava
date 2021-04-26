package product.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import product.page.SearchProductPage;

public class SearchProductSteps extends SearchProductPage{
	
	@Given("^Eu como cliente acesso o \"([^\"]*)\"$")
	public void eu_como_cliente_acesso_o(String site) throws Throwable {
		accessShoppingPortal(site);
	}

	@Given("^digite o nome do \"([^\"]*)\" desejado$")
	public void digite_o_nome_do_desejado(String product) throws Throwable {
		writeNameProduct(product);
	}

	@When("^click na lupa de pesquisa$")
	public void click_na_lupa_de_pesquisa() throws Throwable {
		clickButtonSearch();
	}

	@Then("^devo ver uma lista de produtos$")
	public void devo_ver_uma_lista_de_produtos() throws Throwable {
		receiveProductList();
	}

	@Then("^devo gerar uma planilha de nome e preço com \"([^\"]*)\"$")
	public void devo_gerar_uma_planilha_de_nome_e_preço_com(String status) throws Throwable {
		generateSpreadsheetsWithSearchResults(status);
	}

}
