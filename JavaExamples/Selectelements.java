package SeleniumSyntex;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectelements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		WebElement selectvalue=driver.findElement(By.xpath("//div[text()='Select Option']"));
		//selectvalue.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Select valueSelect= new Select(selectvalue);
		valueSelect.selectByVisibleText("A root option");
		
		
		System.out.println("Value select by "+valueSelect);
	}

}
