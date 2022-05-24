package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.twitter.com");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-1cvl2hr r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input]")).sendKeys("8494935666");
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	//Thread.sleep(3000);
	
	}

}
