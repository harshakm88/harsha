package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Facebookurl {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Callme Karna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("********");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String url =driver.getCurrentUrl();
		System.out.println("url");
		if (url.contains("book")) 
		{
			System.out.println("test case is pass");
			}
		else
		{
			System.out.println("test case fail");
			
		}
		driver.close();

	}

}
