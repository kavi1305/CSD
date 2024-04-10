package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HotelBookingPage;

public class TS04_TC_06 {
	
	WebDriver driver=BaseClass.getDriver();
	HotelBookingPage page;
	
	@When("user click the Hotel icon")
	public void user_click_the_hotel_icon() {
		page=new HotelBookingPage(driver);
		page.hotelButton();
		
	}

	@When("user enter city, property name or location value {string}")
	public void user_enter_city_property_name_or_location_value(String areaname) throws InterruptedException {
		page.locationButton();
		page.locationName(areaname);
		page.suggestionLocation();
	}

	@When("user select a valid date from CHECK-IN \\(value={string})")
	public void user_select_a_valid_date_from_check_in_value(String check_in) {
		page.checkInButton();
		page.checkInDate(check_in);
	}

	@When("user select a CHECK-OUT \\(value={string}) calendar.")
	public void user_select_a_check_out_value_calendar(String check_out) {
		
		page.checkOutButton();
		page.checkOutDate(check_out);
	}
	
	
	@Then("user check for the values in Adult \\(Value={string}) list box.")
	public void user_check_for_the_values_in_adults_value_list_box(String count) {
		//page.roomGuest();
		page.adultButton();
		page.adultList(Integer.parseInt(count));
		page.applyButton();
	}
	
    @Then("user click the search button")
	public void user_click_the_search_button() {
    	
		page.searchButton();
	}
	@Then("user check the filter button")
	public void user_check_the_filer_button() {
		page.selectFilter();
		boolean tf=page.isFilterApplied();
		try {
			Assert.assertEquals(true, tf);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}

}
