package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_19 {

	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);

	@When("PNR status button should be clicked by user")
	public void pnr_status_button_should_be_clicked_by_user() {
		tpage.pnrStatusButton();
		
	}

	@When("user enter the number {string}")
	public void user_enter_the_number(String number) {
		tpage.pnrTextBox(number);
	}

	@When("user click the check status button")
	public void user_click_the_check_status_button() {
		tpage.searchPNRButton();
	}

	@Then("Navigate to next page and a message {string}  should be shown.")
	public void navigate_to_next_page_and_a_message_should_be_shown(String pnrstatus) {
		String status=tpage.pnrStatus();
		Assert.assertEquals(status,pnrstatus );
	}
}
