package Code_Panda_Project.Code_Panda_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--Incognito");
	
	WebDriver driver = new ChromeDriver(option);
	
	driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	
	
	WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("secret_sauce");
	
	
	WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
	Login.click();
	
	WebElement AddCart = driver.findElement(By.xpath("//button[@id = \"add-to-cart-sauce-labs-backpack\"]"));
	AddCart.click();
	
	
	
	
	
		
		
		
			
		
	}

}
