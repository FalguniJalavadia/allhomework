package RegAuto1;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {

    private ChromeDriver driver;

    @Test
    public void userShoudAbleToRegisterSuccessFully() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
      driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://secure.tesco.com/account/en-GB/login?from=/");






}

    public org.openqa.selenium.WebDriver.Options manage() {
    }

    public void get(String s) {
    }
