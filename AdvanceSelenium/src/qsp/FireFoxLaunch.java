package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args)
	{
	  String key ="webdriver.gecko.driver";
	  String value = "./Softwares/geckodriver.exe";
	  System.setProperty(key, value);
	  
	  FirefoxDriver driver=new FirefoxDriver();

		
	}

}
