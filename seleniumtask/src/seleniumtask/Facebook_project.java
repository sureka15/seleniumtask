package seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_project {
public static WebDriver driver ;
public static void browser_lanch() throws AWTException
{
	driver.get("https://www.facebook.com/");
	WebElement Name_txt = driver.findElement(By.xpath("//input[@name='email']"));
	Name_txt.sendKeys("sureka13@gmail.com");
	WebElement Pass_txt = driver.findElement(By.xpath("//input[@id='pass']"));
	Pass_txt.sendKeys("abcs");
	String cust = Pass_txt.getAttribute("value");
	System.out.println(cust);
	WebElement login_btn = driver.findElement
		(By.xpath("//button[contains(@data-testid,'royal')]"));
	login_btn.click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	
	}

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumtask\\driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		
		
		

	}

}
