package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Base {
	
	WebDriver driver;

	@Given("User Launch site URL")
	public void user_launch_site_url() {

		WebDriverManager.chromedriver().setup();

	    driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();


	}

	@When("Enter correct username and password")
	public void enter_correct_username_and_password() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
		

	}

	@And("Click on login button")
	public void click_on_login_button() {
		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();

	}

	@Then("Validate successful login")
	public void validate_successful_login() {
		// assertTrue(driver.findElement(By.xpath("")).isDisplayed());

	}
}

