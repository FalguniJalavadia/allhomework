import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Exercise
{
           static protected WebDriver driver;
        String expected = "My registration Successfully";


        public String timeStamp(){
            DateFormat dateFormat = new SimpleDateFormat("ddMMHHmmss");
            Date date = new Date();
            return(dateFormat.format(date));
        }
        public void waitForClickable(By by, int time)
        {
            WebDriverWait wait = new WebDriverWait(driver,time);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }
        public void waitForVisibility(By by,int time)
        {
            WebDriverWait wait = new WebDriverWait(driver,time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        // wait for element present
        public void waitForElementsPresent(By by,int time)
        {
            WebDriverWait wait = new WebDriverWait(driver,time);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }
        @After
        public void closeBrowser()
        {driver.quit();
        }
        @Before
        public void openBrowser() {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        // clear text input box
        public void clearText(By by){ driver.findElement(by).clear();}

        // select by viible text
        public void selectByVisibleText(By by,String text)
        {
            Select select = new Select(driver.findElement(by));
            select.selectByVisibleText(text);
        }
        public void selectByIndex(By by,int number)
        { Select select = new Select(driver.findElement(by));
            select.selectByIndex(number);
        }
        public void selectByValue(By by,String text)
        {
            Select select = new Select(driver.findElement(by));
            select.selectByValue(text);
        }

        public void clickOnElements(By by) {driver.findElement(by).click();}


        public void clearAndEnterText(By by, String text)
        {
            driver.findElement(by).clear();
            driver.findElement(by).sendKeys(text);
        }

        public void EnterText(By by,String text)
        {
            driver.findElement(by).sendKeys(text);
        }

        public String getTextFromelements(By by)
        {
            return driver.findElement(by).getText();

        }

        @Test
        public void userSuccefullyRegister() {
            driver.get("https://demo.nopcommerce.com/");
            // waitForClickable(By.id("register-button"),20);

            clickOnElements(new By.ByLinkText("Register"));


        waitForClickable(By.id("register-button"), 70);

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        waitForVisibility(By.id("FirstName"),50);
        EnterText(By.id("FirstName"), "falguni");
        // enter last name
        EnterText(By.id("LastName"), "patel");
        // selecting date of birthday
      // selectByValue(By.xpath("//select[@name=\"DateofBirthDay\"]"), "18");
       // selecting month of birthday
     //  selectByIndex(By.xpath("//select[@name=\"DateofBirthMonth'\"]"), 2);
       //selecting year of birthday
      // selectByVisibleText(By.xpath("//select[@name='DateOfBirthYear']"), "1975");
        // entering email
        EnterText(By.xpath("//input[@name='Email']"), "falgunip08+" + timeStamp() + "@gamil.com");
        // entering password
        EnterText(By.xpath("//input[@name='Password']"), "123456f");
        // entering confirmpassword
        EnterText(By.id("ConfirmPassword"), "123456f");
        // click on register
        clickOnElements(By.id("register-button"));
       // verify userShouldAbleToRegisterSuccessfully
       String actual = getTextFromelements(By.className("result"));
        Assert.assertEquals("Failed", expected, actual);



        }


    }



