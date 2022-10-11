package seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Findelements_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\selenium\\seleniumtask\\driver\\msedgedriver1.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		/*List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

		for (WebElement Element : table) {
			System.out.println(Element.getText());

		}
		System.out.println("**************row**********************");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
		for (WebElement rowdata : row) {
			System.out.println(rowdata.getText());
		}
		System.out.println("**************coloum**********************");
		List<WebElement> colum = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for (WebElement coludata : colum) {
			System.out.println(coludata.getText());
		}

		System.out.println("*****************row particular*******************");
		List<WebElement> pdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td"));
		for (WebElement data : pdata) {
			if (data.getText().equals("Helen Bennett")) {
				continue;
			}
			System.out.println(data.getText());
		}
		System.out.println("*****************coloum particular*******************");

		List<WebElement> pcolum = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for (WebElement coludata : pcolum) {
			if (coludata.getText().equals("Helen Bennett")) {
				continue;
			}
			System.out.println(coludata.getText());
			
			}
		// there is no error if we use findelements for single data 
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
		for (WebElement rowdata : row1) {
			System.out.println(rowdata.getText());
			
				}*/
		System.out.println("*********************************************************************************");
		List<WebElement> table_alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for (WebElement alldata : table_alldata) {
			System.out.println(alldata.getText());
			
		}
		}

}
