package SeleniumDemoProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Searchtext extends BaseClass {
	//ul[@role='listbox']//li/descendant::div[@Class='eIPGRd']
	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>List_element=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("The Element Present in Google search list are-->"+List_element.size());
		for(int i=0;i<List_element.size();i++)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("The element are ->"+List_element.get(i).getText());
			if(List_element.get(i).equals("selenium"))
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			{
				List_element.get(i).click();
				break;
			}
			
			
		}
		//driver.quit();
		

	}

}
