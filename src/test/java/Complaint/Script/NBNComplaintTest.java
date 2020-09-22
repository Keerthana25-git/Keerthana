package Complaint.Script;



import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AddressPage;
import pageobjects.ChooseComplaint1;
import pageobjects.CredentialsPage;
import pageobjects.IssueResponsibleCompanies;
import pageobjects.LoginPage;
import pageobjects.NBNSetup;
import pageobjects.OptionalDetailsPage;
import pageobjects.PromisesPage;
import pageobjects.SelectProduct;
import pageobjects.SpeedIssue;
import pageobjects.SubmitComplaint;



public class NBNComplaintTest extends BaseTest {
	
	public static Logger log=LogManager.getLogger(NBNComplaintTest.class.getName());
	@Test
	public void baseNavigator() throws IOException, InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		Assert.assertEquals("Handle My Complaint - Home", driver.getTitle());
		LoginPage loginpage=new LoginPage(driver);
		
		//Assert.assertEquals(loginpage.login().isDisplayed(),true);
		
		loginpage.login().click();
		log.info("Login button is clicked");	
		CredentialsPage CredentialsPage=new CredentialsPage(driver);
		CredentialsPage.email().sendKeys("r.keerthana2596@gmail.com");
		CredentialsPage.password().sendKeys("25Keerthy96");
		CredentialsPage.loginButton().click();
		
		SubmitComplaint SubmitComplaint = new SubmitComplaint(driver);
		SubmitComplaint.submit().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		ChooseComplaint1 ChooseComplaint1 = new ChooseComplaint1(driver);
		wait.until(ExpectedConditions.elementToBeClickable(ChooseComplaint1.complaint()));
		ChooseComplaint1.complaint().click();
		
		SelectProduct SelectProduct = new SelectProduct(driver);
		
		Assert.assertEquals("Handle My Complaint", driver.getTitle());
		System.out.println(driver.getTitle());
		SelectProduct.checkBtn(driver, "Internet");
		SelectProduct.next().click();
		
		SelectProduct.checkBtn(driver, "NBN - Personal - Postpaid");
		SelectProduct.next().click();
		
		SelectProduct.checkBtn(driver, "Speed / Dropout");
		SelectProduct.next().click();
		
		SelectProduct.checkBtn(driver, "Slow speed - watching video / TV is interrupted (eg buffering)");
		js.executeScript("window.scrollBy(0,1000)");
		SelectProduct.checkBtn(driver, "Dropouts - with TV / Video streaming (e.g Netflix)");
		SelectProduct.next().click();
		
		SelectProduct.checkBtn(driver, "Disappointed");
		SelectProduct.next().click();
		
		AddressPage ap=new AddressPage(driver);
		ap.address().sendKeys("67 View Street");
		ap.town().sendKeys("Woolahra");
		ap.postCode().sendKeys("2025");
		Select state = new Select(ap.selectState());
		state.selectByVisibleText("NSW");
		ap.clickNext().click();
		
		IssueResponsibleCompanies IssueResponsibleCompanies=new IssueResponsibleCompanies(driver);
		Assert.assertEquals("Handle My Complaint", driver.getTitle());
		IssueResponsibleCompanies.multipleCompanies().click();
		IssueResponsibleCompanies.organizationOne().sendKeys("Telstra");
		IssueResponsibleCompanies.organizationTwo().sendKeys("Optus");
		IssueResponsibleCompanies.multipleCompanies().click();
		IssueResponsibleCompanies.multipleCompanies().click();
		Thread.sleep(5000);
		IssueResponsibleCompanies.clickNext().click();
		
		SpeedIssue SpeedIssue=new SpeedIssue(driver);
		Select issue = new Select(SpeedIssue.issue());
		issue.selectByVisibleText("Busy Period (7pm - 11pm)");
		
		Select numberOfTimes = new Select(SpeedIssue.numberOfTimes());
		numberOfTimes.selectByVisibleText("5-9");
		SpeedIssue.download().sendKeys("100");
		SpeedIssue.upload().sendKeys("100");
		SpeedIssue.ping().sendKeys("1");
		SpeedIssue.hour().sendKeys("10");
		SpeedIssue.min().sendKeys("10");
		SpeedIssue.tv().sendKeys("3");
		SpeedIssue.video().sendKeys("1");
		SpeedIssue.surfing().sendKeys("1");
		SpeedIssue.next().click();
		
