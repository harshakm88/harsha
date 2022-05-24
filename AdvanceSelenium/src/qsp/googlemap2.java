package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlemap2 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/maps");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@src='//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png']")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Chikmagalure");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@class='nhb85d-BIqFsb'])[3]")).click();
    Thread.sleep(3000);
	}

}
