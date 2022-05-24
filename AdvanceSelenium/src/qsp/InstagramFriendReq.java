package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramFriendReq {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("8867841211");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("7892309626");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@//input[@type='text']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Search Input']")).sendKeys("iamsandeep17");
	Thread.sleep(3000);
	}

}
