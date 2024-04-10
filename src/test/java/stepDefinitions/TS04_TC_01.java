package stepDefinitions;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.FlightPage;
import pageObject.Homepage;

public class TS04_TC_01 {

	WebDriver driver=BaseClass.getDriver();
	Homepage page1;
	FlightPage flightpage;
	String title;	

	@Then("user click the Flight icon")
	public void user_click_the_flight_icon() 
	{
	    
		page1=new Homepage(driver);
		page1.flightButton();
	}

	@Then("user navigated to Flight webpage")
	public void user_navigated_to_flight_webpage() 
	{
		flightpage=new FlightPage(driver);
	    title=flightpage.getTitle1();
	    System.out.println("title");
	    //verify the title
	}
}
