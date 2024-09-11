package stepdefinitions;
import java.io.IOException;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountRegistrationPage;
import pageobjects.Homepage;

import pageobjects.MyAccountPage;

public class Registrationsteps {
	WebDriver driver;
    Homepage hp;
    MyAccountPage Mp;
    AccountRegistrationPage regpage;
    
	@Given("the user navigates to create Account page")
	public void the_user_navigates_to_create_account_page() throws IOException {
		//setup();
		hp=new Homepage(BaseClass.getDriver());
		hp.clickMyAccount();
      //  hp.clickRegister();
	    
	}

	@When("the user enters the details into below fields")
	public void the_user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) {
Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    
		regpage=new AccountRegistrationPage(BaseClass.getDriver());
		regpage.setFirstName(dataMap.get("firstName"));
		regpage.setLastName(dataMap.get("lastName"));
		regpage.setEmail(BaseClass.randomAlphaNumeric()+"@gmail.com");
		regpage.setPassword(dataMap.get("password"));
		regpage.setconfirmPassword(dataMap.get("confirmpassword"));
		
	   
	}

	@When("the user clicks on the Create an Account button")
	public void the_user_clicks_on_the_create_an_account_button() {
		regpage.ClickCreateanAccount();
	    
	}

	@Then("the user account should get created successfully")
	public void the_user_account_should_get_created_successfully() {
		Mp=new MyAccountPage(BaseClass.getDriver());
		boolean targetpage=Mp.isMyAccountPageExists();
				
		Assert.assertEquals(targetpage, true);
		
	
	}



	}

