package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("23");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		Select sel1=new Select(ele1);
		sel.selectByValue("12");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		Select sel2=new Select(ele2);
		sel.selectByVisibleText("1997");
		Thread.sleep(2000);
		driver.close();
	}

}
