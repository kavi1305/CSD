package stepDefinitions;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.*;

public class TS02_TC_01 {

	WebDriver driver=BaseClass.getDriver();
	CabPage cabpage=new CabPage(driver);
	GiftPage giftpage=new GiftPage(driver);
	BirthdayGiftCardPage birthdaypage=new 	BirthdayGiftCardPage(driver);
	
	@When("the user clicks on more options")
	public void the_user_clicks_on_more_options() {
		cabpage.moreButton();
	}

	@When("user click the gift Cards")
	public void user_click_the_gift_cards() {
		cabpage.giftButton();
	}


	@Given("the user is on the gift card page and selects Birthday gift")
	public void the_user_is_on_the_gift_card_page_and_selects_birthday_gift() {
		giftpage.birthdayGift();
		
	}

	@Given("the user select the Email button")
	public void the_user_select_the_email_button() {
		birthdaypage.emailButton();
		
	}

	@Given("the user enters the valid values \\(Reciepient name: {string},Senders name: {string})")
	public void the_user_enters_the_valid_values_reciepient_name_senders_name_mobile_number(String rname, String sname) {
	
		birthdaypage.recipientsName(rname);
		birthdaypage.senderName(sname);

	}
		
	@Given("the user enters the valid values \\(Reciepient number : {string}, sender number: {string})")
	public void the_user_enters_the_valid_values_reciepient_number_sender_number(String rmobile, String smobile) {
		birthdaypage.senderNumber(smobile);
		birthdaypage.recipientsNumber(rmobile);
	}
	
	
	@Given("the user entersb the invalid mail Ids\\(sender mail id: {string} ,reciever mail id: {string})")
	public void the_user_entersb_the_invalid_mail_ids_sender_mail_id_reciever_mail_id(String smail, String rmail) {
	
		birthdaypage.senderMail(smail);
		birthdaypage.recipientsMail(rmail);
	}

	@Given("the user compose a message \\( message: {string})")
	public void the_user_compose_a_message_message(String message) {
		birthdaypage.composeMessage(message);
	}

	@Then("the user clicks on the Buy now button")
	public void the_user_clicks_on_the_buy_now_button() throws InterruptedException {
		
		birthdaypage.buyNow();
	}



}
