package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe/");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("hello");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("hiiiii");
	Thread.sleep(3000);
    driver.findElement(By.cssSelector("button._2HKlqd:nth-child(1)")).click();
    Thread.sleep(3000);
    driver.close();
	}

}
