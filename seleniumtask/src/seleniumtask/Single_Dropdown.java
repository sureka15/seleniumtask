package seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws My_exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"E:\\selenium\\seleniumtask\\driver\\msedgedriver1.exe" );
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		List<WebElement> all_options = s.getOptions();
		System.out.println(all_options.size());
			/*for(int i=0;i<=all_options.size()-1;i++)
			{
			if(all_options.get(i).getText().equals("Apple"))
			{
				String text = all_options.get(i).getText();
				s.selectByVisibleText(text);
			}
			}*/
		for (WebElement Element : all_options) {
			System.out.println(Element.getText());
			if(Element.getText().equals("Apple"))
			{
				String text = Element.getText();
				s.selectByVisibleText("Apple");
			}
						
		}
	}

}
