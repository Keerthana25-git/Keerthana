package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NBNSetup {

	public WebDriver driver;
	
	By plan=By.id("plan");
	By technology=By.name("technology");
	By day=By.name("day");
	By hour=By.name("hour");
	By minute=By.name("minute");
	By signupdate = By.name("signupdate");
	By connecteddate=By.name("connecteddate");
	By issuedate=By.name("issuedate");
	By unexpectedone=By.id("unexpected-one");
	By unexpectedtwo=By.id("unexpected-two");
	By unexpectedthree=By.id("unexpected-three");
	By next=By.cssSelector("button.btn:nth-child(1)");

	
public NBNSetup(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement plan() {
		
		return driver.findElement(plan);
		
	}
public  WebElement technology() {
		
		return driver.findElement(technology);
		
	}
public  WebElement day() {
	
	return driver.findElement(day);
	
}
public  WebElement hour() {
	
	return driver.findElement(hour);
	
}
public  WebElement minute() {
	
	return driver.findElement(minute);
	
}
public  WebElement signupDate() {
	
	return driver.findElement(signupdate);
	
}
public  WebElement connectedDate() {
	
	return driver.findElement(connecteddate);
	
}
public  WebElement issueDate() {
	
	return driver.findElement(issuedate);
	
}
public  WebElement unexpectedOne() {
	
	return driver.findElement(unexpectedone);
	
}
public  WebElement unexpectedTwo() {
	
	return driver.findElement(unexpectedtwo);
	
}
public  WebElement unexpectedThree() {
	
	return driver.findElement(unexpectedthree);
	
}
public  WebElement next() {
	
	return driver.findElement(next);
	
}
	
}
