package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseComplaint {
	
	public WebDriver driver;
	By complaint =By.xpath("(//div[@class='col-sm-6 col-md-6 industry-tile-left'])[3]");
	
	public ChooseComplaint(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement complaint()
	{
		return driver.findElement(complaint);
	}

	
}
