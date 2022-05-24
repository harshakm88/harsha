package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://snowcityblr.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Contact Us' and @ class='nav-top-link']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Directions']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("kadur");
	driver.close();

	}

}
