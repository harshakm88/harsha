package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("aaaaa");
		driver.findElement(By.xpath("//input[@tyte='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
