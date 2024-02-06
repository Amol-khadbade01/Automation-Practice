package SeleniumDemoProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tableSelction {

	WebDriver driver;

	@Test
	public void CheckValidaton() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
		driver.manage().window().maximize();

		// Find the table Row count and Row count
		int rowValue = driver.findElements(By.xpath("//table[@id='example']//tr")).size();
		System.out.println(rowValue);

		int columnValue = driver.findElements(By.xpath("//table[@id='example']//tr[1]//td")).size();
		System.out.println(columnValue);

		for (int i = 1; i < rowValue; i++) {
			for (int j = 1; j < columnValue; j++) {
				String Value = driver.findElement(By.xpath("//table[@id='example']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(Value);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		}

	}

}
