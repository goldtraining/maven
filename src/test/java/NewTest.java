import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
      long id = Thread.currentThread().getId();
      System.out.println("test_01 Thread id is: " + id);
      driver.quit();
  }
}
