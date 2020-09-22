package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CredentialsPage {
	
	public WebDriver driver;
	By email =By.id("register-email");
	By password =By.id("register-password");
	By loginButton =By.id("LoginButton");
	public CredentialsPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(loginButton);
	}
}
