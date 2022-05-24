package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookMaleRadiobutton 
    {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//label[.='Male']"));
		ele1.click();
		if (ele1.isSelected()) 
		{
			System.out.println("MALE IS SELECTED");
		}
		else
		{
			System.out.println("IS NOT SELECTED");
		}
		driver.close();
	 	

	}

}
