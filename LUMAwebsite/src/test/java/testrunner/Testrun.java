package testrunner;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.io.IOException;
import java.util.Properties;


import org.junit.AfterClass;
import org.junit.BeforeClass;
@RunWith (Cucumber.class)

@CucumberOptions(
		features= //{".//Featurefiles/Loginexceldata.feature"},
		         //".//Featurefiles/Registration.feature",
               // ".//Featurefiles/category.feature",
	           //".//Featurefiles/Search.feature",
			// ".//Featurefiles/LoginDDT.feature",
			{".//Featurefiles/Addtocart.feature",".//Featurefiles/Checkout.feature"},
		//tags= "@EndtoEnd",
		glue="stepdefinitions",
				
plugin= {"pretty", "html:reports/myreport.html", 
		  "rerun:target/rerun.txt",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},dryRun=false, monochrome=true  )
		

public class Testrun {
	 static WebDriver driver;
	 static Properties p;
@BeforeClass

	 public  static void setup() throws IOException
	    {
	    	driver=BaseClass.initilizeBrowser();
	    	    	
	    	p=BaseClass.getProperties();
	    	driver.get(p.getProperty("appURL"));
	    	driver.manage().window().maximize();
	        			
		}
@AfterClass
	public static void tearDown()   {
		
	     driver.quit();
  
   
}
}

