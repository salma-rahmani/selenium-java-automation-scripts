package ClassActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityOne {
    public static void main(String[] args) throws InterruptedException {

        String dropDownUrl = "https://www.amazon.ca";
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(dropDownUrl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        WebElement helloSignInButton = driver.findElement(By.xpath("//a[@id ='nav-link-accountList']"));

        action.moveToElement(helloSignInButton).perform();

        WebElement signInButton = driver.findElement(By.xpath("//div[@id= 'nav-flyout-ya-signin']/a[@class='nav-action-signin-button']/span[@class = 'nav-action-inner']"));
        action.click(signInButton).perform();
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"));

        WebElement emailElement = driver.findElement(By.xpath("//input[@id ='ap_email']"));
        boolean isDisplayed = emailElement.isDisplayed();

        if (isDisplayed) {
            System.out.println("Yes");
        } else {
            System.out.println("Not.");
        }

        Thread.sleep(4000);

        driver.close();
        driver.quit();

    }
}
