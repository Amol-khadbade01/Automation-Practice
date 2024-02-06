package SeleniumDemoProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceComparison {
	WebDriver driver;

	public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    		    	

	        // Open Amazon website
	        ChromeDriver driver= new ChromeDriver();
	        driver.get("https://www.amazon.in");

	        // Search for iPhone XR (64GB) - Yellow
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("iPhone XR (128 GB)- Yellow");
	        searchBox.submit();
	        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='Apple iPhone 15 Plus (128 GB) - Yellow']")));
	        // Select the matching iPhone
	        WebElement selectediPhone = driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 15 Plus (128 GB) - Yellow']"));
	        selectediPhone.click();

	        // Get the price of the selected iPhone on Amazon
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       // wait.until(ExpectedConditions.invisibilityOfAllElements(By.id("corePriceDisplay_desktop_feature_div")));
	        WebElement priceElementAmazon = driver.findElement(By.id("corePriceDisplay_desktop_feature_div"));
	        String priceAmazon = priceElementAmazon.getText();
	        System.out.println("Amazon Price: " + priceAmazon);

	        // Open Flipkart website
	        driver.get("https://www.flipkart.com");

	        // Repeat steps 2 to 4 on Flipkart
	        WebElement searchBoxFlipkart = driver.findElement(By.name("q"));
	        searchBoxFlipkart.sendKeys("iPhone XR (128GB) - Yellow");
	        searchBoxFlipkart.submit();

	        WebElement selectediPhoneFlipkart = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone XR (128GB) - Yellow')]"));
	        selectediPhoneFlipkart.click();

	        WebElement priceElementFlipkart = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
	        String priceFlipkart = priceElementFlipkart.getText();
	        System.out.println("Flipkart Price: " + priceFlipkart);

	        // Compare prices and print the result
	        double priceAmazonValue = Double.parseDouble(priceAmazon.replace("₹", "").replace(",", ""));
	        double priceFlipkartValue = Double.parseDouble(priceFlipkart.replace("₹", "").replace(",", ""));

	        if (priceAmazonValue < priceFlipkartValue) {
	            System.out.println("Amazon has a lower price for the iPhone.");
	        } else if (priceAmazonValue > priceFlipkartValue) {
	            System.out.println("Flipkart has a lower price for the iPhone.");
	        }  else {
	            System.out.println("Prices on Amazon and Flipkart are the same.");
	        }

	        // Close the browser
	        driver.quit();
	    }
}
