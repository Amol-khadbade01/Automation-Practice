package SeleniumSyntex;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglesearchSelenium {
	WebDriver driver;
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> elementlist=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li/descendant::div[@Class=\"eIPGRd\"]"));
		System.out.println("The Element preseint in google search list are==>"+elementlist.size());
		for(int i=0;i<elementlist.size();i++)

		{
			System.out.println(elementlist.get(i).getText());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if(elementlist.get(i).getText().equals("java tutorial"))
			{
				elementlist.get(i).click();
				break;

			}

		}


	}

}
