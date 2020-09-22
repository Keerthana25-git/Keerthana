package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IssueResponsibleCompanies {
	
public WebDriver driver;
	
By multipleCompanies=By.xpath("//label[text()='My issues relate to multiple companies']");
	By organizationOne=By.cssSelector(".autocomplete-1");
	By organizationTwo=By.cssSelector(".autocomplete-2");
	By clickNext=By.xpath("//button[@class='btn btn-pagenav btn-block organisation-button']");

	public IssueResponsibleCompanies(WebDriver driver) {
		
		this.driver=driver;
	}


public  WebElement multipleCompanies() {
		
	
		return driver.findElement(multipleCompanies);
		
	}

	public  WebElement organizationOne() {
		
		return driver.findElement(organizationOne);
		
	}

	public  WebElement organizationTwo() {
		
		return driver.findElement(organizationTwo);
		
	}
	
	public  WebElement clickNext() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-all")));
		return driver.findElement(clickNext);
		
		
		
	}
}
