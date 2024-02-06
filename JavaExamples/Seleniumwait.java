package SeleniumSyntex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwait {
	

	
	public void WaitMethod()
	{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.makemytrip.com");
			
		
	}
	
	public static void main(String[] args)
	{
		Seleniumwait sw = new Seleniumwait();
			sw.WaitMethod();
			
	}


}
