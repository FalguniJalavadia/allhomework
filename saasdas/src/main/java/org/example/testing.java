package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testing {
    static protected WebDriver driver;

    @Test
    public void userShoudAbleToRegisterSuccessFully() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.manage().window().fullscreen();
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://secure.tesco.com/account/en-GB/login?from=/");
        driver.findElement(By.linkText("Register")).click();

    }


}
