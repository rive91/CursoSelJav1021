package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResolucionEjercio_1 {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();//Maximizar Ventana
		
		//Obteniendo objetos/webelements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		userName.sendKeys("Admin");
		Thread.sleep(500);
		password.sendKeys("admin123");
		Thread.sleep(500);
		btnLogin.click();
		
		WebElement mDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
		mDirectory.click();
		
		WebElement nameTxtBox = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		nameTxtBox.sendKeys("Nathan");
		
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		
		String nameSearchResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]")).getText();
		boolean nameEquals = nameSearchResult.contains("Nathan Elliot");
		
		if(nameEquals) {
			System.out.println("El nombre esperado esta desplegado en la pagina");
		}else {
			System.out.println("ERROR: El nombre esperado NO esta desplegado en la pagina");
		}
		
		driver.close();
	}

}
