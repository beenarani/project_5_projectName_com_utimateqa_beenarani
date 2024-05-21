package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTesting {
    public static void main(String[] args) {

        //5.1 - Setup Chrome browser.
        String baseUrl = "https://courses.ultimateqa.com/";
        WebDriver driver = new ChromeDriver();

        //5.2 - Open URL.
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //5.3 - Print the title of the page.
        System.out.println("Title of the page is : " + driver.getTitle());

        //5.4 - Print the current url.
        System.out.println("Current url is : " + driver.getCurrentUrl());

        //5.5 - Print the page source.
        System.out.println("Page source is: " + driver.getPageSource());

        //5.6 - Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();

        //5.7 - Print the current url
        System.out.println("The current url is : " + driver.getCurrentUrl());

        //5.8 - Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("beenarani5504@gmail.com");

        //5.9 - Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("Password");

        //5.10 - Click on Login Button.
        driver.findElement(By.linkText("Sign In")).click();

        //5.11 - Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        //5.12 - Navigate forward to Homepage.
        driver.navigate().forward();

        //5.13 - Navigate back to baseUrl.
        driver.navigate().back();

        //5.14 - Refresh the page.
        driver.navigate().refresh();

        //5.15 - Close the browser
        driver.quit();
    }
}