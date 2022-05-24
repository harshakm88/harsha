package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='iFrame']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame("globalSqa");
	Thread.sleep(2000);
	driver.findElement(By.id("s")).sendKeys("selenium");
	Thread.sleep(2000);
	driver.close();
	}

}
