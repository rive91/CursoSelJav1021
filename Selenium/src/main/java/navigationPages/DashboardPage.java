package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicializando los pageObjects con PageFactory
										//THIS es un keyword de java con el que le indicamos que en esta misma clase vamos a inicializar los metodos
	}
	
	//WebElements
	@FindBy (id="welcome")
	private WebElement welcomeDrpDwn;
	@FindBy (xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logout;
	@FindBy (id="menu_directory_viewDirectory")
	private WebElement menuDirectory;

	public void logout() {
		welcomeDrpDwn.click();
		logout.click();
	}
	
	public void menuDirectory() {
		menuDirectory.click();
	}
}
