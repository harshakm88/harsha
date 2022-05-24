package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(2000);
        WebElement src1 = driver.findElement(By.id("box1"));
        Thread.sleep(100);
        WebElement dst1 = driver.findElement(By.id("box101"));
        Thread.sleep(100);
        Actions act = new Actions(driver);
        act.dragAndDrop(src1, dst1).perform();
        //Thread.sleep(2000);
        WebElement src2 = driver.findElement(By.id("box2"));
       // Thread.sleep(2000);
        WebElement dst2 = driver.findElement(By.id("box102"));
       // Thread.sleep(2000);
        Actions act2 = new Actions(driver);
        act2.dragAndDrop(src2, dst2).perform();
        //Thread.sleep(2000);
        WebElement src3 = driver.findElement(By.id("box3"));
        //Thread.sleep(2000);
        WebElement dst3 = driver.findElement(By.id("box103"));
        //Thread.sleep(2000);
        Actions act3 = new Actions(driver);
        act3.dragAndDrop(src3, dst3).perform();
        //Thread.sleep(2000);
        WebElement src4 = driver.findElement(By.id("box4"));
        //Thread.sleep(2000);
        WebElement dst4 = driver.findElement(By.id("box104"));
       // Thread.sleep(2000);
        Actions act4 = new Actions(driver);
        act4.dragAndDrop(src4, dst4).perform();
        //Thread.sleep(2000);
        WebElement src5 = driver.findElement(By.id("box5"));
       // Thread.sleep(2000);
        WebElement dst5 = driver.findElement(By.id("box105"));
        //Thread.sleep(2000);
        Actions act5 = new Actions(driver);
        act5.dragAndDrop(src5, dst5).perform();
        //Thread.sleep(2000);
        WebElement src6 = driver.findElement(By.id("box6"));
        //Thread.sleep(2000);
        WebElement dst6 = driver.findElement(By.id("box106"));
        //Thread.sleep(2000);
        Actions act6 = new Actions(driver);
        act6.dragAndDrop(src6, dst6).perform();
        //Thread.sleep(2000);
        WebElement src7 = driver.findElement(By.id("box7"));
        //Thread.sleep(2000);
        WebElement dst7 = driver.findElement(By.id("box107"));
        //Thread.sleep(2000);
        Actions act7 = new Actions(driver);
        act7.dragAndDrop(src7, dst7).perform();
        //Thread.sleep(2000);
	}

}
