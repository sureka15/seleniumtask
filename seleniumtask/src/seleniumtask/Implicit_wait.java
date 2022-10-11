package seleniumtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {
	public static WebDriver driver;
	public static void implicit_wait()
	{
		
		driver.get("https://letcode.in/signin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[@class='icon is-small is-left']//preceding::input[@name='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//div[@class='field']//descendant::input[@name='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//p[@class='control']//child::button[.='LOGIN']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOf(toast));
		WebElement sign_up = driver.findElement(By.xpath("//a[.='Sign up']"));
		WebElement a = wait.until(ExpectedConditions.visibilityOf(sign_up));
		a.click();
		
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		driver.navigate().to("https://www.facebook.com/login/");
//		WebElement sign_up = driver.findElement(By.xpath("//a[.='Sign up']"));
//		WebElement a = wait.until(ExpectedConditions.visibilityOf(sign_up));	
//		a.click();
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumtask\\driver\\chromedriver1.exe");
		driver=new ChromeDriver();
		implicit_wait();

	}
}
