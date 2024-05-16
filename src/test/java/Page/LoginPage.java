package Page;

import org.openqa.selenium.By;
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


	public void validate_successful_login() {
		//assertTrue(driver.findElement(By.xpath("")).isDisplayed());

	}
}

