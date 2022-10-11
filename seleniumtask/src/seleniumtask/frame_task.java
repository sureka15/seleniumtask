package seleniumtask;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_task {


public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\com.selenium.class\\Driver\\chromedriver1.exe");
		 driver =new ChromeDriver();
		 driver.get("https://ui.vision/demo/webtest/frames/");
//		 WebElement frame1 = driver.findElement(By.xpath("//frameset[@rows='150px,450px,*']"));
//		 driver.switchTo().frame(frame1);
		 WebElement frame1 = driver.findElement(By.tagName("frame"));
		 driver.switchTo().frame(frame1);
		 driver.findElement(By.xpath("//form[@method='POST' and @name='name1']//child::input")).sendKeys("sureka");
	    driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	     driver.switchTo().frame(frame2);
	     driver.findElement(By.xpath("//form[@method='POST' and @name='name2']//child::input")).sendKeys("sureka");
	     driver.switchTo().defaultContent();
	     WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	     driver.switchTo().frame(frame3);
	     WebElement frame_input = driver.findElement(By.xpath("//input[@name='mytext3']"));
	     frame_input.sendKeys("sureka");
	     WebElement inner_frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
	     driver.switchTo().frame(inner_frame);
	     WebElement radio_btn = driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']"));
	     radio_btn.click();
	     driver.switchTo().parentFrame();
	     frame_input.clear();
	     
	}

}
