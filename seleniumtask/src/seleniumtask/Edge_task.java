package seleniumtask;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver",
				"E:\\selenium\\seleniumtask\\driver\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/?hl=en");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Dimension d = new Dimension(600, 700);
		driver.manage().window().setSize(d);
		driver.quit();
		
		
		
		
		

	}

}
