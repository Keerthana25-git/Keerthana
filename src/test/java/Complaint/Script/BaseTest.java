package Complaint.Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public WebDriver driver;

	@BeforeClass
	public void preHook() throws IOException {
		driver = initializeDriver();
		driver.get("https://staging.twohootsapp.com");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	public WebDriver initializeDriver() throws IOException {

		String pathToPropertyFile = System.getProperty("user.dir") + "/src/main/java/properties/data.properties";
		String pathToDriver = System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe";
		System.out.println(pathToDriver + "/n" + pathToPropertyFile);

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(pathToPropertyFile);

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", pathToDriver);
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
}
