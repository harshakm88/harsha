package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Harsha/Desktop/Dreameleven.html");
    Thread.sleep(2000);
    WebElement ele = driver.findElement(By.xpath("//select[@id='Best Eleven']"));
    Thread.sleep(2000);
    Select sel =new Select(ele);
    sel.selectByIndex(2);
    Thread.sleep(2000);
    sel.selectByValue("D");
    Thread.sleep(2000);
    sel.selectByVisibleText("Maxii");
    Thread.sleep(2000);
   // sel.deselectAll();
    Thread.sleep(2000);
    //driver.close();
    

	}

}
