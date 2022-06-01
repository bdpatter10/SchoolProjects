package hello;

import java.util.regex.Pattern; 
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mathTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver","chromedriver");	
         driver = new ChromeDriver();
   
    baseUrl = "http://webstrar100.fulton.asu.edu/page1/Default.aspx";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAdd() throws Exception {
    driver.get(baseUrl + "/~jbalasoo/cse464/hw5/modified/math1.php");
    driver.findElement(By.name("number1")).clear();
    driver.findElement(By.name("number1")).sendKeys("5");
    driver.findElement(By.name("number2")).clear();
    driver.findElement(By.name("number2")).sendKeys("5");
    driver.findElement(By.name("add")).click();
    driver.findElement(By.name("calc")).click();
    assertEquals("10", driver.findElement(By.name("res")).getAttribute("value"));
  }
  
  @Test
  public void testSub() throws Exception {
    driver.get(baseUrl + "/~jbalasoo/cse464/hw5/modified/math1.php");
    driver.findElement(By.name("number1")).clear();
    driver.findElement(By.name("number1")).sendKeys("5");
    driver.findElement(By.name("number2")).clear();
    driver.findElement(By.name("number2")).sendKeys("5");
    driver.findElement(By.name("sub")).click();
    driver.findElement(By.name("calc")).click();
    assertEquals("0", driver.findElement(By.name("res")).getAttribute("value"));
  }
  
  @Test
  public void testMul() throws Exception {
    driver.get(baseUrl + "/~jbalasoo/cse464/hw5/modified/math1.php");
    driver.findElement(By.name("number1")).clear();
    driver.findElement(By.name("number1")).sendKeys("5");
    driver.findElement(By.name("number2")).clear();
    driver.findElement(By.name("number2")).sendKeys("5");
    driver.findElement(By.name("mul")).click();
    driver.findElement(By.name("calc")).click();
    assertEquals("25", driver.findElement(By.name("res")).getAttribute("value"));
  }
  
  @Test
  public void testDiv() throws Exception {
    driver.get(baseUrl + "/~jbalasoo/cse464/hw5/modified/math1.php");
    driver.findElement(By.name("number1")).clear();
    driver.findElement(By.name("number1")).sendKeys("5");
    driver.findElement(By.name("number2")).clear();
    driver.findElement(By.name("number2")).sendKeys("5");
    driver.findElement(By.name("div")).click();
    driver.findElement(By.name("calc")).click();
    assertEquals("1", driver.findElement(By.name("res")).getAttribute("value"));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
