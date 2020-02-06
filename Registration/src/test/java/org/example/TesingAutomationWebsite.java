package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TesingAutomationWebsite {
    static protected WebDriver driver;


    @Test
    public void UserShouldAbleToRegisterOnTescoWebsite()
    {
   // open browser
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sunny\\Documents\\allhomework\\Registration\\src\\test\\java\\org\\example\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.asda.com/");
//    driver.findElement(By.className("optanon-allow-all accept-cookies-button")).click();
   // driver.findElement(By.xpath("//a[contains(text(),Groceries)]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/ul[2]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/header/div/div/div/div[2]/div/div[3]/a")).click();
        // enter email
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("asdf@gmail.com");
        driver.findElement(By.xpath("//input[@class='show-password  error']")).sendKeys("asdf123");
       // enter post code
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[4]/div/input")).sendKeys("Hp2 4Ba");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[1]/span")).click();
     // click box
  driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[2]/span")).click();
driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/button")).click();
    }

    @Test
    public void UserShouleBeRegister() {
       // open the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\Documents\\allhomework\\Registration\\src\\test\\java\\org\\example\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // type url
        driver.get("https://www.boots.com/");
      // enter Register
        driver.findElement(By.xpath("//*[@id=\"signInQuickLink\"]/span")).click();
       // click new customre register
        driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[2]/div[3]/a/input")).click();
       // click title
        driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-38386608118341500\"]")).click();
       // type first name
        driver.findElement(By.cssSelector("input#gigya-textbox-130487327125939400")).sendKeys("falguni");
      // type last name
        driver.findElement(By.xpath("//input[@id=\"gigya-textbox-9480956395172724\"]")).sendKeys("patel");
       // type email
        driver.findElement(By.xpath("//input[@id=\"gigya-loginID-84608206590771100\"]")).sendKeys("falgunip'gamil.com");
      // type pass word
        driver.findElement(By.xpath("//input[@id=\"gigya-password-142081691598547540\"]")).sendKeys("asdfgh12");
       // type conform pass word
        driver.findElement(By.xpath("//input[@id=\"gigya-password-68140718006804320\"]")).sendKeys("asdfgh12");
     // click box
        driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div[3]/div[1]/label")).click();
      // clock box
        driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div[3]/div[2]/label")).click();
     // create my account
        driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div[3]/div[5]/input")).click();


    }


 @Test

    public void UserShouldSignIn()
 {

     // open the browser
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\Documents\\allhomework\\Registration\\src\\test\\java\\org\\example\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     // type url
     driver.get("https://www.topshop.com/login");
    // click signin
      driver.findElement(By.xpath("//h3[@class='Login-header']")).click();
      // type email
     driver.findElement(By.xpath("//input[@id='Login-email']")).sendKeys("falgunip08@gmail.com");
    // enter password
    driver.findElement(By.xpath("//input[@id='Login-password']")).sendKeys("123456");
  // click box
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/section/section/div[1]/section[1]/form/label/span[1]/span")).click();

 }
 @Test

 public void UserShouldRegisterocadoWebsite() {

     // open the browser
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\Documents\\allhomework\\Registration\\src\\test\\java\\org\\example\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     // type url
     driver.get("https://www.ocado.com/");
     // click register in website
     driver.findElement(By.cssSelector("a#quickReg")).click();
     driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Mrs");
    //type First name
     driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("jia");
    // Last name
     driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("jalavadia");
   // email
     driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("falgunip@gamil");
   // write min 5 carecter password
     driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ASD23");
   // write postcode
     driver.findElement(By.xpath("//input[@id=\"postcode\"]")).sendKeys("hp2 4ba");

 }
   @Test
    public void UserShouldCreatAccount() {

       // open the browser
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\Documents\\allhomework\\Registration\\src\\test\\java\\org\\example\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // type url
       driver.get("https://www.poojasweets.com/");
       //clicl on create account
       driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]")).click();
       // type first name
       driver.findElement(By.cssSelector("input#FirstName")).sendKeys("sundeep");
      // type last name
       driver.findElement(By.cssSelector("input#LastName")).sendKeys("patel");
      //type email
      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("falgunip@gmail.com");
      // type password
       driver.findElement(By.cssSelector("input#CreatePassword")).sendKeys("asdfgh12");

   }



    }


