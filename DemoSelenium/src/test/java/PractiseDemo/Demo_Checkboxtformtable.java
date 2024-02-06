package PractiseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Checkboxtformtable {

	WebDriver driver;
	
	@Test
	public void Method_Check_box()
	{
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
			
		int columnvalue=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		int columedata=driver.findElements(By.xpath("//table[@id='countries']//tr/td[1]")).size();
		System.out.println(columnvalue);
		System.out.println(columedata);
		
		Check_box(driver,"3");
		Check_box(driver,"4");
		Check_box(driver,"5");
		
		driver.quit();
		
	}
	
	public static void Check_box(WebDriver driver, String columnvalue)
	{
		driver.findElement(By.xpath("//table[@id='countries']//tr["+columnvalue+"]/td[1]//input")).click();
	}
}
