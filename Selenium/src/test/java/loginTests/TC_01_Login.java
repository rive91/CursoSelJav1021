package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globalVariables.VariablesGlobales;
import navigationPages.LoginPage;
import setupDriver.DriverSetup;

public class TC_01_Login {
	// Declarar e incializar un objeto del tipo webdriver para usarlo en nuestro TC
	WebDriver driver = DriverSetup.setupDriver();

	// Login Page Object
	LoginPage login = new LoginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
	}
	
	@Test
	public void TC_01() {
		login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PWD_ADMIN);
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
