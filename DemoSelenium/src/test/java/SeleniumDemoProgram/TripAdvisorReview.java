package SeleniumDemoProgram;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

	public class TripAdvisorReview {
	public 	WebDriver driver;
	@Test
	  public void method1()
	  {
		  // Set the path to your ChromeDriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    	ChromeDriver driver= new ChromeDriver();

	        // Open TripAdvisor website
	        
	        driver.get("https://www.tripadvisor.in");

	        // Search for "Club Mahindra"
	        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	        searchBox.sendKeys("Club Mahindra");
	        searchBox.submit();

	        // Click on the first result
	        WebElement firstResult = driver.findElement(By.xpath("//div[@class='result-title']"));
	        firstResult.click();

	        // Click on "Write a Review"
	        WebElement writeReviewButton = driver.findElement(By.xpath("//span[text()='Write a review']"));
	        writeReviewButton.click();

	        // Hover over the fifth star and click it
	        WebElement fifthStar = driver.findElement(By.xpath("//span[@data-value='5']"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(fifthStar).click().perform();

	        // Write some random text in "Title of your review" and "Your review" sections
	        WebElement titleInput = driver.findElement(By.id("ReviewTitle"));
	        titleInput.sendKeys("Awesome Experience");

	        WebElement reviewInput = driver.findElement(By.id("ReviewText"));
	        reviewInput.sendKeys("I had a great time at Club Mahindra!");

	        // Check if "Hotel Ratings" section is available, if available, repeat step 5
	        WebElement hotelRatingsSection = driver.findElement(By.xpath("//div[@data-tab='TABS_REVIEWS']"));
	        if (hotelRatingsSection.isDisplayed()) {
	            actions.moveToElement(fifthStar).click().perform();
	        }

	        // Select checkbox in 'Submit your review' section
	        WebElement submitCheckbox = driver.findElement(By.xpath("//input[@name='noFraud']"));
	        submitCheckbox.click();

	        // Close the browser
	        driver.quit();
	  }
	}



