package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProduct {
	
	public WebDriver driver;
	
	By product=By.xpath("//label[@class='checkbox-text clearfix radio-label']");
	By next=By.xpath("//button[@class='btn btn-pagenav btn-block']");
	
	public SelectProduct(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
public void checkBtn(WebDriver driver,String names) {
		
		List<WebElement> items=driver.findElements(By.cssSelector("div.check-list"));
		
		for (int i = 0; i < items.size(); i++) {
			
			
			String s=items.get(i).getText();
			
			if(s.contains(names))
			{
			
				driver.findElements(product).get(i).click();
				break;
			}
			
		}
		
	}

public WebElement next()
{
	return driver.findElement(next);
}
}
