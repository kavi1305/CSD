package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HotelBookingPage;

public class TS04_TC_17 {
	
	WebDriver driver=BaseClass.getDriver();
	HotelBookingPage page=new HotelBookingPage(driver) ;
	String title;
	
	@When("user select for the values in room \\(Value={string}) list box.")
	public void user_select_for_the_values_in_room_value_list_box(String number) {
		page.roomButton();
		page.roomMember(Integer.parseInt(number));
		
	}

	@When("user click price option is {string} selected")
	public void user_click_price_option_is_selected(String string) {
		page.pricePerNightButton();
		page.rate_selection();
		
		
	}

	@Then("user navigate to the next page")
	public void user_navigate_to_the_next_page() {
		title=driver.getTitle();
	}

	@Then("validate a Message {string} should be displayed or not.")
	public void validate_a_message_should_be_displayed_or_not(String string) {
		String notification=page.result();
		Assert.assertEquals(notification, string);
	}


}
