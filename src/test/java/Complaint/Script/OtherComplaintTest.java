package Complaint.Script;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.AddressPage;
import pageobjects.ChooseComplaint;
import pageobjects.CompanyName;
import pageobjects.ComplaintPageOne;
import pageobjects.ComplaintPageTwo;
import pageobjects.OptinalDetails;
import pageobjects.ResponsePage;



public class OtherComplaintTest extends BaseTest {
	
	
	public static Logger log=LogManager.getLogger(OtherComplaintTest.class.getName());
	@Test
	public void baseNavigator() throws IOException, InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		Assert.assertEquals("Handle My Complaint - Home", driver.getTitle());
		pageobjects.StartPage StartPage= new pageobjects.StartPage(driver);
		StartPage.clickGuest().click();
		log.info("startpage is working fine");
		
		ChooseComplaint ChooseComplaint= new ChooseComplaint(driver);
		ChooseComplaint.complaint().click();
		
		ComplaintPageOne ComplaintPageOne= new ComplaintPageOne(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(ComplaintPageOne.productName()));
		
		
		ComplaintPageOne.productName().sendKeys("Refridgerator");
		ComplaintPageOne.productIssue().sendKeys("fridge");
		
		
		js.executeScript("window.scrollBy(0,1000)"); 
			
		//wait.until(ExpectedConditions.elementToBeClickable(ComplaintPageOne.fileUpload()));
		 
		 
		 
		 File file = new File("eclipse_update_120.jpg");
		 ComplaintPageOne.fileUpload().sendKeys(file.getAbsolutePath());
		 Thread.sleep(5000);
		 ComplaintPageOne.fileUpload().sendKeys(file.getAbsolutePath());
		
		 ComplaintPageOne.detailBox().sendKeys("so i purchased fridge in 2019 and now its stopped working properly.The company says it wont refund the fridge");
		 ComplaintPageOne.clickSubmit().click();
		 
		 
		 ComplaintPageTwo ComplaintPageTwo= new ComplaintPageTwo(driver);
		 Assert.assertEquals("Handle My Complaint", driver.getTitle());
		 ComplaintPageTwo.chooseEmotion().click();
		 ComplaintPageTwo.next().click();
		
		 AddressPage AddressPage=new AddressPage(driver);
		 AddressPage.address().sendKeys("67 View Street");
		 AddressPage.town().sendKeys("Woolahra");
		 AddressPage.postCode().sendKeys("2025");
		Select state = new Select(AddressPage.selectState());
		state.selectByVisibleText("NSW");
		AddressPage.clickNext().click();
		
		CompanyName CompanyName=new CompanyName(driver);
		CompanyName.organizationname().sendKeys("fridge");
		CompanyName.organizationmail().sendKeys("fridge@gmail.com");
		CompanyName.clickNext().click();
		
		OptinalDetails OptionalDetails=new OptinalDetails(driver);
		Assert.assertEquals("Handle My Complaint", driver.getTitle());
		Select issue = new Select(OptionalDetails.effectOfIssue());
		issue.selectByVisibleText("Other");
		OptionalDetails.specifyIssue().sendKeys("Lost Icecreams");
		Select resolution = new Select(OptionalDetails.resolution());
		resolution.selectByVisibleText("Other");
		OptionalDetails.specifyResolution().sendKeys("Replacement iceCream");
		
		Select secondPriority = new Select(OptionalDetails.secondPriority());
		 secondPriority.selectByVisibleText("Refund");
		 
		 Select thirdPriority = new Select(OptionalDetails.thirdPriority());
		 thirdPriority.selectByVisibleText("Financial compensation");
		 
		 Select numberOfAtttempts = new Select(OptionalDetails.numberOfAtttempts());
		 numberOfAtttempts.selectByVisibleText("This is the first complaint");
		 
		 Select yourExperience = new Select(OptionalDetails.yourExperience());
		 yourExperience.selectByVisibleText("Unsure who to contact");
		 
		 OptionalDetails.caseNum().sendKeys("jjhjkh");
		 OptionalDetails.clientNum().sendKeys("12345");
		 
		 ComplaintPageOne.fileUpload().sendKeys(file.getAbsolutePath());
		 
		 OptionalDetails.comment().sendKeys("i really love ice cream so i have been really upset about this complaint");
		 
		 
		 OptionalDetails.next().click();
		
		 
		 ResponsePage ResponsePage=new ResponsePage(driver);
		 Assert.assertEquals("Handle My Complaint", driver.getTitle());
		 ResponsePage.onBehalf().click();
		 
	       Select contacttitle = new Select(ResponsePage.contactTitle());
      contacttitle.selectByVisibleText("Mr");
      
      ResponsePage.contactFirstname().sendKeys("dummy");
      ResponsePage.contactLastname().sendKeys("data");
      ResponsePage.contactEmail().sendKeys("dummykeer36@gmail.com");
       
       Thread.sleep(1000);
       
       
       js.executeScript("window.scrollBy(0,1000)");
      
		wait.until(ExpectedConditions.elementToBeClickable(ResponsePage.response2()));
		
		ResponsePage.response2().click();
		ResponsePage.response3().click();
		
		ResponsePage.submit().click();
       
       
       
		
	}

}
