package Code_Panda_Project.Code_Panda_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	
	
	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--Incognito");
	
	WebDriver driver = new ChromeDriver(option);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(10);
		
		
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	
	WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("secret_sauce");
	
	WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
	Login.click();
	

	
	WebElement product = driver.findElement(By.xpath("//button[@id = \"add-to-cart-sauce-labs-backpack\"]"));
	product.click();
	
	WebElement product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
	product1.click();
	
	WebElement Addcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	Addcart.click();
	
	WebElement Continue = driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button \"]"));
	Continue.click();
	
	
	
	
	WebElement First_name = driver.findElement(By.xpath("//input[@class=\"input_error form_input\"]"));
	First_name.sendKeys("Azhar");
	
	WebElement Last_name = driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
	Last_name.sendKeys("Imam");
	
	WebElement Zipcode = driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[3]"));
	Zipcode.sendKeys("827010");
	
	WebElement Continue1 = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
	Continue1.click();
	
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
	Thread.sleep(2000);

	
	WebElement Finish = driver.findElement(By.xpath("//button[@id=\"finish\"]"));
	Finish.click();
	
	String Text = driver.findElement(By.xpath("//div[@id=\"checkout_complete_container\"]")).getText();
	
	System.out.println(Text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
			
		
	}

}
