package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;

public class TS04_TC_07 {
	
	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);

	@Then("check that filter is applied")
	public void check_that_filter_is_applied() 
	{
	
		
	   if(page.isLowRatButnSelected()) 
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.fail();
	   }
	}
}
