package browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Project1EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver(); // setting the properties
        driver.get(baseUrl); // get URL

        //maximise Window command;fullscreen
        driver.manage().window().maximize();

        String title = driver.getTitle(); // get page title
        System.out.println(title);
        System.out.println("Current URL: " + driver.getCurrentUrl()); // get currentURL
        System.out.println("Page source: " + driver.getPageSource()); // get page source

        // navigate on login page (click method)
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email")); // Enter email to email field
        emailField.sendKeys("ptest123@gmail.com"); // email

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password13");

        driver.quit();
    }
}
