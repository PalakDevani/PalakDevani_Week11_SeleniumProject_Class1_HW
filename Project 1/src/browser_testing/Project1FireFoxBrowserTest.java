package browser_testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project1FireFoxBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver(); // setting the properties
        driver.get(baseUrl);// get URL

        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String title = driver.getTitle(); // get the title of the page
        System.out.println(title); // print statement
        System.out.println("Current URL: " + driver.getCurrentUrl()); // get current URL
        System.out.println("Page source: " + driver.getPageSource()); // get page source

        WebElement emailField = driver.findElement(By.id("Email"));// enter email in email field
        emailField.sendKeys("ptest123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password13");

        driver.quit();


    }
}
