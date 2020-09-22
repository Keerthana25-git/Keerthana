package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptinalDetails {

	public WebDriver driver;
	
	By effectOfIssue=By.id("impact-field");
	By specifyIssue=By.xpath("//input[@name='other-impact']");
	By resolution=By.id("outcome-field1");
	By specifyResolution=By.xpath("//input[@name='other-outcome1']");
	By secondPriority=By.id("outcome-field2");
	By thirdPriority=By.id("outcome-field3");
	By numberOfAtttempts=By.id("contactattempts-field");
	By yourExperience=By.id("experience-field");
	By caseNum=By.id("referencenumber-field");
	By clientNum=By.id("accountnumber-field");
	By fileUpload=By.id("upload-selector");
	By comment=By.xpath("//textarea[@id='comments-field']");
	By next=By.xpath("//button[@class='btn btn-pagenav btn-block']");
	
public OptinalDetails(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement effectOfIssue()
	{
		return driver.findElement(effectOfIssue);
	}
	public WebElement specifyIssue()
	{
		return driver.findElement(specifyIssue);
	}
	public WebElement resolution()
	{
		return driver.findElement(resolution);
	}
	public WebElement specifyResolution()
	{
		return driver.findElement(specifyResolution);
	}
	public WebElement secondPriority()
	{
		return driver.findElement(secondPriority);
	}
	public WebElement thirdPriority()
	{
		return driver.findElement(thirdPriority);
	}
	
	public WebElement numberOfAtttempts()
	{
		return driver.findElement(numberOfAtttempts);
	}
	public WebElement yourExperience()
	{
		return driver.findElement(yourExperience);
	}
	public WebElement caseNum()
	{
		return driver.findElement(caseNum);
	}
	public WebElement fileUpload()
	{
		return driver.findElement(fileUpload);
	}
	public WebElement comment()
	{
		return driver.findElement(comment);
	}
	public WebElement clientNum()
	{
		return driver.findElement(clientNum);
	}
	public WebElement next()
	{
		return driver.findElement(next);
	}
}
