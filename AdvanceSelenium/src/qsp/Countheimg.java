package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Countheimg {

	

	

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.amazon.in");
    Thread.sleep(2000);
    WebElement ele = driver.findElement(By.xpath("//img"));
     Dimension count = ele.getSize();
    System.out.println(count);
    
    Thread.sleep(2000);

	}

}
