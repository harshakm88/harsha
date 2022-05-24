package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		Select sel =new  Select(ele);
		List<WebElement> option = sel.getOptions();
		ArrayList<String> lis= new ArrayList<String>();
		for (WebElement opt :option) 
		{
			String text = opt.getText();
			lis.add(text);

		}
		Collections.sort(lis);
		for (String text : lis) 
		{
			System.out.println(text);	
		}



	}

}
