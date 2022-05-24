package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://122.166.192.191:9004/en/login");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahul");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul@123");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.xpath("//span[.='Customers']")).click();
	driver.findElement(By.xpath("//a[@href='/en/admin/customer/create']")).click();
	driver.findElement(By.id("customer_edit_form_name")).sendKeys("karunamayi");
	driver.findElement(By.id("customer_edit_form_address")).sendKeys("Shiraaaaa");
	driver.findElement(By.xpath("//button[.='Save' and @type='submit' ]")).click();
	
	
	//driver.close();
	

	}

}
