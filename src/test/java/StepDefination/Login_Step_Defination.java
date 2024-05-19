package StepDefination;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Defination {

	LoginPage login = new LoginPage();

	@Given("User Launch site URL")
	public void user_launch_site_url() throws InterruptedException {
		login.user_launch_site_url();
		Thread.sleep(2000);

	}

	@When("Enter correct {string} and {string}")
	public void enter_correct_and(String username, String password) throws InterruptedException {
		login.enter_correct_username_and_passwords(username, password);
		Thread.sleep(2000);

	}

	@And("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		login.click_on_login_button();
		Thread.sleep(2000);

	}

	@And("Add to cart product")
	public void add_to_cart_product() throws InterruptedException {
		login.add_to_cart_product();
		Thread.sleep(2000);

	}

	@And("Check the cart")
	public void check_the_cart() throws InterruptedException {
		login.check_the_cart();
		Thread.sleep(2000);

	}

	@And("Check the checkout")
	public void check_the_checkout() throws InterruptedException {
		login.check_the_checkout();
		Thread.sleep(2000);

	}

	@And("Fill your First name")
	public void fill_your_first_name() throws InterruptedException {
		login.fill_your_first_name();
		Thread.sleep(1000);

	}

	@And("Fill your LastName")
	public void fill_your_last_name() throws InterruptedException {
		login.fill_your_last_name();
		Thread.sleep(1000);

	}

	@And("Fill your Postal Code")
	public void fill_your_postal_code() throws InterruptedException {
		login.fill_your_postal_code();
		Thread.sleep(1000);

	}

	@And("Tap on continue")
	public void tap_on_continue() throws InterruptedException {
		login.tap_on_continue();
		Thread.sleep(2000);

	}

	@And("Scroll down to Finish")
	public void scroll_down_to_finish() throws InterruptedException {
		login.scroll_down_to_finish();
		Thread.sleep(2000);

	}

	@And("Tap on Finish button")
	public void tap_on_finish_button() throws InterruptedException {
		login.tap_on_finish_button();
		Thread.sleep(2000);

	}

	@Then("Validate the the Thank you for your order !")
	public void validate_the_the_thank_you_for_your_order() {
		login.validate_the_the_thank_you_for_your_order();

	}

}
