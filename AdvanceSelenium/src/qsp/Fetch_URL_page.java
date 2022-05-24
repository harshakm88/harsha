package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_URL_page
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares['/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
