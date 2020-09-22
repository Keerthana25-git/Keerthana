package pageobjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComplaintPageOne {
	
public WebDriver driver;
	
By product=By.id("item_name");
By issue=By.id("issue_description");
By uploadElement = By.id("upload-selector");
By detailField = By.id("more-details-field");	
By clickNext = By.xpath("//button[@class='btn btn-pagenav btn-block']");

public ComplaintPageOne(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement productName() {
		
		return driver.findElement(product);
		
	}

	public  WebElement productIssue() {
		
		return driver.findElement(issue);
		
	}

	public WebElement fileUpload() {
		
		
		return driver.findElement(uploadElement);
       
     }

	public WebElement detailBox() {
		
		
		return driver.findElement(detailField);
       
     }
	
public WebElement clickSubmit() {
		
		
		return driver.findElement(clickNext);
       
     }
}
