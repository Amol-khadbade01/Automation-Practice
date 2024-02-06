package SeleniumSyntex;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseClassforAll {

	WebDriver driver;
	
	
	public void PageLoadWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void Pagemaxi(String url)
	{
		driver.get(url);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
