package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hotstar {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.hotstar.com/in");
	Thread.sleep(3000);
	

	}

}
