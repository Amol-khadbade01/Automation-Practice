package PractiseDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectNewsfromList {
	String url = "https://www.cnbc.com/world/?region=world";

	@Test
	public void Verify_user_should_Select_Item_from_List() {

		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='LatestNews-list']//li"));
		System.out.println("Total news Present in the LATEST NEWS area are->" + element.size());
		if (!element.isEmpty()) {
			WebElement ClickItem = element.get(element.size() - 1);
			ClickItem.click();
			
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3350)");
		}
		
		driver.findElement(By.xpath("//a[text()='Please Contact Us']")).click();
		System.out.println(driver.getTitle());
		
		

	}

}
