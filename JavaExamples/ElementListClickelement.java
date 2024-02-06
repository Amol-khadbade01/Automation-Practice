package SeleniumSyntex;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementListClickelement {
	// print all the element list of footer link list  and click on of the element 
	WebDriver driver;
	
	public static void main(String[] args) 
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> AllElement=driver.findElements(By.xpath("//h5[text()=\"Top Tutorials\"]/../a[@class=\"ga-bottom\"]"));
		
		System.out.println("The Element are "+AllElement.size());
		for(int i=0;i<AllElement.size();i++)
		{
			System.out.println(AllElement.get(i).getText());
			if(AllElement.get(i).getText().contains("jQuery Tutorial"))
			{
				AllElement.get(i).click();
				break;
			}
		}

	}

}
