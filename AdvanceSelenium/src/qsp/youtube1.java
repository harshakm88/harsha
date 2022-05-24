package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf 2 kannada trailer");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//a[@id='video-title' and @title='KGF Chapter 2 Trailer | Kannada |Yash|Sanjay Dutt|Raveena|Srinidhi|Prashanth Neel|Vijay Kiragandur'and @href='/watch?v=jQsE85cI384']")).click();
        Thread.sleep(9000);
	}

}
