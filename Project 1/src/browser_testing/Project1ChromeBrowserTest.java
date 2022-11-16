package browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //("Key", "path")

        WebDriver driver = new ChromeDriver();  // setting the properties
        driver.get(baseUrl); // launch baseUrl

        String title = driver.getTitle(); //3. print the title of the page in console
        System.out.println("Page title: " + title);
        System.out.println("Current URL: " + driver.getCurrentUrl()); //4. print the Current URl
        System.out.println("Page source: " + driver.getPageSource()); //5. print the page source

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

