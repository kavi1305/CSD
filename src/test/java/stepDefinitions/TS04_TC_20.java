package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_20 {

	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);

	
	@When("user enter the train number {string}")
	public void user_enter_the_train_number(String trainNumber) throws InterruptedException {
		tpage.train_number(trainNumber);
		
	}

	@When("user click the today option")
	public void user_click_the_today_option() {
		tpage.train_date_today();
		
	}

	@Then("Navigated to next page  and live train status of vaigai express is displayed.")
	public void navigated_to_next_page_and_live_train_status_of_vaigai_express_is_displayed() {
		tpage.checkStatusButton();
		try {
			Thread.sleep(3000);
			Assert.assertEquals(true, tpage.isNavigating());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
