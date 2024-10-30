package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ListOfErrorMessagesUsingListAndXPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()= 'Sign in']")).click();
        driver.findElement(By.xpath("//a[contains (text(), 'Create')]")).click();
        driver.findElement(By.xpath("//button[text()= 'Sign Up']")).click();
        Thread.sleep(1000);
        List<WebElement> errorMessages = driver.findElements(By.xpath("//div[@class= 'error']"));
        for (WebElement element: errorMessages) {
            System.out.println(element.getText());
        }
        driver.quit();

    }
}
