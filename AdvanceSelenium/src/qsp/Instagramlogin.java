package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagramlogin {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("callme__karna");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("callme__karna");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div.bkEs3:nth-child(3)")).click();
	Thread.sleep(5000);
	driver.close();
	}

}
