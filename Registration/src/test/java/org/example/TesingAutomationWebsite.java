package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TesingAutomationWebsite
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
   {driver.quit();}

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

    public void clickOnElements(By by) {
        driver.findElement(by).click();}

    public void clearAndEnterText(By by, String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public void EnterText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromelements(By by) {
        return driver.findElement(by).getText();
    }

    @Test
    public void UserShouldAbleToRegisterOnTescoWebsite() {
        //open browser
        driver.get("https://www.asda.com/");
        //driver.findElement(By.className("optanon-allow-all accept-cookies-button")).click();
        //driver.findElement(By.xpath("//a[contains(text(),Groceries)]")).click();
        // cliclk Groseries
        clickOnElements(By.xpath("//*[@id=\"root\"]/div/nav/div/ul[2]/li[1]/a"));

        clickOnElements (By.xpath("//*[@id=\"root\"]/main/header/div/div/div/div[2]/div/div[3]/a"));
        // enter email
        EnterText(By.xpath("//input[@type=\"email\"]"),"kakoveb149@qmailers.com");
        //enter password
       EnterText(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[2]/div/input"),"Test1234test");
       // enter post code
        EnterText(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[4]/div/input"),"Hp2 4Ba");
        clickOnElements (By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[1]/span"));
        // click box
        clickOnElements (By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[2]/span"));
        clickOnElements (By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/button"));
        String actual=getTextFromelements (By.className("welcome-message__title"));
        String asdaExpected = "Welcome to Asda Groceries";
        Assert.assertEquals("Failed", asdaExpected, actual);



    }

    @Test
    public void UserShouleBeRegister() {
        // type url
        driver.get("https://www.boots.com/");
      // enter Register
        clickOnElements(By.xpath("//*[@id=\"signInQuickLink\"]/span"));
       // click new customre register
       clickOnElements(By.xpath("//*[@id=\"gigya-login-form\"]/div[2]/div[3]/a/input"));
       // click title
       selectByValue(By.xpath("//*[@id=\"gigya-dropdown-38386608118341500\"]"));
       // type first name
      EnterText(By.cssSelector("input#gigya-textbox-130487327125939400"),"falguni");
      // type last name
        EnterText(By.xpath("//input[@id=\"gigya-textbox-9480956395172724\"]"),"patel");
       // type email
       EnterText(By.xpath("//input[@id=\"gigya-loginID-84608206590771100\"]"),"falgunip@gamil.com");
      // type pass word
        EnterText(By.xpath("//input[@id=\"gigya-password-142081691598547540\"]"),"asdfgh12");
       // type conform pass word
       EnterText(By.xpath("//input[@id=\"gigya-password-68140718006804320\"]"),"asdfgh12");
     // click box
       clickOnElements(By.xpath("//*[@id=\"gigya-register-form\"]/div[3]/div[1]/label"));
      // clock box
        clickOnElements(By.xpath("//*[@id=\"gigya-register-form\"]/div[3]/div[2]/label"));
     // create my account
        clickOnElements(By.xpath("//*[@id=\"gigya-register-form\"]/div[3]/div[5]/input"));


    }

    private void selectByValue(By xpath) {
    }


    @Test

    public void UserShouldSignIn()
 {
     // type url
     driver.get("https://www.topshop.com/login");
    // click signin
     clickOnElements(By.cssSelector("span.AccountIcon-icon"));
      // type email
     EnterText(By.xpath("//input[@id='Login-email']"), "falgunip08" + timeStamp() + "@gmail.com");
    // enter password
    EnterText(By.xpath("//input[@id='Login-password']"),"123456");
  // click box
   clickOnElements(By.xpath("//*[@id=\"root\"]/div/div[5]/div[2]/section/section/div[1]/section[1]/form/label/span[1]/span"));
   String expected = "user should be signin successfully";
     String actual=getTextFromelements (By.xpath("//p[@class='Message-message']"));
     Assert.assertEquals("Failed", expected, actual);


 }
 @Test

 public void UserShouldRegisterocadoWebsite() {
     // type url
     driver.get("https://www.ocado.com/");
     // click register in website
     clickOnElements(By.cssSelector("a#quickReg"));
     selectByValue(By.xpath("//*[@id=\"title\"]"),"Mrs");
    //type First name
    EnterText(By.xpath("//input[@id='firstName']"),"jia");
    // Last name
    EnterText(By.xpath("//input[@id='lastName']"),"jalavadia");
   // email
   EnterText(By.xpath("//input[@type=\"email\"]"),"falgunip08+" + timeStamp() +"@gamil");
   // write min 5 carecter password
    EnterText(By.xpath("//input[@type=\"password\"]"),"ASD23");
   // write postcode
    EnterText(By.xpath("//input[@id=\"postcode\"]"),"hp2 4ba");
     String expected = "Registered";
     String actual = getTextFromelements(By.xpath("//*[@id=\"content\"]/div[1]/div/h3"));
    Assert.assertEquals("Failed", expected, actual);

 }
   @Test
    public void UserShouldCreatAccount() {

       // open the browser
     //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\Documents\\allhomework\\Registration\\src\\test\\java\\org\\example\\chromedriver.exe");
     //  driver.manage().window().maximize();
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // type url
       driver.get("https://www.poojasweets.com/");
       //clicl on create account
     clickOnElements(By.xpath("//*[@id=\"customer_register_link\"]"));
       // type first name
      EnterText(By.cssSelector("input#FirstName"),"sundeep");
      // type last name
      EnterText(By.cssSelector("input#LastName"),"patel");
      //type email
     EnterText(By.xpath("//input[@type='email']"),"falgunip@gmail.com");
      // type password
       EnterText(By.cssSelector("input#CreatePassword"),"asdfgh12");
       String expected = "Registered";
       // iam not a robot coming after create account
         String actual = getTextFromelements(By.xpath("shopify-challenge__message"));
         Assert.assertEquals("Failed", expected, actual);

   }



    }


