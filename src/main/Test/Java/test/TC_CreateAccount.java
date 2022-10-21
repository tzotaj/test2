package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class TC_CreateAccount {

    public void create_account() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/");

        driver.findElement(By.xpath("//a[contains(.,'Sign in')]"));
        driver.findElement(By.id("email_create")).sendKeys("tedi_zotaj@hotmail.com");
        driver.findElement(By.id("SubmitCreate")).click();

        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Tedi");
        driver.findElement(By.id("email")).sendKeys("tedi_zotaj@hotmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345");

        Select drpDay= new Select(driver.findElement(By.id("days")));
        Select drpMonth= new Select(driver.findElement(By.id("months")));
        Select drpYear= new Select(driver.findElement(By.id("years")));
        Select drpState= new Select(driver.findElement(By.id("id_state")));
        Select drpCountry= new Select(driver.findElement(By.id("id_country")));

        drpDay.selectByVisibleText("24");
        drpMonth.selectByVisibleText("July");
        drpYear.selectByVisibleText("1991");

        driver.findElement(By.id("firstname")).sendKeys("Tedi");
        driver.findElement(By.id("lastname")).sendKeys("Zotaj");
        driver.findElement(By.id("company")).sendKeys("Ritech");
        driver.findElement(By.id("address1")).sendKeys("Main Address");
        driver.findElement(By.id("city")).sendKeys("Phoenix");

        drpState.selectByVisibleText("Arizona");
        drpCountry.selectByVisibleText("United States");
        driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.id("phone_mobile")).sendKeys("06012341234");

        driver.findElement(By.id("submitAccount")).click();
        driver.close();


    }
}
