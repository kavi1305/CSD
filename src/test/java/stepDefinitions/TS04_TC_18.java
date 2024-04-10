package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HotelBookingPage;

public class TS04_TC_18 {
	
	WebDriver driver=BaseClass.getDriver();
	HotelBookingPage page=new HotelBookingPage(driver) ;
	String s;
	
	@When("user select a CHECK-OUT \\(value={string}) calendar should not able to select.")
	public void user_select_a_check_out_value_calendar_should_not_able_to_select(String string) {
		
		page.checkOutButton();
		try {
	   page.checkOutDate(string);
	   Assert.fail();
		}
		catch(Exception e) {
			s="Unable to click INVALID-CHECK-OUT date : Test case passed";
			Assert.assertTrue(true);
		}
		
	}

	@Then("Unable to locate element exception must arise which must be catched and a message stating {string} should be printed in the console.")
	public void unable_to_locate_element_exception_must_arise_which_must_be_catched_and_a_message_stating_should_be_printed_in_the_console(String string) {
	
		System.out.println(s);
		Assert.assertTrue(true);
	}

}
