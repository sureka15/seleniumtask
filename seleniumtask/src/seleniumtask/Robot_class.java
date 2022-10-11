package seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {
public static WebDriver driver;
public static void robotaction() throws AWTException
{
	driver.get("https://www.google.com/");
	WebElement gmail = driver.findElement(By.xpath("//a[.='Gmail' and @class='gb_d']"));
	Actions a = new Actions(driver);
	a.contextClick(gmail).build().perform();
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String parent = driver.getWindowHandle();
	driver.switchTo().window(parent);
	
	
	
}

	public static void main(String[] args) throws AWTException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumtask\\driver\\chromedriver1.exe");
		driver=new ChromeDriver();
		robotaction();
		
	}

}
