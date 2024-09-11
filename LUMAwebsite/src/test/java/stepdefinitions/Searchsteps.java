package stepdefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Homepage;
import pageobjects.SearchPage;

public class Searchsteps {
	Homepage hp;
	SearchPage sp;
	
	@Given("the user navigates to Homepage")
	public void the_user_navigates_to_homepage() throws IOException {
		//setup();
		hp=new Homepage(BaseClass.getDriver());
		
	}

	@When("user enters ProductName as {string}")
	public void user_enters_product_name_as(String  pName)  {
		BaseClass.getLogger().info("Enter Product Name."); 
		hp.enterProductName(pName);
	}

	@When("the user clicks on the search button")
	public void the_user_clicks_on_the_search_button() throws InterruptedException {
		BaseClass.getLogger().info("Click on search.");
		hp.clickSearch();
		Thread.sleep(5000);
	}

	@Then("the user should be redirected to the repective searchresultPage")
	public void the_user_should_be_redirected_to_the_repective_searchresult_page() {
	    sp=new SearchPage(BaseClass.getDriver());
	    sp.Searchresult();
	   
	}

}
