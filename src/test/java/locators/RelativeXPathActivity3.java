package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class RelativeXPathActivity3 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(), 'Create')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();
        Thread.sleep(1000);

        List<WebElement> errorElements = driver.findElements(By.xpath("//*[@class='error']"));
        for (WebElement element : errorElements) {
            System.out.println(element.getText());
        }
        System.out.println("******** *********");


        List<WebElement> errorElementsExample = driver.findElements(By.className("error"));

        for (WebElement element : errorElementsExample) {
            System.out.println(element.getText());
        }


        driver.quit();


    }
}
