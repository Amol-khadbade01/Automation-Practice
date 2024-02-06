
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.time.Duration;
import java.util.Iterator;
import org.testng.annotations.Test;

public class WindowHandles {
	@Test
	public void windowHandle() throws Exception {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\Selenium\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm");
		String currentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while (i.hasNext()) {
			String childwindow = i.next();
			if (!childwindow.equalsIgnoreCase(currentWindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("The child window is " + childwindow);
			} else {
				System.out.println("There are no children");
			}
		}
		driver.quit();
	}
}