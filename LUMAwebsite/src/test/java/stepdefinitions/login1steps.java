package stepdefinitions;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.MyAccountPage;
import utilities.DataReader;

public class login1steps {
	
	 WebDriver driver;
     Homepage hp;
     Loginpage lp;
     MyAccountPage macc;
    
     
       List<HashMap<String, String>> datamap; //Data driven
        
       @Given("the user navigates to login page")
       
	public void the_user_navigates_to_login_page() throws IOException {
		BaseClass.getLogger().info("Click on Login.. ");
		//setup();
	   	hp=new Homepage(BaseClass.getDriver());
	    hp.clicksignIn();
	}

	@When("user enters email as {string} and password as {string}")
	
	public void user_enters_email_as_and_password_as(String email, String pwd) {
		BaseClass.getLogger().info("Entering email and password.. ");
		lp=new Loginpage(BaseClass.getDriver());
		lp.setEmail(email);
	    lp.setPassword(pwd);
	}

	@When("the user clicks on the Login button")
	
	public void the_user_clicks_on_the_login_button() {
		BaseClass.getLogger().info("click login button ");
		lp.clickLogin();
	}

	@Then("the user should be logged in succesfully")
	
	public void the_user_should_be_logged_in_succesfully() {
		BaseClass.getLogger().info("user loggedin ");
	
		boolean targetpage=lp.loggedin();
		
		Assert.assertEquals(targetpage, true);
	}

	@Then("the user should be redirected to the MyAccount Page by passing email and password with excel row {string}")
    public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_data(String rows)
    {
       datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\Luma_LoginData.xlsx", "Sheet1");

       int index=Integer.parseInt(rows)-1;
        String email= datamap.get(index).get("username");
        String pwd= datamap.get(index).get("password");
        String exp_res= datamap.get(index).get("res");

        lp=new Loginpage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(pwd);

        lp.clickLogin();
        macc=new MyAccountPage(BaseClass.getDriver());
        try
        {
            boolean targetpage=lp.loggedin();
            System.out.println("target page: "+ targetpage);
            if(exp_res.equals("Valid"))
            {
                if(targetpage==true)
                {
                    //MyAccountPage myaccpage=new MyAccountPage(BaseClass.getDriver());
                	macc.clickprofile();
                    macc.clickLogout();
                    Assert.assertTrue(true);
                    
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }

            if(exp_res.equals("Invalid"))
            {
                if(targetpage==true)
                {
                	macc.clickprofile();
                	macc.clickLogout();
                    Assert.assertTrue(false);
                }
                else
                {
                    lp.errormsg();
                	Assert.assertTrue(true);
                }
            }


        }
        catch(Exception e)
        {

            Assert.assertTrue(false);
        }
       
      }
	
}

