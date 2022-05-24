
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingLinkedTextFacebok
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");	
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(5000);
     driver.findElement(By.linkText("Services")).click();
     Thread.sleep(5000);
     
	}

}
