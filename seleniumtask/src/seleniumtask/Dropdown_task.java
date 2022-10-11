package seleniumtask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_task {

	public static void main(String[] args) throws InterruptedException, IOException {

//		System.setProperty("webdriver.edge.driver",
//				"E:\\selenium\\seleniumtask\\driver\\msedgedriver1.exe" );
//		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\seleniumtask\\driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
				driver.manage().window().maximize();
				
		/*driver.get("https://www.facebook.com/");
		WebElement create_page = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_page.click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Feb");
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select s = new Select(day);
		s.selectByValue("30");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1996");
		driver.navigate().to("https://adactinhotelapp.com/");
		Thread.sleep(2000);*/
//		driver.get("https://adactinhotelapp.com/");	
//		WebElement user = driver.findElement(By.id("username"));
//		user.sendKeys("surekabalu96@gmail.com");
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("123434567547");
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
				
				/*driver.get("https://adactinhotelapp.com/");
		WebElement register = driver.findElement(By.linkText("New User Register Here"));
		register.click();
		WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("sureka20");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		WebElement confirm_password = driver.findElement(By.id("re_password"));
		confirm_password.sendKeys("12345678");
		WebElement fullname = driver.findElement(By.id("full_name"));
		fullname.sendKeys("sureka");
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("surekabalu96@gmail.com");*/
				driver.get("https://adactinhotelapp.com/");
				Thread.sleep(2000);
				WebElement user = driver.findElement(By.id("username"));
			    user.sendKeys("sureka20");
		        WebElement password = driver.findElement(By.id("password"));
		        password.sendKeys("12345678");  
		        WebElement login = driver.findElement(By.id("login"));
     			login.click();
     			Thread.sleep(2000);
			    WebElement location = driver.findElement(By.id("location"));
				Select s = new Select(location);
				s.selectByValue("Paris");
				WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
				Select s1 = new Select(hotel);
				s1.selectByValue("Hotel Hervey");
				WebElement Room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
				Select s2 = new Select(Room_type);
				s2.selectByIndex(3);
				WebElement room_no = driver.findElement(By.name("room_nos"));
				Select s3 = new Select(room_no);
				s3.selectByVisibleText("4 - Four");
				WebElement date_in = driver.findElement(By.xpath("//input[@name='datepick_in'] "));
				date_in.clear();
				date_in.sendKeys("1/9/2022");
				WebElement date_out = driver.findElement(By.name("datepick_out"));
				date_out.clear();
				date_out.sendKeys("10/9/2022");
				WebElement adult = driver.findElement(By.id("adult_room"));
				Select s4 = new Select (adult);
				s4.selectByVisibleText("2 - Two");
				WebElement child_room = driver.findElement(By.name("child_room"));
				Select s5= new Select(child_room);
				s5.selectByValue("2");
				WebElement submit = driver.findElement(By.id("Submit"));
				submit.click();
				Thread.sleep(2000);
				WebElement radio_select = driver.findElement(By.xpath("//input[@type='radio']"));
				radio_select.click();
				WebElement continue_btn = driver.findElement(By.id("continue"));
				continue_btn.click();
				Thread.sleep(2000);
//				WebElement hotel_name = driver.findElement(By.xpath("//input[@type='text' and @id='hotel_name_dis']"));
//		if(hotel_name.isDisplayed())
//		{
//			if(hotel_name.isEnabled())
//			{
//				hotel_name.click();
//			}
//			else
//			{
//				System.out.println("not enable");
//			}
//		}
//		else
//		{
//			System.out.println("not display");
//		}
		WebElement First_name = driver.findElement(By.name("first_name"));
		First_name.sendKeys("sureka");
		WebElement last_name = driver.findElement(By.name("last_name"));
		last_name.sendKeys("rajesh");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("xyzabcd");
		WebElement cc = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		cc.sendKeys("1234567890123456");
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select s6 = new Select (cc_type);
		s6.selectByVisibleText("VISA");
		WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select (cc_month);
		s7.selectByVisibleText("September");
		WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(cc_year);
		s8.selectByVisibleText("2022");
		WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));	
		cvv.sendKeys("435");
		WebElement book_now = driver.findElement(By.id("book_now"));
		book_now.click();
		Thread.sleep(6000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("E:\\selenium\\seleniumtask\\snap\\snap3.png");
		 FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
	}

}
