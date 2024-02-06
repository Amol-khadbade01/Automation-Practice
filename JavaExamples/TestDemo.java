package JavaExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo 
{
	WebDriver driver;

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Element Present in search list are=====>"+list.size());
		int i; 
		for( i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
					
		}
	
		
		
			
		
		
	
		}












	}



