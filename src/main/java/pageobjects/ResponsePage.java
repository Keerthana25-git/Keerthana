package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResponsePage {
	
public WebDriver driver;
	
	By onBehalf=By.xpath("(//label[@class='checkbox-text clearfix radio-label'])[2]");
	By contacttitle=By.id("contact-title");
	By contactfirstname=By.id("contact-firstname");
	By contactlastname=By.id("contact-lastname");
	By contactemail=By.id("contact-email");
	By response2=By.xpath("(//label[@class='response-terms'])[2]");
	By response3=By.xpath("(//label[@class='response-terms'])[3]");
	By submit=By.xpath("(//button[@id='submit-step'])[1]");
	
	
	
	public ResponsePage(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement onBehalf() {
		
		return driver.findElement(onBehalf);
		
	}
public  WebElement contactTitle() {
		
		return driver.findElement(contacttitle);
		
	}
public  WebElement contactFirstname() {
	
	return driver.findElement(contactfirstname);
	
}
public  WebElement contactLastname() {
	
	return driver.findElement(contactlastname);
	
}
public  WebElement contactEmail() {
	
	return driver.findElement(contactemail);
	
}
public  WebElement response2() {
	
	return driver.findElement(response2);
	
}
public  WebElement response3() {
	
	return driver.findElement(response3);
	
}
public  WebElement submit() {
	
	return driver.findElement(submit);
	
}




}
