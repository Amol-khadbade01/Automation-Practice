package JavaProgramExample;

import java.time.Duration;
import java.util.List;import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_SelectNames_search_list {

	// Select any name from google search displayed list
	WebDriver driver;

	@Test
	public void search_example() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement send_name = driver.findElement(By.name("q"));
		send_name.sendKeys("Selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Search_List_Element = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Total Element Present in List Element are:-" + Search_List_Element.size());
		
		
		
			//System.out.println(Search_List_Element.get(i).getText());
			
		
		//System.out.println("Total Element Present in List are" + Search_List_Element);
		
		

	}

}
