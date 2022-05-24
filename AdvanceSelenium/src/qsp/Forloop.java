package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forloop {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	List<WebElement> ele = driver.findElements(By.xpath("a"));
	Thread.sleep(2000);
	for (WebElement texts : ele) 
	{
		String text = texts.getText();
		System.out.println(text);
	}

	}

}
