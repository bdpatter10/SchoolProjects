
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium  {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.

        // you will need to change this location to the folder where you have chromedriver.exe stored
    	// blakepatterson   Macintosh HD  Users chromedriver.exe
    	System.setProperty("webdriver.chrome.driver","Macintosh HD:\\Users\\blakepatterson\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();    

        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());


        //Close the browser
        driver.quit();
    }
}
