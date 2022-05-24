package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowresize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Dimension die = new Dimension(300, 500);
		driver.manage().window().setSize(die);
driver.close();
	}

}
