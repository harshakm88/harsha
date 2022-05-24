
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingLinkedTextFacebook {

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");	
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(5000);
     driver.findElement(By.linkText("Careers")).click();
     Thread.sleep(5000);
     
	}

}
