package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;


public class TS04_TC_15 {

	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	
	@Then("check the distance coverd is displayed")
	public void check_that_distance_coverd_is_displayed() throws Exception 
	{
	
		
	   if(page.isCabDistDisplayed()) 
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.fail();
	   }
	}

}
