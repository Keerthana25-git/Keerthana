package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddressPage {

public WebDriver driver;
	
	By address1=By.id("address1");
	By town=By.name("city");
	By code=By.id("postcode");
	By state=By.name("state");
	By next=By.id("submit-btn");

	public AddressPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement address() {
		
		return driver.findElement(address1);
		
	}
	public  WebElement town() {
		
		return driver.findElement(town);
		
	}
	public  WebElement postCode() {
	
	return driver.findElement(code);
	
	}
	
	public  WebElement selectState() {
		
		
		
		return driver.findElement(state);
		
	}
	public  WebElement clickNext() {
		
		return driver.findElement(next);
		
		}
	
	
	
}
