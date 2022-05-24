package qsp;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrag {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Robot rbt = new Robot();
		for (int i = 0; i < 3; i++) 
		{
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_T);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_T);
			
			
			
			
		}
				

	}

}
