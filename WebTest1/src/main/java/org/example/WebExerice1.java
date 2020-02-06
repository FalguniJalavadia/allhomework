package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebExerice1 {


    static protected WebDriver driver;

    @Test
    public void userShoudAbleToRegisterSuccessFully() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("resister-button")));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



            driver.findElement(By.id("FirstName")).sendKeys("dsd");
            //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
//            driver.findElement(By.id("FirstName")).sendKeys("gfhfg");
//

            driver.findElement(By.id("LastName")).sendKeys("asdfg");
            Thread.sleep(5000);
            //  WebElement element = driver.findElement(By.id("FirstName"));
            //  JavascriptExecutor executor = (JavascriptExecutor)driver;
            //  executor.executeScript("arguments[0].click();", element);

            try {
                // thread to sleep for 5000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {

            }

        }
     @Test









    }





