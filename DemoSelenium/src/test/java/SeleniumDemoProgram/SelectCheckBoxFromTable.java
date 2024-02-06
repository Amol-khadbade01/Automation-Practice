package SeleniumDemoProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectCheckBoxFromTable {

	public WebDriver driver;

	@Test
	public void CheckboxValidation() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		WebElement dropdownvalue=driver.findElement(By.name("example_length"));
		Select se= new Select(dropdownvalue);
		 se.selectByValue("100");
		 driver.findElement(By.name("example_length")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int rowvalue = driver.findElements(By.xpath("//table[@id='example']//tr")).size();
		System.out.println(rowvalue);

		int tablecolumn = driver.findElements(By.xpath("//table[@id='example']//tr[1]//td")).size();
		System.out.println(tablecolumn);

		for (int i = 1; i <= rowvalue; i++) {
			for (int j = 1; j <= tablecolumn; j++) {
				String value = driver.findElement(By.xpath("//table[@id='example']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(value);
			}
		}

		Cellvalue(driver, "2", "2");
		Cellvalue(driver, "4", "3");

		checkbox(driver, "9");

	}

	public static void Cellvalue(WebDriver driver, String selectrow, String selectcolumn) {
		String Row_vale = driver
				.findElement(By.xpath("//table[@id='example']//tr[" + selectcolumn + "]//td[" + selectrow + "]"))
				.getText();
		System.out.println(Row_vale);
	}

	public static void checkbox(WebDriver driver, String rowvalue) {
		driver.findElement(By.xpath("//table[@id='example']//tr[" + rowvalue + "]//td[1]")).click();

	}

}
