package my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPage extends BaseTest {
	@Test
	public void ProductDetailsPage() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement products = driver.findElement(By.xpath("//div[text()='Products']"));
		actions.moveToElement(products).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Products']/parent::*//a[text()='LeadManager']")).click();
		String expectedTitle = "Property Management Software | Entrata";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Sucessfully Navigated to the Lead manager page");
	}
}
