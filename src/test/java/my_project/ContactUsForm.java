package my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactUsForm extends BaseTest{

	@Test
	public void form() throws Exception {
		
		driver.findElement(By.xpath("//*[@class='main-header-grid']//div[@class='header-desktop-buttons hide-on-mobile']//a[text()='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Resident Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='View the Website']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,4000);");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Ajay Mundkar");
		driver.findElement(By.id("email")).sendKeys("Ajay.mundkar05@gmail.com");
		driver.findElement(By.id("property_name")).sendKeys("Elite");
        driver.findElement(By.id("property_url")).sendKeys("https://www.Elite.com/");
		driver.findElement(By.id("message")).sendKeys("This is an apartment");
	}
}
