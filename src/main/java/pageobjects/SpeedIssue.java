package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpeedIssue {
	
public WebDriver driver;
	
	By issue=By.name("issue_occur");
	By numberOfTimes=By.name("issue_occur_when");
	By download=By.cssSelector("input.test-two:nth-child(1)");
	By upload=By.cssSelector("input.form-control:nth-child(3)");
	By ping=By.cssSelector("input.form-control:nth-child(5)");
	By hour = By.cssSelector("input.test-three:nth-child(1)");
	By min=By.cssSelector("input.form-control:nth-child(2)");
	By tv=By.cssSelector("div.device-one:nth-child(2) > input:nth-child(1)");
	By video=By.cssSelector("div.device-one:nth-child(6) > input:nth-child(1)");
	By surfing=By.cssSelector("div.device-one:nth-child(14) > input:nth-child(1)");
	By next=By.cssSelector("button.btn:nth-child(1)");
	public SpeedIssue(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement issue() {
		
		return driver.findElement(issue);
		
	}
public  WebElement numberOfTimes() {
		
		return driver.findElement(numberOfTimes);
		
	}
public  WebElement download() {
	
	return driver.findElement(download);
	
}
public  WebElement ping() {
	
	return driver.findElement(ping);
	
}
public  WebElement upload() {
	
	return driver.findElement(upload);
	
}
public  WebElement hour() {
	
	return driver.findElement(hour);
	
}
public  WebElement min() {
	
	return driver.findElement(min);
	
}
public  WebElement tv() {
	
	return driver.findElement(tv);
	
}
public  WebElement video() {
	
	return driver.findElement(video);
	
}
public  WebElement surfing() {
	
	return driver.findElement(surfing);
	
}
public  WebElement next() {
	
	return driver.findElement(next);
	
}
}
