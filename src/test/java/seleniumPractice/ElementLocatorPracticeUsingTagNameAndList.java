package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementLocatorPracticeUsingTagNameAndList {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@class= 'search__input']")).sendKeys("Keyboard");
        driver.findElement(By.xpath("//button[@class= 'search__btn']")).click();
        Thread.sleep(1000);
        List < WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='products__layout']//p[@class='products__name']"));
        int countOfItems = listOfElements.size();
        if (countOfItems ==3){
            System.out.println("The result is as I expected.");
        }
        else{
            System.out.println("Not as I expected.");
        }
        for (WebElement element: listOfElements){
            System.out.println(element.getText());
        }
        Thread.sleep(1000);
        driver.quit();


    }
}
