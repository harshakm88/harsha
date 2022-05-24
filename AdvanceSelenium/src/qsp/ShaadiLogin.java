package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShaadiLogin {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.shaadi.com/");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("harsha");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("hars");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(5000);
	driver.close();

	}

}
