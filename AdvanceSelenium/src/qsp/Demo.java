package qsp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo extends Generic
{
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
	}

}
