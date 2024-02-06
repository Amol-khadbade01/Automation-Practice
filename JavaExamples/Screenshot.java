package SeleniumSyntex;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot {
	
	
	static WebDriver driver;
	public static void main(String[] args) {



		
			TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File scrfile= scrShot.getScreenshotAs(OutputType.FILE);
		 File destfile=new File("path");
		 //FileUtils.copyFile(scrfile, destfile);





	}

}
