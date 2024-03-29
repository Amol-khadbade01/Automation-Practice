package PractiseDemo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NakuriBrokenLinksExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the Nakuri website
        driver.get("https://www.naukri.com/");

        // Find all links on the page using the 'a' tag
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate through each link and check if it's a broken link
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                verifyLink(url);
            }
        }

        // Close the browser
        driver.quit();
    }

    // Helper method to verify the status of a link
    public static void verifyLink(String url) {
        try {
            // Create a URL object
            URL linkUrl = new URL(url);

            // Open a connection to the URL
            HttpURLConnection httpURLConnection = (HttpURLConnection) linkUrl.openConnection();

            // Get the HTTP response code
            int responseCode = httpURLConnection.getResponseCode();

            // Check if the response code indicates a broken link
            if (responseCode >= 400) {
                System.out.println("Broken Link: " + url + " - Response Code: " + responseCode);
            } else {
                System.out.println("Valid Link: " + url + " - Response Code: " + responseCode);
            }
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + url);
        } catch (IOException e) {
            System.out.println("IOException for URL: " + url);
        }
    }
}
