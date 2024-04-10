package stepDefinitions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.*;
import pageObject.HotelBookingPage;

public class TS03_TC_01 {

	WebDriver driver=BaseClass.getDriver();
	HotelBookingPage hotel=new HotelBookingPage(driver);
	Logger logger=LogManager.getLogger();
	
	@Then("user click on hotels option.")
	public void user_click_on_hotels_option() {
		hotel.hotelButton();
		
		
	}

	@When("user enter City, Property Name Or Location\\(value={string}).")
	public void user_enter_city_property_name_or_location_value(String hotelname) throws InterruptedException {
		
		logger.info("-----Testing Started------");
		hotel.locationButton();
		hotel.locationName(hotelname);
		hotel.suggestionLocation();
	}

	@When("user Select a valid date from CHECK-IN\\(value={string})")
	public void user_select_a_valid_date_from_check_in_value(String check_in_date) {
		
		hotel.checkInButton();
		hotel.checkInDate(check_in_date);
	}

	@When("CHECK-OUT\\(value={string}) in calendar.")
	public void check_out_value_in_calendar(String check_out_date) {
		hotel.checkOutButton();
		hotel.checkOutDate(check_out_date);
	}

	@Then("user Check for the values in ADULTS \\(Value={string}) list box.")
	public void user_check_for_the_values_in_adults_value_list_box(String string) {
		hotel.roomGuest();
	}

	@Then("user print the list of Adults Number List")
	public void user_print_the_list_of_adults_number_list() {
		hotel.adultButton();
		List<String> adult_list=hotel.adultList();
		System.out.println("Adult List Numbers: ");
		for(String number:adult_list) {
			System.out.println(number);
		}
		
		
	}

}
