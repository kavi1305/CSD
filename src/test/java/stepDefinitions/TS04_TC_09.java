package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_09 {

	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);
	
	@When("user click the train icon")
	public void user_click_the_train_icon() {
		tpage.trainButton();
		
	}

	@When("user select the Live Train Status")
	public void user_select_the_live_train_status() {
		tpage.trainLiveStatus();
	}

	@Then("user check the Live Train Status is enabled or not")
	public void user_check_the_live_train_status_is_enabled_or_not() {
		try {
		boolean tf=tpage.isTrainLivstatEnabled();
		Assert.assertEquals(true, tf);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
}
