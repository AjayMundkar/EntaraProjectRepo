package my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class RequestDemo extends BaseTest {
	public void demoRequest() throws Exception {
		

		WebElement Button_DemoReq = driver.findElement(
		By.xpath("//*[normalize-space(.)='Enabling efficient operations']/parent::*[@class='hero-left']//a"));
		Button_DemoReq.click();
		Thread.sleep(2000);

		driver.findElement(By.id("FirstName")).sendKeys("Ajay");
		driver.findElement(By.id("LastName")).sendKeys("Mundkar");
		driver.findElement(By.id("Email")).sendKeys("Ajay.mundkar05@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Amdocs");
		driver.findElement(By.id("Phone")).sendKeys("7972738331");
		driver.findElement(By.id("Title")).sendKeys("QA");

	}

}
