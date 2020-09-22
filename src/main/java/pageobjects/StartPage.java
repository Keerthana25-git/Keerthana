package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {

	
	public WebDriver driver;
	
	By guest=By.xpath("//a[text()='Use as our guest']");
	
	
	
	public StartPage(WebDriver driver) {
		
		this.driver=driver;
	}
	



	public  WebElement clickGuest() {
		
		return driver.findElement(guest);
		
	}
	
}
