package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath(""))
	
	

	}

}
