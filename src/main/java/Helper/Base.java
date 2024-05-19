package Helper;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

	public void setup() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--Incognito");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}

	public void SelectDropDownByText(WebElement ele, String value) {
		Select s = new Select(ele);
		s.deselectByVisibleText(value);

	}

	public void mousehover(WebElement ele) {

		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();

	}

	public void selectDroDownByIndex(WebElement ele, int value) {

		Select s = new Select(ele);
		s.deselectByIndex(value);
	}

	public void selectAlertPopup() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void ImplicitWait() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	/*
	 * public void ExplicitWait() { WebDriverWait wait= new
	 * WebDriverWait(driver,Duration.ofSeconds(2));
	 * wait.until(ExpectedConditions.elementToBeClickable("")); }
	 */

}