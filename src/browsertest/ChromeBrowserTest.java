package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //("Key", "path")

        WebDriver driver = new ChromeDriver();  // setting the properties
        driver.get(baseUrl); // launch baseUrl

        //requesting driver to wait for page to load fully
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String title = driver.getTitle(); //3. print the title of the page in console
        System.out.println("Page title: " + title);
        System.out.println("Current URL: " + driver.getCurrentUrl()); //4. print the Current URl
        System.out.println("Page source: " + driver.getPageSource()); //5. print the page source

        // enter the email to email field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(("Admin"));

        // enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");


        driver.quit(); // close the browser
    }
}
