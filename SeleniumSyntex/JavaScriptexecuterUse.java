package SeleniumSyntex;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Executing this code will open the specified web page and scroll to the bottom of the page using the JavaScript Executor.
public class JavaScriptexecuterUse {
WebDriver driver;
	
public static void main(String[] args) {
		 
		//Executing this code will open the specified web page and scroll to the bottom of the page using the JavaScript Executor.
		// Set the path to chromedriver.exe
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the web page
        driver.get("https://www.w3schools.in/java/method-overriding");
        
        // Perform scrolling using JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       
        
        // Close the browser
        //driver.quit();

	}

}
