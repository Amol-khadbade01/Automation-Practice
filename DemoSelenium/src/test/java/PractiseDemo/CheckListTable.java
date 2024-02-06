package PractiseDemo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class CheckListTable {

	WebDriver driver;

	Actions act = new Actions(driver);

	public void List_of_Countries()

	{
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();

		int rowvalue = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println(rowvalue);

		int columnValue = driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td")).size();
		System.out.println(columnValue);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// print all the data present in the table

		for (int i = 1; i <= rowvalue; i++) {
			for (int j = 1; j <= columnValue; j++) {
				String Value = driver.findElement(By.xpath("//table[@id='countries']//tr[" + i + "]/td[" + j + "]"))
						.getText();

				System.out.println(Value);
			}
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Check_box_Validation(driver, "4");
		Check_box_Validation(driver, "5");
		Check_box_Validation(driver, "3");
		Check_box_Validation(driver, "195");
	}

	public static void Check_box_Validation(WebDriver driver, String columnValue) {

		driver.findElement(By.xpath("//table[@id='countries']//tr[" + columnValue + "]//td[1]//input")).click();

	}

}