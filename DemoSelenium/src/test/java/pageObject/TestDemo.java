package pageObject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void click_lastnews() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cnbc.com/world/?region=world");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='LatestNews-list']//li"));
		
		if(!element.isEmpty())
		{
		 element.get(element.size()-1).click();	
		
		}
	}
}
