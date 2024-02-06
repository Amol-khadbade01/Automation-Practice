package SeleniumSyntex;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class BraveBrowser {
	WebDriver driver;
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {



		WebDriver driver= new ChromeDriver();
		driver.get("https://www.concentrix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> llistofelement=driver.findElements(By.xpath("//ul[@class=\"elementor-icon-list-items\"]//li"));
		for(int i=0;i<llistofelement.size();i++)
		{
			System.out.println(llistofelement.get(i).getText());
			if(llistofelement.get(i).equals(llistofelement.contains("CX Strategy")))
			{
				llistofelement.get(i).click();
				break;


			}


		}







	}}
