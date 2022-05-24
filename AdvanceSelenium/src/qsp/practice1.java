package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class practice1 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf2 kannada trailer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='button' and @aria-label='like this video along with 802,655 other people']")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//button[@id='button'and @aria-pressed='false'and @class='style-scope yt-icon-button']")).click();
	//	Thread.sleep(100000);

	}

}
