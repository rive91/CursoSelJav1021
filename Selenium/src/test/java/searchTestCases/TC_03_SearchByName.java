package searchTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globalVariables.VariablesGlobales;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;
import setupDriver.DriverSetup;

public class TC_03_SearchByName {
	// Declarar e incializar un objeto del tipo webdriver para usarlo en nuestro TC
		WebDriver driver = DriverSetup.setupDriver();

		// Login Page Object
		LoginPage login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		DirectoryPage directory = new DirectoryPage(driver);

		@BeforeTest
		public void startWebDriver() {
			driver.get(VariablesGlobales.HOME_PAGE);
		}
		
		@Test
		public void TC_03() {
			login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PWD_ADMIN);
			
			dashboard.menuDirectory();
			
			directory.searcByName("Nathan");
			
			directory.clickSearchBtn();
			
			boolean isUserPresent = directory.verifySearchNameResult("Nathan");
			Assert.assertTrue(isUserPresent);
			
		}
		
		@AfterTest
		public void closeDriver() {
			driver.quit();
		}
}
