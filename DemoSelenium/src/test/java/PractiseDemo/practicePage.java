package PractiseDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practicePage {
	public static WebDriver driver;

	@Test
	public void checkbrokenLink() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		List<WebElement> element = driver.findElements(By.tagName("a"));

		for (WebElement i:element) {
			System.out.println(element);
		}

	}

}
