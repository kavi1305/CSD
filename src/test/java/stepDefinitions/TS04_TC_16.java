package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;

public class TS04_TC_16 {
	
	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	
	@Then("check that car model is enabled")
	public void check_that_car_model_is_enabled() throws Exception 
	{
	
		
	   if(page.isCabModelEnabled()) 
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.fail();
	   }
	}

}
