package browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TrialFirefox {
    public static void main(String[] args) {
        //Set Property
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //Create Object
        WebDriver driver = new FirefoxDriver();

        //Launch URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Maximise window
        driver.manage().window().maximize();

        //Give implicit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//get the title of the page
        System.out.println("the Page title is :" + driver.getTitle());

        //Get current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("The Page source is " + driver.getPageSource());

        //Find User aname field and enter username
        WebElement enterUser = driver.findElement(By.name("username"));
        enterUser.sendKeys("javateam@gmail.com");
        //Find Pass

    }
}