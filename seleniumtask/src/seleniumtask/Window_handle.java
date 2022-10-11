package seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Window_handle {
	public static WebDriver driver;

	public static void action_move(WebDriver d, WebElement b) {
		Actions a = new Actions(d);
		a.moveToElement(b).build().perform();

	}

	public static void action_right_click(WebDriver d, WebElement c) throws AWTException {
		Actions a = new Actions(d);
		a.contextClick(c).build().perform();
		Robot_action();
	}

	public static void click_action(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();

	}

	public static void Robot_action() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Switch_driver();
	}

	public static void Switch_driver() {

		Set<String> child_window = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(child_window);
		for (int i = list.size() - 1; i > 0; i++) {
			driver.switchTo().window(list.get(i));
			list.clear();
			break;

		}

	}

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumtask\\driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("//a[.='Women']"));
		action_move(driver, women);
		WebElement causal_dress = driver.findElement(By.xpath("(//a[.='Casual Dresses'])[1]"));
		action_right_click(driver, causal_dress);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement printed_dress = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		click_action(driver, printed_dress);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame1);
		WebElement plus_btn = driver.findElement(By.xpath("//i[@class='icon-plus']/.."));
		click_action(driver, plus_btn);
		WebElement size_dopdown = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s = new Select(size_dopdown);
		s.selectByValue("3");
		WebElement add_cart = driver.findElement(By.xpath("//span[.='Add to cart']//parent::button"));
		click_action(driver, add_cart);
//		WebElement continue_shop = driver.findElement(By.xpath("//i[normalize-space(text()='Continue shopping 						')]//ancestor::span[@title='Continue shopping']"));
//		click_action(driver, continue_shop);
		WebElement proceed = driver.findElement(By
				.xpath("//span[normalize-space(.='Proceed to checkout')]//ancestor::a[@title='Proceed to checkout']"));
		action_right_click(driver, proceed);
		WebElement proceed_btn = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
		click_action(driver, proceed_btn);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].value='surekaxyz56@gmail.com'", email);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].value='sureka@rajesh20'", pass);
		WebElement login = driver
				.findElement(By.xpath("//i[normalize-space(.='Sign in')]//ancestor::button[@id='SubmitLogin']"));
		click_action(driver, login);
		WebElement proceed_3 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
		click_action(driver, proceed_3);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click_action(driver, checkbox);
		WebElement proced_4 = driver.findElement(By.xpath(
				"//span[normalize-space(.='Proceed to checkout')]//ancestor::button[@type='submit' and @name='processCarrier']"));
		click_action(driver, proced_4);
		WebElement pay_bybank = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		click_action(driver, pay_bybank);
		WebElement confirm_order = driver.findElement(By.xpath("//span[.='I confirm my order']"));
		click_action(driver, confirm_order);
		WebElement back_to_order = driver.findElement(By.xpath("//a[.='Back to orders']"));
		click_action(driver, back_to_order);
		driver.close();
	}

}
