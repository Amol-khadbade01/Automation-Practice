package SeleniumDemoProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testpricecompair {
	public static WebDriver driver;

	@Test
	public void Compair_Method() { // Open borwser and Go to https://www.amazon.in
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// Once page is loaded, search for iPhone XR (64GB) - Yellow.
		WebElement SearchItem = driver.findElement(By.id("twotabsearchtextbox"));
		SearchItem.sendKeys("iphone15 pro max");
		SearchItem.click();

		WebElement clickOnSearch = driver.findElement(By.id("nav-search-submit-button"));
		clickOnSearch.click();

		// Get the price for frist Mobile

		WebElement getprice = driver
				.findElement(By.xpath("(//span[@class='a-price-whole'][normalize-space()='1,56,990'])[1] "));
		System.out.println("For Amazon The prize of mobile is ₹" + getprice.getText().toString());

		// Login to Flipkart
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// Once page is loaded, search for iPhone XR (64GB) - Yellow.
		WebElement Flipkart_SearchItem = driver.findElement(By.name("q"));
		Flipkart_SearchItem.sendKeys("iphone15 pro max");
		Flipkart_SearchItem.submit();

		WebElement GetPrizeFlipCart = driver
				.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'][contains(text(),'₹1,56,990')])[1]"));
		System.out.println("For Flipcard The prize of mobile is" + GetPrizeFlipCart.getText().toString());

		if (GetPrizeFlipCart.equals(getprice)) {
			System.out.println("Bothe prize are same");

		} else {
			System.out.println("Bothe prize are same");
		}

	}
}
