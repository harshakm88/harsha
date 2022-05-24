package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipcartCart {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi mobile");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//img[@alt='REDMI 9i Sport (Carbon Black, 64 GB)' and @ src='https://rukminim2.flixcart.com/image/312/312/ku04o7k0/mobile/p/8/u/9i-sport-mzb0a5iin-redmi-original-imag785qegs5ghyy.jpeg?q=70']")).click();
    Thread.sleep(3000);
   // driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    //Thread.sleep(3000);
	}

}
