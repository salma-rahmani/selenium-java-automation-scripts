package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class BrowserSelectionUsingScanner {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.print("Which browser do you want to choose? chrome/edge? ");
        String userInput = input.next();


        WebDriver driver = null;

        if (userInput.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (userInput.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://dev.retail.tekschool-students.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.quit();

    }
}