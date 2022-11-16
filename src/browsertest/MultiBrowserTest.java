package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) // to avoid upper or lowercase sensitivity "equalsIgnoreCase"
        {
            System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        } // launch baseUrl
        driver.get(baseUrl);

        String title = driver.getTitle(); //3. get the title of the page
        System.out.println("Page title: " + title); //get the title of the page in console
        System.out.println("Current URL: " + driver.getCurrentUrl()); //4. get the Current URl
        System.out.println("Page source: " + driver.getPageSource()); //5. get the page source

        // enter the email to email field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(("Admin"));

        // enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        driver.quit(); // close the browser
    }
}