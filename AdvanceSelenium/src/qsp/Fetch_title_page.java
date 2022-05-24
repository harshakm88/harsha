package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_title_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	      String url = driver.getTitle();
driver.close();
	}

}
