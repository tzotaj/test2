package test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class TC_Login {

    public void login_test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/");

        driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();

        driver.findElement(By.id("email")).sendKeys("tedizotaj@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345");

        driver.findElement(By.id("SubmitLogin")).click();


    }

}
