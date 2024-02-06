package PractiseDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UpdateNakuri {

	@Test
	public void Update_profile() {
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameField")));
		WebElement Username = driver.findElement(By.id("usernameField"));
		Username.sendKeys("khadbadeamol@gmail.com");
		WebElement Password_user = driver.findElement(By.id("passwordField"));
		Password_user.sendKeys("Amol@9890");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='naukri user profile img']")));
		driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[normalize-space()='View & Update Profile']")));
		driver.findElement(By.xpath("//a[normalize-space()='View & Update Profile']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[@class='icon edit']")));
		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//js.executeScript("window.scrollBy(0,950)");
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#saveBasicDetailsBtn")));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#saveBasicDetailsBtn")));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")) .click();
		driver.findElement(By.cssSelector("#saveBasicDetailsBtn")).click();
		System.out.println("Profile Updated successfully?..!");

		// Apply for the job
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.findElement(By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-bell']")).click();
		driver.findElement(By.xpath("//div[@title='Recommended jobs']")).click();
		// List<WebElement>
		// jobDetails=driver.findElements(By.xpath("//ul[@class='job-desc
		// typ-14Medium']/li"));
		List<WebElement> jobDetails = driver.findElements(By.xpath("//div[@class='list']//child::p"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		for (int i = 0; i < jobDetails.size(); i++) {
			System.out.println(jobDetails.get(i).getText());
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if (!jobDetails.isEmpty()) {
				WebElement ClickItem = jobDetails.get(jobDetails.size() - 1);
				ClickItem.click();
				break;
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				 //driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
			}
			
		}

	}

}
