package apache;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class linkmazon 
{
	public static <WebDriver> void main (String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./ldapi/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		System.setProperty("webdriver.firefox.driver","./softwares/chromedriver.exe");
		WebDriver driver = new firefoxDriver();
		driver.get();
		=driver.findElements
	
	

		
	}		
}
