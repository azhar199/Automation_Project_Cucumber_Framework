package Code_Panda_Project.Code_Panda_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_Drop_Down {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	     driver.manage().window().maximize();
	     
	     WebElement Dropdown = driver.findElement(By.xpath("//button[@id='menu1']"));
	     Dropdown.click();
	    
	     
	     List<WebElement> Dropdownlist = driver.findElements(By.xpath("//ul[@Class='dropdown-menu']/li/a"));
	     
	     // For each loop
	     
	     for (WebElement Boot:Dropdownlist) {
	    	 
	    	 String  dropDownValue=Boot.getText();
	    	 
	    	 if (dropDownValue.equals("CSS"));
	    	 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 Boot.click();
	    	 break;
	    	 
	    	 	 
	    	 
	    	 
	     }
	     
	   
	     
	}
}
