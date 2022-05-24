package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookClear {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
    ele.sendKeys("hello");
    Thread.sleep(3000);
    WebElement ele1 = driver.findElement(By.xpath("//input[@id='pass']"));
    ele1.sendKeys("hii");
    ele.sendKeys(Keys.CONTROL+"a");
    ele.sendKeys(Keys.DELETE);
    Thread.sleep(3000);
    ele1.sendKeys(Keys.CONTROL+"a");
    ele1.sendKeys("hello");
    Thread.sleep(3000);
    driver.close();
    
	}

}
