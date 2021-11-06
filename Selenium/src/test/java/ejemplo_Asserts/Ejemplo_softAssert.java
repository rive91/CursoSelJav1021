package ejemplo_Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_softAssert {
	
  SoftAssert softAssert = new SoftAssert();
  @Test
  public void softAssertEquals() {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maximizar Ventana

		String actualTitle = driver.getTitle();
		String expectedTile = "OrangeHRM";
		String badTitle = "sakdju";
		
		softAssert.assertEquals(actualTitle,badTitle);
		softAssert.assertEquals(actualTitle, expectedTile);
		softAssert.assertAll();
		
			  
  }
}
