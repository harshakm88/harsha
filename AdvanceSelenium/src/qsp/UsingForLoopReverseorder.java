package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingForLoopReverseorder {

	private static int i;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		for (int i=ele.size()-1;i>=0;i--);
		{
			WebElement elem= ele.get(i); 
			String text = elem.getAttribute("href");
			System.out.println(text);
		}
      driver.close();
	}

}
