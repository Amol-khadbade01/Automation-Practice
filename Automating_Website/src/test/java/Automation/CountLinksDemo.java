package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
// it will print all the link present on the page for linkedin using a tag name
public class CountLinksDemo {
	@Test
	public void CountAllLink() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		for (int i = 0; i < element.size(); i++) {
			String link = element.get(i).getText();
			System.out.println(link);
		}

	}

}
