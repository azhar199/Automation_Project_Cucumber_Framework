package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Base {

	WebDriver driver;

	public void user_launch_site_url() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	public void enter_correct_username_and_passwords(String userName, String PassWord) {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(userName);

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys(PassWord);
		

	}

	public void click_on_login_button() {
		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
	}

	public void add_to_cart_product() {
		WebElement product = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		product.click();

	}

	public void check_the_cart() {
		WebElement Addcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Addcart.click();

	}

	public void check_the_checkout() {
		WebElement chekout = driver
				.findElement(By.xpath("//button[@id='checkout']"));
		chekout.click();

	}

	public void fill_your_first_name() {
		WebElement First_name = driver.findElement(By.xpath("//input[@class='input_error form_input']"));
		First_name.sendKeys("Azhar");

	}

	public void fill_your_last_name() {
		WebElement Last_name = driver.findElement(By.xpath("//input[@id='last-name']"));
		Last_name.sendKeys("Imam");

	}

	public void fill_your_postal_code() {
		WebElement Zipcode = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
		Zipcode.sendKeys("827010");

	}

	public void tap_on_continue() {
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();

	}

	public void scroll_down_to_finish() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

	}

	public void tap_on_finish_button() {
		WebElement Finish = driver.findElement(By.xpath("//button[@id='finish']"));
		Finish.click();

	}

	public void validate_the_the_thank_you_for_your_order() {
		String Text = driver.findElement(By.xpath("//div[@id='checkout_complete_container']")).getText();

		System.out.println(Text);

	}
}
