package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datadriven2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream  fis = new FileInputStream("./excel/datadriven.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet2");
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	List<WebElement> ele = driver.findElements(By.xpath("//a"));
	for (int i = 0; i < ele.size(); i++) 
	{
	Row r = sh.createRow(i);
	Cell c = r.createCell(0);
	c.setCellValue(ele.get(i).getAttribute("href"));
	}
	FileOutputStream fout = new FileOutputStream("./excel/datadriven.xlsx");
	book.write(fout);
	
	
	
	

	}

}
