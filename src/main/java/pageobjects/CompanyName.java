package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyName {

public WebDriver driver;
	
	By name=By.xpath("//input[@class='form-control select-organisation']");
	By mail=By.xpath("(//input[@class='form-control'])[2]");
	By next=By.xpath("//button[@class='btn btn-pagenav btn-block organisation-button']");
	
	
	public CompanyName(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement organizationname() {
		
		return driver.findElement(name);
		
	}
	
	public  WebElement organizationmail() {
		
		return driver.findElement(mail);
		
	}
	
	public  WebElement clickNext() {
		
		return driver.findElement(next);
		
	}
}
