package stepDefinitions;

import org.openqa.selenium.WebDriver;
import baseClass.BaseClass;
import io.cucumber.java.en.*;
import pageObject.Homepage;

public class TS01_TC_01 {
	
	
	WebDriver driver;
	Homepage page1;

	@Given("the user navigates to page")
	public void the_user_navigates_to_page() {
		driver=BaseClass.getDriver();
	    page1=new Homepage(driver);
	}
	
	@Then("user close the Ads")
	public void user_close_the_ads() {
		try {
			page1.adsClose();
		}
		catch(Exception e) {
			//System.out.println(e);
		}
	    
	}

	@Then("user click the Cab icon")
	public void user_click_the_cab_icon() {
		page1.cabButton();
	    
	}

	@Then("user click the One-Way cab")
	public void user_click_the_one_way_cab() {
	    page1.oneWay();
		
	}

	@When("user enter from {string}")
	public void user_enter_from(String from) throws InterruptedException {
	    page1.fromButton();
	    page1.fromCity(from);
	    //by kavi added thread
	    Thread.sleep(2000);
	}
	
	@When("user enter to {string}")
	public void user_enter_to(String to) throws InterruptedException {
	    page1.toButton();
	    page1.toCity(to);
	}

	@When("user enter Departure {string}")
	public void user_enter_departure(String Date) {
		page1.date(Date);
	    
	}

	@When("user enter Pickup Time-Hours {string}")
	public void user_enter_pickup_time_hours(String hours) {
		page1.time(hours);
	    
	}

	@When("user enter Pickup Time-Min {string}")
	public void user_enter_pickup_time_min(String Min) {
		page1.min(Min);
	    
	}

	@When("user enter Pickup Time-Meridiam {string}")
	public void user_enter_pickup_time_meridiam(String meridiem) {
	    page1.depMeridiem(meridiem);
	}
	
	
	@Then("Click on Apply button")
	public void click_on_apply_button() {
		page1.applyButton();
	    
	}

	@Then("Click on Search button")
	public void click_on_search_button() {
		page1.searchButton();
	    
	}

}
