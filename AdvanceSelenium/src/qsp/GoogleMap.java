package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMap {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.google.co.in/maps");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//img[@class='xoLGzf-T3iPGc-icon']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("Chikmagalur");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//img[@data-tooltip=\"Driving\"]")).click();
    Thread.sleep(3000);
    
	}

}
