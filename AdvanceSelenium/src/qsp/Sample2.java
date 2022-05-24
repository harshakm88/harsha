package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException
	{
	       System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://www.shaadi.com");
	       Thread.sleep(5000);
	       driver.close();
	}

}
