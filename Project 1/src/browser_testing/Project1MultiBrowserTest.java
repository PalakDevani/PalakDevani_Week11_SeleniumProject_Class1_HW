package browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1MultiBrowserTest {

    static String browser = "chrome";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
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

        // navigate to login page by clicking on the login link (click method  )
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // enter the email to email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(("test123@gmail.com"));

        // enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password13");


        driver.quit(); // close the browser

    }
}