
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickUsingId {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Harsha/Desktop/harsha.html");
		Thread.sleep(5000);
		driver.findElement(By.id("a1")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
