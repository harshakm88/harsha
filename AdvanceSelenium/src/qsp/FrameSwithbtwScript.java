package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameSwithbtwScript {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Harsha/Desktop/mainpage.html");
	WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(ele);
	}

}
