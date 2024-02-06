package SeleniumDemoProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonPricecomparision {
		
		    public static void main(String[] args) {
		        // Set the path to your ChromeDriver executable
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Step 1-4: Amazon
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("https://www.amazon.in");
		        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		        searchBox.sendKeys("iphone15 pro max");
		        searchBox.submit();

		        // Click on the first result assuming it's the desired iPhone
		        driver.findElement(By.cssSelector(".s-result-item a")).click();

		        // Get the price on Amazon
		        WebElement amazonPriceElement = driver.findElement(By.xpath("//span[@class='a-price-whole'][normalize-space()='1,56,990'])[1] "));
		        String amazonPrice = amazonPriceElement.getText().trim();
		        System.out.println("Amazon Price: " + amazonPrice);

		        // Step 5-6: Flipkart
		        driver.get("https://www.flipkart.com/");
		        WebElement searchBoxFlipkart = driver.findElement(By.name("q"));
		        searchBoxFlipkart.sendKeys("iphone15 pro max");
		        searchBoxFlipkart.submit();

		        // Click on the first result assuming it's the desired iPhone
		        driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'][contains(text(),'₹1,56,990')])[1]")).click();

		        // Get the price on Flipkart
		        WebElement flipkartPriceElement = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1'][contains(text(),'₹1,56,990')])[1]"));
		        String flipkartPrice = flipkartPriceElement.getText().trim();
		        System.out.println("Flipkart Price: " + flipkartPrice);

		        // Compare prices
		        double amazonPriceNumeric = Double.parseDouble(amazonPrice.replaceAll("[^\\d.]", ""));
		        double flipkartPriceNumeric = Double.parseDouble(flipkartPrice.replaceAll("[^\\d.]", ""));

		        if (amazonPriceNumeric < flipkartPriceNumeric) {
		            System.out.println("Amazon has a lesser price.");
		        } else if (amazonPriceNumeric > flipkartPriceNumeric) {
		            System.out.println("Flipkart has a lesser price.");
		        } else {
		            System.out.println("Prices on Amazon and Flipkart are the same.");
		        }

		        // Close the browser window
		        driver.quit();
		    }
		

}


