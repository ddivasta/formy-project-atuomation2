import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ddiva/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("61 Spit Brook Rd, Suite 204");
        Thread.sleep(1000);

        WebElement autocompleteResults= driver.findElement(By.className("pac-container pac-logo"));
        autocompleteResults.click();

        driver.quit();
    }
}
