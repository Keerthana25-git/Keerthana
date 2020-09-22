package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptionalDetailsPage {
	
public WebDriver driver;
	
	By impactfield=By.id("impact-field");
	By outcomefield1=By.id("outcome-field1");
	By outcomefield2=By.id("outcome-field2");
	By outcomefield3=By.id("outcome-field3");
	By Freedata=By.id("other-outcome3");
	By contactattemptsfield = By.id("contactattempts-field");
	By experiencefield2=By.id("experience-field2");
	By referencenumberfield=By.id("referencenumber-field");
	By accountnumberfield=By.id("accountnumber-field");
	By uploadselector=By.id("upload-selector");
	By comment=By.name("comment");
	By next=By.cssSelector("#btn-next");
	By contacttitle=By.id("contact-title");
	By contactfirstname=By.id("contact-firstname");
	By contactlastname=By.id("contact-lastname");
	By contactemail=By.id("contact-email");
	By submitstep=By.id("submit-step");
	By date=By.name("date");
	By changedate=By.id("change-date");
	
	public OptionalDetailsPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public  WebElement impactField() {
		
		return driver.findElement(impactfield);
		
	}
public  WebElement outcomeField1() {
		
		return driver.findElement(outcomefield1);
		
	}
public  WebElement outcomeField2() {
	
	return driver.findElement(outcomefield2);
	
}
public  WebElement outcomeField3() {
	
	return driver.findElement(outcomefield3);
	
}
public  WebElement FreeData() {
	
	return driver.findElement(Freedata);
	
}
public  WebElement contactAttemptsField() {
	
	return driver.findElement(contactattemptsfield);
	
}
public  WebElement experienceField2() {
	
	return driver.findElement(experiencefield2);
	
}
public  WebElement referenceNumberField() {
	
	return driver.findElement(referencenumberfield);
	
}
public  WebElement accountNumberField() {
	
	return driver.findElement(accountnumberfield);
	
}
public  WebElement uploadSelector() {
	
	return driver.findElement(uploadselector);
	
}
public  WebElement comment() {
	
	return driver.findElement(comment);
	
}
public  WebElement next() {
	
	return driver.findElement(next);
	
}
public  WebElement contactTitle() {
	
	return driver.findElement(contacttitle);
	
}
public  WebElement contactFirstName() {
	
	return driver.findElement(contactfirstname);
	
}
public  WebElement contactLastName() {
	
	return driver.findElement(contactlastname);
	
}
public  WebElement contactEmail() {
	
	return driver.findElement(contactemail);
	
}
public  WebElement submitStep() {
	
	return driver.findElement(submitstep);
	
}
public  WebElement date() {
	
	return driver.findElement(date);
	
}
public  WebElement changeDate() {
	
	return driver.findElement(changedate);
	
}

}
