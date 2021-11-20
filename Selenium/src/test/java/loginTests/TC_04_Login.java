package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import globalVariables.VariablesGlobales;
import navigationPages.LoginPage;
import setupDriver.DriverSetup;

public class TC_04_Login {
	// Declarar e incializar un objeto del tipo webdriver para usarlo en nuestro TC
	WebDriver driver = DriverSetup.setupDriver();

	// Login Page Object
	LoginPage login = new LoginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
	}
	
	@Test
	@Parameters({"user","password"})
	public void TC_04(String user,String password) {
		login.login(user, password);
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
