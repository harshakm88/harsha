
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScriptBasic {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("lead");
		Thread.sleep(6000);
		driver.findElement(By.name("pass")).sendKeys("wrong");
		Thread.sleep(6000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
		driver.close();

	}

}
