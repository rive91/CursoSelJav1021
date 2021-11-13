package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage {
	
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicializando los pageObjects con PageFactory
										//THIS es un keyword de java con el que le indicamos que en esta misma clase vamos a inicializar los metodos
	}
	
	@FindBy (id="searchDirectory_emp_name_empName")
	private WebElement nameTxt;
	@FindBy (id="searchBtn")
	private WebElement searchBtn;
	@FindBy (xpath="//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement searchResult;
	
	public void searcByName(String name) {
		nameTxt.sendKeys(name);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public boolean verifySearchNameResult(String expectedName) {
		return searchResult.getText().contains(expectedName);
	}

}
