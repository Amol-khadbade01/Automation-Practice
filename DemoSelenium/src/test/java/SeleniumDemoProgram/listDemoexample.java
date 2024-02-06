package SeleniumDemoProgram;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listDemoexample {
	WebDriver driver;

	public static void main(String[] args) {
		
		
	ChromeDriver driver= new ChromeDriver();
	
		driver.get("https://www.airbnb.co.in/");
		WebElement value=driver.findElement(By.tagName("a"));
		
		for(int i=0;i<value.toString().length();i++)
		{
			System.out.println(value.getText());
		}
		
		
		
	}
	 //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("fileWithPath");

            //Copy file at destination

           
}