		PromisesPage PromisesPage=new PromisesPage(driver);
		Assert.assertEquals("Handle My Complaint", driver.getTitle());
		Select isModemSupplied = new Select(PromisesPage.isModemSupplied());
		isModemSupplied.selectByVisibleText("Yes");
		Select soldOnSignUp0 = new Select(PromisesPage.soldOnSignUp0());
		soldOnSignUp0.selectByVisibleText("Keep my number");
		Select soldOnSignUp1 = new Select(PromisesPage.soldOnSignUp1());
		soldOnSignUp1.selectByVisibleText("Someone would contact me");
		Select soldOnSignUp2 = new Select(PromisesPage.soldOnSignUp2());
		soldOnSignUp2.selectByVisibleText("Other");
		PromisesPage.soldItem().sendKeys("Exceptional customer service");
		Select soldOnSignUp3 = new Select(PromisesPage.soldOnSignUp3());
		soldOnSignUp3.selectByVisibleText("Bundle with other services");
		Select soldOnSignUp4 = new Select(PromisesPage.soldOnSignUp4());
		soldOnSignUp4.selectByVisibleText("TV plan / streaming service");
		Select promise0 = new Select(PromisesPage.promise0());
		promise0.selectByVisibleText("Someone would contact me");
		Select promise1 = new Select(PromisesPage.promise1());
		promise1.selectByVisibleText("Speed upgrade");
		Select promise2 = new Select(PromisesPage.promise2());
		promise2.selectByVisibleText("Free data");
		Select promise3 = new Select(PromisesPage.promise3());
		promise3.selectByVisibleText("Technician appointment time");
		js.executeScript("window.scrollBy(0,1000)");
		Select promise4 = new Select(PromisesPage.promise4());
		promise4.selectByVisibleText("Other");
		PromisesPage.apology().sendKeys("Apology");
		js.executeScript("window.scrollBy(0,1000)");
		Select service0 = new Select(PromisesPage.service0());
		service0.selectByVisibleText("Priority Assistance");
		js.executeScript("window.scrollBy(0,1000)");
		Select service1 = new Select(PromisesPage.service1());
		service1.selectByVisibleText("Medical alarm");
		js.executeScript("window.scrollBy(0,1000)");
		Select service2 = new Select(PromisesPage.service2());
		service2.selectByVisibleText("Low income assistance");
		//Select Next
		js.executeScript("window.scrollBy(0,1000)");
		PromisesPage.next().click();
		
		
		NBNSetup NBNSetup=new NBNSetup(driver);
		Select plan = new Select(NBNSetup.plan());
		plan.selectByVisibleText("25/5");
		Select technology = new Select(NBNSetup.technology());
		technology.selectByVisibleText("Fibre to the node (FTTN)");
		Select day = new Select(NBNSetup.day());
		day.selectByVisibleText("10");
		Select hour = new Select(NBNSetup.hour());
		hour.selectByVisibleText("3");
		Select minute = new Select(NBNSetup.minute());
		minute.selectByVisibleText("52");
		
		NBNSetup.signupDate().sendKeys("01-05-2020");
		NBNSetup.connectedDate().sendKeys("30-05-2020");
		NBNSetup.issueDate().sendKeys("30-05-2020");
		
		
		Select unexpectedone = new Select(NBNSetup.unexpectedOne());
		unexpectedone.selectByVisibleText("Electrician");
		Select unexpectedtwo = new Select(NBNSetup.unexpectedTwo());
		unexpectedtwo.selectByVisibleText("New computer");
		Select unexpectedthree = new Select(NBNSetup.unexpectedThree());
		unexpectedthree.selectByVisibleText("Computer technician");
		
		//Select Next
		NBNSetup.next().click();
		
		
		//optionaldetailspage
		OptionalDetailsPage OptionalDetailsPage=new OptionalDetailsPage(driver);
		
		Select impactfield = new Select(OptionalDetailsPage.impactField());
		impactfield.selectByVisibleText("Caused stress / anxiety");
		Select outcomefield1 = new Select(OptionalDetailsPage.outcomeField1());
		outcomefield1.selectByVisibleText("Issue fixed");
		Select outcomefield2 = new Select(OptionalDetailsPage.outcomeField2());
		outcomefield2.selectByVisibleText("Explanation");
		Select outcomefield3 = new Select(OptionalDetailsPage.outcomeField3());
		outcomefield3.selectByVisibleText("Other");
		js.executeScript("window.scrollBy(0,500)");
		OptionalDetailsPage.FreeData().sendKeys("Free data");
		
		//Contact Attempts
		Select contactAttempt = new Select(OptionalDetailsPage.contactAttemptsField());
		contactAttempt.selectByVisibleText("Three");
		Select experiencefield = new Select(OptionalDetailsPage.experienceField2());
		experiencefield.selectByVisibleText("Untrained staff");
		OptionalDetailsPage.referenceNumberField().sendKeys("1234567");
		OptionalDetailsPage.accountNumberField().sendKeys("abcdef");
		
		
		
		 //Upload File
		 js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(5000);
		 File file = new File("eclipse_update_120.jpg");
		 OptionalDetailsPage.uploadSelector().sendKeys(file.getAbsolutePath());
         //Comment
		 OptionalDetailsPage.comment().sendKeys("Please help with this problem");
		 
         
         //Select Next
		 OptionalDetailsPage.next().click();
         
         //Submit response
         Select contacttitle = new Select(OptionalDetailsPage.contactTitle());
         contacttitle.selectByVisibleText("Mr");
         
         OptionalDetailsPage.contactFirstName().sendKeys("dummy");
         OptionalDetailsPage.contactLastName().sendKeys("name");
        // OptionalDetailsPage.contactEmail().sendKeys("dummykeer36@gmail.com");
         OptionalDetailsPage.submitStep().click();
        
         //ChangeDateOfResponse
         OptionalDetailsPage.date().sendKeys("30/09/2020");
         OptionalDetailsPage.changeDate().click();
        
    
		
		
		
	}

}
