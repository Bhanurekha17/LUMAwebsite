package stepdefinitions;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;



public class Hooks {

	 WebDriver driver;
	 Properties p;
     
//@Before("@Login")

  public void setup() throws IOException
    {
    	driver=BaseClass.initilizeBrowser();
    	    	
    	p=BaseClass.getProperties();
    	driver.get(p.getProperty("appURL"));
    	driver.manage().window().maximize();
        			
	}
	
 
//@After("@Logout")
    public void tearDown(Scenario scenario) throws IOException   {
	
	     driver.quit();
   
    }
    
@AfterStep
    public void addScreenshot(Scenario scenario) {
	     driver=BaseClass.getDriver();
    	// this is for cucumber junit report
    if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
}
    }
   

