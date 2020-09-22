package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By login =By.xpath("(//a[text()='Login'])[2]");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}

}
