package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import factory.BaseClass;

import pageobjects.Productdetailpage;

public class Addtocart {
	Productdetailpage pd;
	
	@Given("the user lands on the Product Page")
	public void the_user_lands_on_the_product_page() {
		pd=new Productdetailpage(BaseClass.getDriver());
		pd.isProductdetailpageexists();
	}

	@When("the user selects the size")
	public void the_user_selects_the_size()  {
	   
		pd.selectsize();
	}

	@When("the user selects the color")
	public void the_user_selects_the_color() {
	    pd.seletcolor();
	}

	@When("the user clicks on the Addtocart button")
	public void the_user_clicks_on_the_addtocart_button() {
	   pd.addtocart();
	}

	@Then("the Product should be successfully added to the cart")
	public void the_product_should_be_successfully_added_to_the_cart() {
	 pd.Successmsg();
	}

	@Then("cartvalue should be incemented by one")
	public void cartvalue_should_be_incemented_by_one() {
	    pd.cartvalueincrement();
	    pd=new Productdetailpage(BaseClass.getDriver());
		 boolean targetpage = pd.cartvalueincrement();
		Assert.assertEquals(targetpage, true);
	}
}
