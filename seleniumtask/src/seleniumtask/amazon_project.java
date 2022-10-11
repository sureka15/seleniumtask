package seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_project {
	public static WebDriver driver;

	public static void best_seller() throws AWTException {
		WebElement bestseller = driver.findElement(By.xpath("//a[.='Best Sellers' and @tabindex='0']"));
		right_click(driver, bestseller);
	}

	public static void right_click(WebDriver d, WebElement e) throws AWTException {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();
		robot_action();
	}

	public static void robot_action() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void mobiles() throws AWTException {
		WebElement mobiles = driver.findElement(By.xpath("//a[.='Mobiles' and @tabindex='0']"));
		right_click(driver, mobiles);
	}

	public static void cust_services() throws AWTException {
		WebElement services = driver.findElement(By.xpath("//a[.='Customer Service' and @tabindex='0']"));
		right_click(driver, services);
	}
public static void switch_driver()
{
	String parent_window = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	String expected_title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	
	for (String id : windows) {
		//System.out.println(driver.switchTo().window(id).getTitle()); 
		if(id.equals(parent_window))
		{
			continue;
		}
		else if(driver.switchTo().window(id).getTitle().equals(expected_title))
		{
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(parent_window);
		}
				
	}
}
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumtask\\driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		best_seller();
		mobiles();
		cust_services();
		switch_driver();

	}

}
