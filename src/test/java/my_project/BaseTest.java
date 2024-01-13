package my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.entrata.com/");
		WebElement acceptCookiesButton = driver.findElement(By.id("rcc-confirm-button"));
		if (acceptCookiesButton.isDisplayed() && acceptCookiesButton.isEnabled()) {
            acceptCookiesButton.click();
        }
	}
	

	@AfterClass
	public void tearDown() {
		if (driver != null) {
     	driver.quit();
		}

	}

}
