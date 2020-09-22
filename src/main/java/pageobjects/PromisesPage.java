package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromisesPage {
	
	
public WebDriver driver;
	
	By isModemSupplied=By.id("modem_supply");
	By soldOnSignUp0=By.id("soldSignup-zero");
	By soldOnSignUp1=By.id("soldSignup-one");
	By soldOnSignUp2=By.id("soldSignup-two");
	By soldItem=By.id("soldSignup-other-two");
	By soldOnSignUp3 = By.id("soldSignup-three");
	By soldOnSignUp4=By.id("soldSignup-four");
	By promise0=By.id("promises-zero");
	By promise1=By.id("promises-one");
	By promise2=By.id("promises-two");
	By promise3=By.id("promises-three");
	By promise4=By.id("promises-four");
	By apology=By.id("promises-other-four");
	By service0=By.id("services-zero");
	By service1=By.id("services-one");
	By service2=By.id("services-two");
	By next=By.cssSelector("button.btn:nth-child(1)");
	
	public PromisesPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement isModemSupplied() {
		
		return driver.findElement(isModemSupplied);
		
	}
public  WebElement soldOnSignUp0() {
		
		return driver.findElement(soldOnSignUp0);
		
	}
public  WebElement soldOnSignUp1() {
	
	return driver.findElement(soldOnSignUp1);
	
}
public  WebElement soldOnSignUp2() {
	
	return driver.findElement(soldOnSignUp2);
	
}
public  WebElement soldItem() {
	
	return driver.findElement(soldItem);
	
}
public  WebElement soldOnSignUp3() {
	
	return driver.findElement(soldOnSignUp3);
	
}
public  WebElement soldOnSignUp4() {
	
	return driver.findElement(soldOnSignUp4);
	
}
public  WebElement promise0() {
	
	return driver.findElement(promise0);
	
}
public  WebElement promise1() {
	
	return driver.findElement(promise1);
	
}
public  WebElement promise2() {
	
	return driver.findElement(promise2);
	
}
public  WebElement promise3() {
	
	return driver.findElement(promise3);
	
}
public  WebElement promise4() {
	
	return driver.findElement(promise4);
	
}
public  WebElement apology() {
	
	return driver.findElement(apology);
	
}
public  WebElement service0() {
	
	return driver.findElement(service0);
	
}
public  WebElement service1() {
	
	return driver.findElement(service1);
	
}
public  WebElement service2() {
	
	return driver.findElement(service2);
	
}
public  WebElement next() {
	
	return driver.findElement(next);
	
}
}
