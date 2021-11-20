package navigationPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import globalVariables.VariablesGlobales;

public class CommonMethods {
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		//Tomar el screenshot de la pagina sin formato
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		//Establecemos la ruta donde se va a guardar nuestro screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		try {
			FileHandler.createDir(new File(screenshotPath));
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getJSONValue (String jsonFileObj, String jsonKey) {
		
		try {
			//JsonData
			InputStream inputStream = new FileInputStream(VariablesGlobales.TEST_DATA_PATH + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			//Get Data
			String jsonValue = jsonObject.getJSONObject(jsonFileObj).getString(jsonKey);
			return jsonValue;
		} catch (FileNotFoundException e) {
			Assert.fail("JSON file not found");
			return null;
		}
	}
	
	public static String getCellData(String excelName, int row, int column) {
		
		try {
			//Read file
			FileInputStream fis = new FileInputStream(VariablesGlobales.TEST_DATA_PATH + excelName + ".xlsx");
			
			//Contructs an XSSFWorkBook objet
			Workbook wb = new XSSFWorkbook(fis);//Obteniendo el archivo .xlsx
			Sheet sheet = wb.getSheetAt(0);//Lee la hoja 0
			Row rowObj = sheet.getRow(row);//Indica la fila
			Cell cell = rowObj.getCell(column);//Indica la column apartir de la fila
			String value = cell.getStringCellValue();
			return value;
			
		} catch (FileNotFoundException e) {
			Assert.fail("Archivo no encontrado");
			return null;
		} catch (IOException e) {
			Assert.fail("Archivo no se puede leer");
			return null;
		}
	}

}
