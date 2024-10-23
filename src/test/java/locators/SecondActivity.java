package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondActivity {
    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        By subTitleLocator = By.className("top-nav__logo");
        WebElement subTitleElement = driver.findElement(subTitleLocator);

        String result =  subTitleElement.getText();
        System.out.println(result);

        Thread.sleep(2000);
        driver.quit();
    }
}
