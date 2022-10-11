package seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				"E:\\selenium\\seleniumtask\\driver\\msedgedriver1.exe" );
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		if(!s.isMultiple())
		{
			List<WebElement> options = s.getOptions();
			for(WebElement web :options )
			{
				if(web.getText().equals("Apple"))
				{
					s.selectByVisibleText("Apple");
					
				}
		}
						System.out.println(s.getFirstSelectedOption().getText());
			}
		else
		{
			System.out.println("multiple drop down ");
		}
		Thread.sleep(2000);
		WebElement superhero = driver.findElement(By.id("superheros"));
		Select s1 = new Select (superhero);
		Thread.sleep(2000);
		/*if(s1.isMultiple())
		{
			List<WebElement> options = s1.getOptions();
			for(WebElement web1 : options)
			{
				if(web1.getText().equals("Supergirl")||
						web1.getText().equals("Iron Man")||web1.getText().equals("Batwoman"))
				{
					s1.selectByValue("sg");
					Thread.sleep(2000);
					s1.selectByValue("im");
					Thread.sleep(2000);
					s1.selectByValue("bw");
				}
					}
			List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
			for(WebElement w : allSelectedOptions)
			{
			System.out.println(w.getText());	
			}
			System.out.println(s1.getFirstSelectedOption().getText());
		}
		*/
	
		
			s1.selectByValue("sg");
			Thread.sleep(2000);
			s1.selectByValue("im");
			Thread.sleep(2000);
			s1.selectByValue("bw");
		
		List<WebElement> alloptions = s1.getAllSelectedOptions();
		for ( WebElement all :alloptions )
		{
			System.out.println(all.getText());
		}
			System.out.println(s1.getFirstSelectedOption().getText()); 
			
		}
		
	}


