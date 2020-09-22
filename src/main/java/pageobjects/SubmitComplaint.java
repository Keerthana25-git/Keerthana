package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitComplaint {
	
	public WebDriver driver;
	By submit =By.xpath("//a[text()='Submit new complaint']");
	
	public SubmitComplaint(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
