package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorsPracticeUsingRelativeXPath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@class = 'top-nav__btn']")).click();
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("selma.1390@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("password123!!");
        driver.findElement(By.xpath("//button[@id = 'loginBtn']")).click();
        Thread.sleep(1000);
        String errorMessage = driver.findElement(By.xpath("//div[contains(text(), 'wrong')]")).getText();
        System.out.println(errorMessage);
        Thread.sleep(1000);
        driver.quit();


    }

}
