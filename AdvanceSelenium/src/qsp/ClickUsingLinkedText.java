package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingLinkedText
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");	
     WebDriver driver= new ChromeDriver();
     driver.get("file:///C:/Users/Harsha/Desktop/ha.html");
     Thread.sleep(5000);
     driver.findElement(By.linkText("amazon")).click();
     Thread.sleep(5000);
     
	}

}
