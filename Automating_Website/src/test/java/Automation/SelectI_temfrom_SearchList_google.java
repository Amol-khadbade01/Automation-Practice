package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectI_temfrom_SearchList_google {
	@Test
	public void SelectItem()

	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> element = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Total Element present in list are "  +element.size());
		
		for(int i=0;i<element.size();i++)
		{
			if(element.get(i).equals("Selenium"))
			{
			element.get(i).click();
			break;
			}
		}
		

	}

}
