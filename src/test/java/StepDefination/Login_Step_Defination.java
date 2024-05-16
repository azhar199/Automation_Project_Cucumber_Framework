package StepDefination;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Step_Defination {

	LoginPage login= new LoginPage();

	@Given("User Launch site URL")
	public void user_launch_site_url() {	
		login.user_launch_site_url();

	}

	@When("Enter correct username and password")
	public void enter_correct_username_and_passwords() {
		login.enter_correct_username_and_passwords();

	}

	@And("Click on login button")
	public void click_on_login_button() {
		login.click_on_login_button();


	}

	@Then("Validate successful login")
	public void validate_successful_login() {
		login.validate_successful_login();


	}
}
