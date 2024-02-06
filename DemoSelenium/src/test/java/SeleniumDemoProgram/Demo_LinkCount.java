package SeleniumDemoProgram;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// it will print the all the link present on screen 
public class Demo_LinkCount {

	WebDriver driver;

	public static void main(String[] args) {

				
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement>list_element=driver.findElements(By.tagName("a"));
		System.out.println("The totle number of Element present on Page is ==>"+ list_element.size());
		for(int i=1;i<list_element.size();i++)
		{
			WebElement lt= list_element.get(i);
			String value=lt.getText();
			System.out.println(value);
		}
		driver.quit();
		

	}

}
