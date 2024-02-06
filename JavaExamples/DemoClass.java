package SeleniumSyntex;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrshot= ((TakesScreenshot) driver);
		//Call getScreenshotAs method to create image file
		File scrFile= scrshot.getScreenshotAs(OutputType.FILE);
		  //Move image file to new destination
		File Destinationfile=new File("pathe");
		FileUtils.copyFile(scrFile, Destinationfile);
		
		
	};

}
