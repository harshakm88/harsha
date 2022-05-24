package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchurl1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
        driver.close();
	}

}
