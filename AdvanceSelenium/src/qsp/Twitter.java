package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
    Thread.sleep(2000);
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.cssSelector("input[name='text'")).sendKeys("8867841211");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.css-18t94o4:nth-child(6) > div:nth-child(1)")).click();
    Thread.sleep(3000);
    driver.close();
	}
	

}
