package qsp;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxselected {

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("file:///C:/Users/Harsha/Desktop/141.html");
     Thread.sleep(3000);
     WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
     ele.click();
     if (ele.isSelected()) 
     {
	  System.out.println("i am selected");	
	 }
     else
     {
    	 System.out.println("i am rejected");
     }
     
     driver.close();

	}

}
