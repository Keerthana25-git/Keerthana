package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComplaintPageTwo {
	
	public WebDriver driver;
	
	By emotion=By.xpath("(//label[@class='checkbox-text clearfix radio-label'])[4]");
	By next=By.xpath("//div[@class='container pagenav-container']");

	public ComplaintPageTwo(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement chooseEmotion() {
		
		return driver.findElement(emotion);
		
	}
public  WebElement next() {
		
		return driver.findElement(next);
		
	}
}
