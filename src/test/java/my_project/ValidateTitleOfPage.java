package my_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTitleOfPage extends BaseTest{
	
	@Test
	public void Title() {
		String expectedTitle = "Property Management Software | Entrata";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Property Management Software | Entrata");
	}
}
