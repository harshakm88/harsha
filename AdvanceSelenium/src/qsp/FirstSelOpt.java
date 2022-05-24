package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelOpt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Harsha/Desktop/Dreameleven.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Best Eleven']"));
		Select sel = new Select(ele);
		Thread.sleep(2000);
		sel.selectByIndex(0);
		sel.selectByValue("B");
		sel.selectByVisibleText("DK");
		Thread.sleep(2000);
		WebElement option = sel.getFirstSelectedOption();
		String text = option.getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
}}
