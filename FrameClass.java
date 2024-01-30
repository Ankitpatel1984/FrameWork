import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FrameClass {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }

    @Test(priority = 2)
    void register() {

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ankit");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("Test12345@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Tester123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Tester123");
        driver.findElement(By.id("register-button")).click();
    }

    @Test(priority = 3)
    void login() {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys("Test12345@gmail.com");
        driver.findElement(By.className("password")).sendKeys("Tester123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

    @Test(priority = 4)
    void productPage() {
        driver.findElement(By.id("small-searchterms")).sendKeys("Desktops");
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        driver.findElement(By.id("add-to-cart-button-3")).click();


    }

    @Test(priority = 5)
    void shipping() {
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("terms-of-service")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("7 Welford Place");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("LE7 3PU");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0771234567");


        driver.findElement(By.xpath("//*[@id=\"checkout-billing-load\"]/div/div[1]/p/label")).click();
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.className("button-1 shipping-method-next-step-button")).click();

    }
@Test(priority = 6)
    void payment(){
        driver.findElement(By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[2]/label")).click();
        driver.findElement(By.className("button-1 payment-method-next-step-button")).click();
        driver.findElement(By.id("CardholderName")).sendKeys("Mr A A Patel");
        driver.findElement(By.id("CardNumber")).sendKeys("4921891122408848");
        driver.findElement(By.id("ExpireMonth")).sendKeys("05");
        driver.findElement(By.id("ExpireYear")).sendKeys("2029");
        driver.findElement(By.id("CardCode")).sendKeys("489");
        driver.findElement(By.className("button-1 payment-info-next-step-button")).click();
}

@Test(priority = 7)
    void logout(){
      driver.findElement(By.className("ico-logout")).click();
      driver.close();
}
    }










