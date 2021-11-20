package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globalVariables.VariablesGlobales;
import navigationPages.CommonMethods;
import navigationPages.LoginPage;
import setupDriver.DriverSetup;

public class TC_06_Login {
	// Declarar e incializar un objeto del tipo webdriver para usarlo en nuestro TC
	WebDriver driver = DriverSetup.setupDriver();

	// Login Page Object
	LoginPage login = new LoginPage(driver);
	
	String user = CommonMethods.getCellData("TC_06", 1, 0);
	String password = CommonMethods.getCellData("TC_06", 1, 1);

	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
	}
	
	@Test
	public void TC_05() {
		login.login(user,password);
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_06_Login");
		driver.quit();
	}
}
