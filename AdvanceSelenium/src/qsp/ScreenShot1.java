package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https:www.amazon.in");
	TakesScreenshot tss = (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst = new File("E:// defect.jpeg");
	FileHandler.copy(src, dst);

	}

}
