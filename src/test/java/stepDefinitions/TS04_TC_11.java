package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.Homepage;

public class TS04_TC_11 {
	
	WebDriver driver=BaseClass.getDriver();
	Homepage page=new Homepage(driver);
	 
	 
	@Then("check the function of Departure date with valid input {string}")
	public void check_the_function_of_departure_date_with_valid_input(String string)		
	{
		try 
		    {
			page.date(string);
			Assert.assertTrue(true);
		    }
		    catch(Exception e)
		    {
		    	
		    	Assert.fail();
		    }
		}
	 

}
